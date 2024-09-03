package unboundidb4j;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;

import java.util.*;
import java.text.ParseException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;
import com.unboundid.ldap.sdk.RootDSE;
import com.unboundid.ldap.sdk.Attribute;

@Version(1.00f)
@ShortName("UNBOUNDID4B4J")
@DependsOn(values={"unboundid-ldapsdk"})

public class UNBOUNDID4B4J {

    public static String Message = "";
    public static String SearchBase = "";
    public static String SearchFilter = "";
    public static String SearchAttributes = "";
    public static List<String> SearchResult = new ArrayList<>();
    public static String pgpBaseKeyspaceDN = "";
    
    private static final LDAPConnection connection = new LDAPConnection();
    private static String Host = "";
    private static int Port = 0;
    private static List<String> RootDSE = new ArrayList<>();
    
    public boolean WriteToLog = false;
    private PrintWriter logwriter;

    
    public String OpenLogwriter(String filename) {
        try {
            logwriter= new PrintWriter(filename);
            logwriter.println("logging started");
            WriteToLog = true;
            return "";
        } catch (FileNotFoundException e) {
            WriteToLog= false;
            return e.getMessage();
        }
    }
    public void CloseLogwriter () {
        if (WriteToLog == true) {
            logwriter.flush();
            logwriter.close();
        }
    }
    private void writetolog(String txt) {
        logwriter.println(txt); 
        logwriter.flush();
    }

    
    public boolean GetpgpBaseKeyspaceDN(String host, int port) {
        Host= host;
        Port= port;
        Boolean passed;

        /* connect to the server */
        passed= Connect();
        if (passed == false) {
            Disconnect();
            return false;
        }

        /* get GetpgpBaseKeyspaceDN from PGPServerInfo */
        passed= GetpgpBaseKeyspaceDN();
        if (passed == false) {
            Disconnect();
            return false;
        } else {
            return true;
        }
    }
    public String GetpgpKey(String host, int port, String pgpUserID) {

        Host= host;
        Port= port;
        SearchFilter = "pgpUserID=" + pgpUserID; 
        Boolean passed;

        /* connect to the server */
        passed= Connect();
        if (passed == false) {
            Disconnect();
            return "Error: " + Message;
        }
        
        /* get GetpgpBaseKeyspaceDN from PGPServerInfo */
        passed= GetpgpBaseKeyspaceDN();
        if (passed == false) {
            Disconnect();
            return Message;
        }
        
        /* search key in pgpBaseKeyspaceDN */
        SearchBase = pgpBaseKeyspaceDN;
        SearchAttributes = "pgpKey";
        passed= Search();
        if (passed == false) {
            Disconnect();
            return "Error: " + Message;
        } else if (SearchResult.isEmpty()) {
            Disconnect();
            return "Error: key not found";
        } else if (SearchResult.size() > 1) {
            Disconnect();
            return "Error: multiple keys found";
        } else {
            String pgpKey = SearchResult.get(0);
            if (pgpKey.contains("pgpKey::") == true) {
                String pgpKeyAsbase64= pgpKey.substring(pgpKey.indexOf("pgpKey::"));
                pgpKeyAsbase64= pgpKeyAsbase64.substring(pgpKeyAsbase64.indexOf(" "));
                pgpKeyAsbase64= pgpKeyAsbase64.trim();
                try {
                    pgpKey= com.unboundid.util.Base64.decodeToString(pgpKeyAsbase64);
                }
                catch (Exception e) {
                    Disconnect();
                    return "Error: invalid Base64.decodeToString";
                }
            } else if (pgpKey.contains("pgpKey:") == true) {
                pgpKey= pgpKey.substring(pgpKey.indexOf("pgpKey:"));
                pgpKey= pgpKey.substring(pgpKey.indexOf(" "));
                pgpKey= pgpKey.trim();
            }
            Disconnect();
            return pgpKey;
        } 
    }
    public String RemovepgpKey(String host, int port, String bindDN, String password, String pgpUserID) {

        Host= host;
        Port= port;
        SearchFilter = "pgpUserID=" + pgpUserID; 
        Boolean passed;

        /* connect to the server */
        passed= Connect();
        if (passed == false) {
            Disconnect();
            return "";
        }

        /* authenticate */
        try {
            connection.bind(bindDN, password);
        }
        catch (LDAPException le) {
            Disconnect();
            Message= "Error authenticating server: " + le.getMessage();
            return "";
        }
        
        /* get GetpgpBaseKeyspaceDN from PGPServerInfo */
        passed= GetpgpBaseKeyspaceDN();
        if (passed == false) {
            Disconnect();
            return "";
        }
        
        /* search key(s) in pgpBaseKeyspaceDN */
        List<String> removekeys = new ArrayList<>();
        SearchBase = pgpBaseKeyspaceDN;
        SearchAttributes = "pgpCertID";
        passed= Search();
        if (passed == false) {
            Disconnect();
            return "";
        } else if (SearchResult.isEmpty()) {
            Disconnect();
            Message= "Error: no keys found";
            return "";
        } else {
            for (int i = 0; i < SearchResult.size(); i++) {
                String pgpCertID = SearchResult.get(i);
                if (pgpCertID.contains("pgpCertID:") == true) {
                    pgpCertID= pgpCertID.substring(pgpCertID.indexOf("pgpCertID:"));
                    pgpCertID= pgpCertID.substring(pgpCertID.indexOf(" "));
                    pgpCertID= pgpCertID.trim();
                    String dn= "pgpCertID=" + pgpCertID + "," + SearchBase;
                    removekeys.add(dn);
                }
            }
        }
        
        /* remove key(s) */
        if (removekeys.isEmpty()) {
            Disconnect();
            Message= "Error: no keys found";
            return "";
        } else {
            StringBuilder sbpassed= new StringBuilder();
            StringBuilder sbfailed= new StringBuilder();
            for (int i = 0; i < removekeys.size(); i++) {
                String dn = removekeys.get(i);
                try {
                    connection.delete(dn);
                    sbpassed.append("removed key ").append(dn).append("\r\n");
                }
                catch (LDAPException le) {
                    sbfailed.append("Error removing key ").append(dn).append("\r\n");
                    sbfailed.append(le.getMessage()).append("\r\n");
                }
            }
        Message= sbfailed.toString();
        return sbpassed.toString();
        }
    }
    public boolean AddpgpKey(String host, int port, String bindDN, String password, String dn, String[][] properties) {

        Host= host;
        Port= port;
        Boolean passed;

        /* connect to the server */
        passed= Connect();
        if (passed == false) {
            Disconnect();
            return false;
        }

        /* authenticate */
        try {
            connection.bind(bindDN, password);
        }
        catch (LDAPException le) {
            Disconnect();
            Message= "Error authenticating server: " + le.getMessage();
            return false;
        }
        
        /* get GetpgpBaseKeyspaceDN from PGPServerInfo */
        passed= GetpgpBaseKeyspaceDN();
        if (passed == false) {
            Disconnect();
            return false;
        }

        /* create new entry */
        Attribute[] attributes;
        attributes = new Attribute[properties.length];
        try {
            for (int i = 0; i < properties.length; i++) {
                attributes[i] = new Attribute(properties[i][0], properties[i][1]);
            }
        }
        catch (Exception e) {
            Disconnect();
            Message= "Error while converting properties to attributes: " + e.getMessage();
            return false;
        }

        /* add new entry */
        try {
            connection.add(dn, attributes);
            Disconnect();
            return true;
        }
        catch (LDAPException le) {
            Message= "Error adding key: " + le.getMessage();
            return false;
        }
        catch (Exception e) {
            Disconnect();
            Message= "Error adding key: " + e.getMessage();
            return false;
        }

    }
    public String ListpgpKeys(String host, int port, String mask) {
        
        Host= host;
        Port= port;
        SearchFilter = "pgpUserID=" + mask; 
        Boolean passed;

        /* connect to the server */
        if (connection.isConnected()== false) {
            passed= Connect();
            if (passed == false) {
                Disconnect();
                return "Error: " + Message;
            }
        }
        
        /* get GetpgpBaseKeyspaceDN from PGPServerInfo */
        passed= GetpgpBaseKeyspaceDN();
        if (passed == false) {
            Disconnect();
            return Message;
        }

        StringBuilder sb = new StringBuilder();
        String result;
        String searchfor = mask + "*";
        if (WriteToLog == true) {
            writetolog("searching for [" + searchfor + "]");
        }
        result= listpgpkeys(mask + "*");
        if (WriteToLog == true) {
            writetolog("result:");
            writetolog(result);
        }
        if (result.contains("size limit exceeded") == false) {
            Disconnect();
            return result;
        } else {
            String submask;
            for (int i = 48; i < 58; i++) {
                submask = mask + String.valueOf(Character.toChars(i));
                result= ListpgpKeys(host, port, submask);
                sb.append(result);
            }
            for (int i = 97; i < 123; i++) {
                submask = mask + String.valueOf(Character.toChars(i));
                result= ListpgpKeys(host, port, submask);
                sb.append(result);
            }
        }

        Disconnect();
        return sb.toString();
                
    }

    
    private String listpgpkeys(String mask) {

        SearchFilter = "pgpUserID=" + mask; 
        Boolean passed;

        /* search keys in pgpBaseKeyspaceDN */
        SearchBase = pgpBaseKeyspaceDN;
        SearchAttributes = "pgpUserID";
        passed= Search();
        if (passed == false) {
            return "Error: " + Message;
        } else if (SearchResult.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < SearchResult.size(); i++) {
                String pgpUserID = SearchResult.get(i);
                if (pgpUserID.contains("pgpUserID::") == true) {
                    String pgpUserIDAsbase64= pgpUserID.substring(pgpUserID.indexOf("pgpUserID::"));
                    pgpUserIDAsbase64= pgpUserIDAsbase64.substring(pgpUserIDAsbase64.indexOf(" "));
                    pgpUserIDAsbase64= pgpUserIDAsbase64.trim();
                    try {
                        pgpUserID= com.unboundid.util.Base64.decodeToString(pgpUserIDAsbase64);
                        sb.append(pgpUserID).append("\r\n");
                    }
                    catch (ParseException e) {
                        /* this entry is ignored */
                    }
                } else if (pgpUserID.contains("pgpUserID:") == true) {
                    pgpUserID= pgpUserID.substring(pgpUserID.indexOf("pgpUserID:"));
                    pgpUserID= pgpUserID.substring(pgpUserID.indexOf(" "));
                    pgpUserID= pgpUserID.trim();
                    sb.append(pgpUserID).append("\r\n");
                }
            }
            return sb.toString();
        } 
    }
    private boolean Connect() {
        try {
          connection.connect(Host, Port);
          Message= "Connecting to server";
          return Boolean.TRUE;
        }
        catch (LDAPException le) {
          Message= "Error connecting to server: " + le.getMessage();
          return Boolean.FALSE;
        }
        catch (Exception e) {
          Message= "Error connecting to server: " + e.getMessage();
          return Boolean.FALSE;
        }
    }
    private boolean Disconnect() {
        try {
          connection.close();
          return Boolean.TRUE;
        }
        catch (Exception e) {
          Message= "Error disconnecting from server: " + e.getMessage();
          return Boolean.FALSE;
        }
    }
    private boolean GetEntry(String dn, String attributes) {
        SearchResult.clear();
        SearchResultEntry result;
        if (attributes.equals("")== true) {
            try {
                result= connection.getEntry(dn);
            }
            catch (LDAPException le) {
              Message= "Error GetEntry: " + le.getMessage();
              return Boolean.FALSE;
            }
            catch (Exception e) {
              Message= "Error GetEntry: " + e.getMessage();
              return Boolean.FALSE;
            }
            try {
                SearchResult.add(result.toLDIFString());
            }
            catch (Exception e) {
              Message= "Error GetEntry: " + e.getMessage();
              return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } else {
            try {
                result= connection.getEntry(dn, attributes);
            }
            catch (LDAPException le) {
              Message= "Error GetEntry: " + le.getMessage();
              return Boolean.FALSE;
            }
            catch (Exception e) {
              Message= "Error GetEntry: " + e.getMessage();
              return Boolean.FALSE;
            }
            try {
                SearchResult.add(result.toLDIFString());
            }
            catch (Exception e) {
              Message= "Error GetEntry: " + e.getMessage();
              return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }
    private boolean Search() {
        SearchResult.clear();
        SearchResult result;
        if (SearchAttributes.equals("")) {
            try {
                result = connection.search(SearchBase, SearchScope.SUB, SearchFilter);
            }
            catch (LDAPException le) {
              Message= "Error Search: " + le.getMessage();
              return Boolean.FALSE;
            }
        } else {
            try {
                result = connection.search(SearchBase, SearchScope.SUB, SearchFilter, SearchAttributes);
            }
            catch (LDAPException le) {
              Message= "Error Search: " + le.getMessage();
              return Boolean.FALSE;
            }
        } 
        result.getSearchEntries().forEach((e) -> {
            SearchResult.add(e.toLDIFString());
        });
        return Boolean.TRUE;
    }
    private boolean GetpgpBaseKeyspaceDN() {

        pgpBaseKeyspaceDN= "";
        Boolean passed;

        /* get PGPServerInfo */
        /* try to get PGPServerInfo from RootDSE */
        passed= GetEntry("cn=PGPServerInfo", "pgpBaseKeyspaceDN");
         if (passed == true) {
            try {
                pgpBaseKeyspaceDN= SearchResult.get(0);
                pgpBaseKeyspaceDN= pgpBaseKeyspaceDN.substring(pgpBaseKeyspaceDN.toLowerCase().indexOf("pgpbasekeyspacedn"));
                pgpBaseKeyspaceDN= pgpBaseKeyspaceDN.substring(pgpBaseKeyspaceDN.indexOf(" ")).trim();
            }
            catch (Exception e) {
                pgpBaseKeyspaceDN= "";
            }    
        }
        
        if (pgpBaseKeyspaceDN.equals("")) {
            /* PGPServerInfo not found in RootDSE */
            /* get the RootDSE */
            passed= GetRootDSE();
            if (passed == false) {
                pgpBaseKeyspaceDN= "";
                return false;
            }
            /* search RootDSE for available namingContexts */
            List<String> namingContexts = new ArrayList<>();
            String searchfor = "namingcontexts:";
            for (int i = 0; i < RootDSE.size(); i++) {
                String entry= RootDSE.get(i);
                if (entry.toLowerCase().startsWith(searchfor) == Boolean.TRUE) {
                    String value= entry.substring(entry.indexOf(" ")).trim();
                    namingContexts.add(value);
                }
            }
            /* search PGPServerInfo in available namingContexts */
            for (int i = 0; i < namingContexts.size(); i++) {
                String dnbase = namingContexts.get(i);
                passed= GetEntry("cn=PGPServerInfo," + dnbase, "pgpBaseKeyspaceDN");
                if (passed == true) {
                    try {
                        pgpBaseKeyspaceDN= SearchResult.get(0);
                        pgpBaseKeyspaceDN= pgpBaseKeyspaceDN.substring(pgpBaseKeyspaceDN.toLowerCase().indexOf("pgpbasekeyspacedn"));
                        pgpBaseKeyspaceDN= pgpBaseKeyspaceDN.substring(pgpBaseKeyspaceDN.indexOf(" ")).trim();
                    }
                    catch (Exception e) {
                        pgpBaseKeyspaceDN= "";
                    }    
                }
                if (pgpBaseKeyspaceDN.equals("") == false) {
                    break;
                }
            }
        }

        if (pgpBaseKeyspaceDN.equals("") == true) {
            Message= "Error: pgpBaseKeyspaceDN not found";
            return false;
        } else {
            Message= "";
            return true;
        }

    }
    private boolean GetRootDSE() {
        RootDSE rootdse;
        try {
            rootdse= connection.getRootDSE();
        }
        catch (LDAPException le) {
          Message= "Error GetRootDSE: " + le.getMessage();
          return Boolean.FALSE;
        }
        catch (Exception e) {
          Message= "Error GetRootDSE: " + e.getMessage();
          return Boolean.FALSE;
        }
        RootDSE= Arrays.asList(rootdse.toLDIF());
        return Boolean.TRUE;
    }

}

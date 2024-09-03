package imldapserver;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;

import com.unboundid.ldap.sdk.schema.Schema;
import com.unboundid.ldap.listener.InMemoryDirectoryServer;
import com.unboundid.ldap.listener.InMemoryDirectoryServerConfig;
import com.unboundid.ldap.listener.InMemoryListenerConfig;
import com.unboundid.ldap.listener.interceptor.*;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.ResultCode;
import com.unboundid.ldap.sdk.SearchRequest;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
import java.util.List;
import java.util.ArrayList;

@Version(1.00f)
@ShortName("IMLDAPSERVER4B4J")
@DependsOn(values={"unboundid-ldapsdk"})

public class IMLDAPSERVER4B4J {
    
    private static InMemoryDirectoryServer server;
    private static InMemoryDirectoryServerConfig config;
    private static myInMemoryOperationInterceptor interceptor;
    private static Schema schema;
    private static final Logger logger= Logger.getLogger(IMLDAPSERVER4B4J.class.getSimpleName());
    private static Handler filehandlerlogger;  
    private static Handler consolehandlerlogger; 
    private static LocalTime lastwrittentomylog;
    
    public String ErrorMessage = "";
    public String NameLogfile = "";
    public boolean LogToConsole = false;
   
    public boolean Configure(int port, String BaseDN, String filenameschema, String VendorName, String VendorVersion, String Bind, String Password) {

        if (ReadSchemaFromFile(filenameschema)) {
            interceptor = new myInMemoryOperationInterceptor();
            try {
                config = new InMemoryDirectoryServerConfig(BaseDN);
                config.setListenerConfigs(InMemoryListenerConfig.createLDAPConfig("ClientListener", port));
                config.setVendorName(VendorName);
                config.setVendorVersion(VendorVersion);
                config.setSchema(schema);
                config.addAdditionalBindCredentials(Bind, Password);
                config.addInMemoryOperationInterceptor(interceptor);
                server = new InMemoryDirectoryServer(config);
                return true;
            } catch (LDAPException e) {
                ErrorMessage= e.getExceptionMessage();
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean ImportFromLDIF(boolean Clear, String Filename) {
        try {
            server.importFromLDIF(Clear, Filename);
            return true;
        } catch (LDAPException e) {
            ErrorMessage= e.getExceptionMessage();
            return false;
        }
    }
    public boolean Start() {
        if (!StartLogger()) {
            // start logger failed
            return false;            
        } else {
            //start listening Server
            try {
                server.startListening();
                myLogger("Keyserver started");
                return true;
            } catch (LDAPException e) {
                ErrorMessage= e.getExceptionMessage();
                return false;
            }
        }
    }
    public boolean Stop() {
        //last log message
        myLogger("Keyserver stopped");
        //stop logging
        StopLogger();
        //stop server
        try {
            server.shutDown(true);
            return true;
        } catch (Exception e) {
            ErrorMessage= e.getMessage();
            return false;
        }
    }

    private void myLogger(String message) {
        if (!NameLogfile.equals("")) {
            // check if new day started
            if (lastwrittentomylog.isAfter(LocalTime.now())) {
                // a new day started and a new logfile must be created
                StopLogger();
                StartLogger();
                // log to the new file
                logger.info(message);
                lastwrittentomylog = LocalTime.now();
            } else {
                // keep the same logfile
                logger.info(message);
                lastwrittentomylog = LocalTime.now();
            }
        }
    }
    private boolean StartLogger() {
        //configure logging
        logger.setUseParentHandlers(false);
        if (!NameLogfile.equals("") || LogToConsole) {
            logger.setLevel(Level.ALL);
        } else {
            logger.setLevel(Level.OFF);
        }
        //configure writing logging to file
        if (!NameLogfile.equals("")) {
            try {
                /*
                Generating rotated log files:
                
                the constructor creates a FileHandler with a file name pattern, a file size limit, and a file count.
                When the log files reach the given file size limit a new file is created, until the maximum of the file 
                count is reached. Then the FileHandler starts over with the first file again, deleting it and logging to 
                it from scratch.
                
                %g: the generation number that distinguishes the rotated log files from each other
                1024 * 1024: size generated logfile (1Mb)
                100: max count generated logfiles
                */
                DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
                String formattedDate = formatter.format(LocalDate.now());
                filehandlerlogger = new FileHandler(NameLogfile + "." + formattedDate + ".%g.log", 1024 * 1024, 100); 
                filehandlerlogger.setLevel(Level.ALL);
                filehandlerlogger.setFormatter(new Formatter() {
                    @Override
                    public String format(LogRecord record) {
                        //Get timestamp current date time
                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                        String timestamp = now.format(formatter);
                        return timestamp + "   " + record.getMessage() + System.lineSeparator();
                    }
                });                
                logger.addHandler(filehandlerlogger);
                lastwrittentomylog = LocalTime.now();
            } catch (SecurityException | IOException e) {  
                ErrorMessage= e.getMessage();
                return false;
            }  
        }
        //configure logging to console
        if (LogToConsole) {
            consolehandlerlogger = new ConsoleHandler();  
            consolehandlerlogger.setLevel(Level.ALL);
            consolehandlerlogger.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    //Get timestamp current date time
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    String timestamp = now.format(formatter);
                    return timestamp + "   " + record.getMessage() + System.lineSeparator();
                }
            });                
            logger.addHandler(consolehandlerlogger);
        }
        return true;
    }
    private void StopLogger() {
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.OFF);
        if (!NameLogfile.equals("")) {
            filehandlerlogger.flush();
            filehandlerlogger.close();
            logger.removeHandler(filehandlerlogger);
        }
        if (LogToConsole) {
            logger.removeHandler(consolehandlerlogger);
        }
    }
            
    private boolean ReadSchemaFromFile(String filename) {
        try {
            File file;
            file = new File(filename);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream is = new ObjectInputStream(fis);
                schema = (Schema) is.readObject();
                is.close();
                fis.close();
                return true;
            } else {
                ErrorMessage= "file " + filename + " not found";
                return false;
            }
        } catch (IOException | ClassNotFoundException e) {
            ErrorMessage= e.getMessage();
            return false;
        }
    }
    private class myInMemoryOperationInterceptor extends InMemoryOperationInterceptor {

        @Override
        @SuppressWarnings("LoggerStringConcat")
        public void processAddRequest(InMemoryInterceptedAddRequest request) throws LDAPException {
            myLogger("Receive AddRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("AddRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        } 
        @Override
        public void processAddResult(InMemoryInterceptedAddResult result){
            myLogger("Return AddResult" +  System.lineSeparator() + result.toString());
        } 
        @Override
        public void processCompareRequest(InMemoryInterceptedCompareRequest request) throws LDAPException {
            myLogger("Receive CompareRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("CompareRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processCompareResult(InMemoryInterceptedCompareResult result) {
            myLogger("Return CompareResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processDeleteRequest(InMemoryInterceptedDeleteRequest request) throws LDAPException {
            myLogger("Receive DeleteRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("DeleteRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processDeleteResult(InMemoryInterceptedDeleteResult result) {
            myLogger("Return DeleteResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processExtendedRequest(InMemoryInterceptedExtendedRequest request) throws LDAPException {
            myLogger("Receive ExtendedRequest" +  System.lineSeparator() + request.toString());
        }
        @Override
        public void processExtendedResult(InMemoryInterceptedExtendedResult result) {
            myLogger("Return ExtendedResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processIntermediateResponse(InMemoryInterceptedIntermediateResponse response) {
            myLogger("Return IntermediateResponse" +  System.lineSeparator() + response.toString());
        }
        @Override
        public void processModifyDNRequest(InMemoryInterceptedModifyDNRequest request) throws LDAPException {
            myLogger("Receive ModifyDNRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("ModifyDNRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processModifyDNResult(InMemoryInterceptedModifyDNResult result) {
            myLogger("Return ModifyDNResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processModifyRequest(InMemoryInterceptedModifyRequest request) throws LDAPException {
            myLogger("Receive ModifyRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("ModifyRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processModifyResult(InMemoryInterceptedModifyResult result) {
            myLogger("Return ModifyResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processSASLBindRequest(InMemoryInterceptedSASLBindRequest request) throws LDAPException {
            myLogger("Receive SASLBindRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("SASLBindRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processSASLBindResult(InMemoryInterceptedSASLBindResult result) {
            myLogger("Return SASLBindResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processSearchEntry(InMemoryInterceptedSearchEntry entry) {
            myLogger("SearchEntry" +  System.lineSeparator() + entry.toString());
        }
        @Override
        public void processSearchReference(InMemoryInterceptedSearchReference reference) {
            myLogger("SearchReference" +  System.lineSeparator() + reference.toString());
        } 
        @Override
        public void processSearchRequest(InMemoryInterceptedSearchRequest request) throws LDAPException {
            myLogger("Receive SearchRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                // request not from local client ==> modify searching user keys 
                String filter= request.getRequest().getFilter().toString();
                if (filter.toLowerCase().startsWith("(pgpuserid=")) {
                    SearchRequest modifiedSearchRequest= request.getRequest().duplicate();
                    // setSizeLimit(1) => return only 1 key
                    modifiedSearchRequest.setSizeLimit(1);
                    // filter userid for testing
                    if (filter.contains("test@test.test")) {
                        modifiedSearchRequest.setFilter("(pgpUserID=*testiphone@smessenger.eu*)");
                        myLogger("filter= [" +  filter + "] ==> filter modified to " +  modifiedSearchRequest.getFilter().toString());
                    } else {
                        myLogger("filter= [" +  filter + "]");
                    }
                    // filter attributes for secure group
                    myLogger("attributes= ");
                    List<String> attributes= request.getRequest().getAttributeList();
                    List<String> modifiedattributes = new ArrayList<String>();
                    for(int i=0; i<attributes.size(); i++){
                        if (attributes.get(i).toLowerCase().startsWith("pgpkey ")) {
                            modifiedattributes.add("pgpKey");
                            myLogger(i + "  [" + modifiedattributes.get(i) + "] ==> attribute modified to [" + modifiedattributes.get(i) + "]");
                        } else {
                            modifiedattributes.add(attributes.get(i));
                            myLogger(i + "  [" + modifiedattributes.get(i) + "]");
                        }
                    }
                    modifiedSearchRequest.setAttributes(modifiedattributes);
                    request.setRequest(modifiedSearchRequest);
                    for(int i=1; i<attributes.size(); i++){
                    }
                }
            }
        }
        @Override
        public void processSearchResult(InMemoryInterceptedSearchResult result) {
            myLogger("Return SearchResult" +  System.lineSeparator() + result.toString());
        }
        @Override
        public void processSimpleBindRequest(InMemoryInterceptedSimpleBindRequest request) throws LDAPException {
            myLogger("Receive SimpleBindRequest" +  System.lineSeparator() + request.toString());
            if (!IsAllowed(request)) {
                LDAPException exception = new LDAPException(ResultCode.INSUFFICIENT_ACCESS_RIGHTS);
                myLogger("SimpleBindRequest refused" +  System.lineSeparator() + exception.toString());
                throw exception;
            }
        }
        @Override
        public void processSimpleBindResult(InMemoryInterceptedSimpleBindResult result) {
            myLogger("Return SimpleBindResult" +  System.lineSeparator() + result.toString());
        }
    }
    private boolean IsAllowed(InMemoryInterceptedRequest request){
        String address= request.getConnectedAddress();
        return address.equals("127.0.0.1");
    }

}


package com.prusb.jCrystalReports;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA.ActivityObject;
import anywheresoftware.b4a.BA.Author;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;
import com.crystaldecisions.sdk.occa.report.application.DatabaseController;
import com.crystaldecisions.sdk.occa.report.application.ReportClientDocument;
import com.crystaldecisions.sdk.occa.report.application.ParameterFieldController;
//import com.crystaldecisions.sdk.occa.report.document.ParameterFieldController;
//import com.crystaldecisions.sdk.occa.report.document.ParameterFieldDiscreteValue;
//import com.crystaldecisions.sdk.occa.report.document.ParameterField;
import com.crystaldecisions.sdk.occa.report.data.ConnectionInfo;
import com.crystaldecisions.sdk.occa.report.data.ConnectionInfoKind;
import com.crystaldecisions.sdk.occa.report.data.Fields;
import com.crystaldecisions.sdk.occa.report.data.IConnectionInfo;
import com.crystaldecisions.sdk.occa.report.document.PaperSize;
import com.crystaldecisions.sdk.occa.report.document.PaperSource;
import com.crystaldecisions.sdk.occa.report.document.PrintReportOptions;
import com.crystaldecisions.sdk.occa.report.document.PrinterDuplex;
import com.crystaldecisions.sdk.occa.report.exportoptions.ReportExportFormat;
import com.crystaldecisions.sdk.occa.report.lib.PropertyBag;
import com.crystaldecisions.sdk.occa.report.lib.ReportSDKException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@ShortName("CrystalReports")
@Version(2.01F)
@Author("Enrique Fortin")
@ActivityObject
public class CrystalReports {
  private static String REPORT_NAME = "";
  
  private static String USERNAME = "";
  
  private static String PASSWORD = "";
  
  private static String SELECTION_FORMULA = "";
  
  private static String TRUSTED_CONN = "";
  
  private static String SERVER_NAME = "";

  private static String SET_PARAMETERS = "";
  
  private static String CONN_URL = "";
  
  private static String DB_NAME = "";
  
  private static String DB_CLASS_NAME = "";
  
  public PaperSize PAPER_10X14 = PaperSize.paper10x14;
  
  public PaperSize PAPER_11X17 = PaperSize.paper11x17;
  
  public PaperSize PAPER_A3 = PaperSize.paperA3;
  
  public PaperSize PAPER_A4 = PaperSize.paperA4;
  
  public PaperSize PAPER_A4_SMALL = PaperSize.paperA4Small;
  
  public PaperSize PAPER_A5 = PaperSize.paperA5;
  
  public PaperSize PAPER_B4 = PaperSize.paperB4;
  
  public PaperSize PAPER_B5 = PaperSize.paperB5;
  
  public PaperSize PAPER_C_SHEET = PaperSize.paperCsheet;
  
  public PaperSize PAPER_D_SHEET = PaperSize.paperDsheet;
  
  public PaperSize PAPER_E_SHEET = PaperSize.paperEsheet;
  
  public PaperSize PAPER_ENVELOPE_9 = PaperSize.paperEnvelope9;
  
  public PaperSize PAPER_ENVELOPE_10 = PaperSize.paperEnvelope10;
  
  public PaperSize PAPER_ENVELOPE_11 = PaperSize.paperEnvelope11;
  
  public PaperSize PAPER_ENVELOPE_12 = PaperSize.paperEnvelope12;
  
  public PaperSize PAPER_ENVELOPE_14 = PaperSize.paperEnvelope14;
  
  public PaperSize PAPER_ENVELOPE_B4 = PaperSize.paperEnvelopeB4;
  
  public PaperSize PAPER_ENVELOPE_B5 = PaperSize.paperEnvelopeB5;
  
  public PaperSize PAPER_ENVELOPE_B6 = PaperSize.paperEnvelopeB6;
  
  public PaperSize PAPER_ENVELOPE_C3 = PaperSize.paperEnvelopeC3;
  
  public PaperSize PAPER_ENVELOPE_C4 = PaperSize.paperEnvelopeC4;
  
  public PaperSize PAPER_ENVELOPE_C5 = PaperSize.paperEnvelopeC5;
  
  public PaperSize PAPER_ENVELOPE_C6 = PaperSize.paperEnvelopeC6;
  
  public PaperSize PAPER_ENVELOPE_C65 = PaperSize.paperEnvelopeC65;
  
  public PaperSize PAPER_ENVELOPE_DL = PaperSize.paperEnvelopeDL;
  
  public PaperSize PAPER_ENVELOPE_ITALY = PaperSize.paperEnvelopeItaly;
  
  public PaperSize PAPER_ENVELOPE_MONARCH = PaperSize.paperEnvelopeMonarch;
  
  public PaperSize PAPER_ENVELOPE_PERSONAL = PaperSize.paperEnvelopePersonal;
  
  public PaperSize PAPER_EXECUTIVE = PaperSize.paperExecutive;
  
  public PaperSize PAPER_FANFOLD_LEGAL_GERMAN = PaperSize.paperFanfoldLegalGerman;
  
  public PaperSize PAPER_FANFOLD_STD_GERMAN = PaperSize.paperFanfoldStdGerman;
  
  public PaperSize PAPER_FANFOLD_US = PaperSize.paperFanfoldUS;
  
  public PaperSize PAPER_FOLIO = PaperSize.paperFolio;
  
  public PaperSize PAPER_LEDGER = PaperSize.paperLedger;
  
  public PaperSize PAPER_LEGAL = PaperSize.paperLegal;
  
  public PaperSize PAPER_LETTER = PaperSize.paperLetter;
  
  public PaperSize PAPER_LETTER_SMALL = PaperSize.paperLetterSmall;
  
  public PaperSize PAPER_NOTE = PaperSize.paperNote;
  
  public PaperSize PAPER_QUARTO = PaperSize.paperQuarto;
  
  public PaperSize PAPER_STATEMENT = PaperSize.paperStatement;
  
  public PaperSize PAPER_TABLOID = PaperSize.paperTabloid;
  
  public ReportExportFormat format_PDF = ReportExportFormat.PDF;
  
  public ReportExportFormat format_CHARACTER_SEPARATED_VALUES = ReportExportFormat.characterSeparatedValues;
  
  public ReportExportFormat format_EDITABLE_RTF = ReportExportFormat.editableRTF;
  
  public ReportExportFormat format_MSEXCEL = ReportExportFormat.MSExcel;
  
  public ReportExportFormat format_MSWORD = ReportExportFormat.MSWord;
  
  public ReportExportFormat format_RTF = ReportExportFormat.RTF;
  
  public ReportExportFormat format_TAB_SEPARATED_TEXT = ReportExportFormat.tabSeparatedText;
  
  public ReportExportFormat format_TEXT = ReportExportFormat.text;
  
  public ReportExportFormat format_XML = ReportExportFormat.XML;
  
  public ReportExportFormat format_RECORD_TO_MSEXCEL = ReportExportFormat.recordToMSExcel;
  
  private PrintService[] printServices = null;
  
  private PrintService printService = null;
  


public void LaunchReportWithParameters() {
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.ERROR);
    try {
      if (REPORT_NAME != "" && USERNAME != "" && SERVER_NAME != "" && CONN_URL != "" && DB_NAME != "" && DB_CLASS_NAME != "") {
        ReportClientDocument reportClientDoc = new ReportClientDocument();
        reportClientDoc.open(REPORT_NAME, 0);
        //ParameterFieldController parameterFieldController = reportClientDoc.getDataDefController().getParameterFieldController();
        //parameterFieldController.setCurrentValue("", "Prefijo", new String ("HN"));
        reportClientDoc.getDatabaseController().logon(getUSERNAME(), getPASSWORD());
        reportClientDoc.getDataDefController().getRecordFilterController().setFormulaText(SELECTION_FORMULA);
         ParameterFieldController parameterFieldController = reportClientDoc.getDataDefController().getParameterFieldController();
        parameterFieldController.setCurrentValue("", "Prefijo", new String ("HN"));
          // Aquí ajusta los parámetros según sea necesario
        ConnectionInfo connectionInfo1 = new ConnectionInfo();
        ConnectionInfo connectionInfo2 = new ConnectionInfo();
        DatabaseController dbController = reportClientDoc.getDatabaseController();
        IConnectionInfo iConnectionInfo = dbController.getConnectionInfos(null).getConnectionInfo(0);
        Fields pFields = null;
        if (TRUSTED_CONN != "true")
          TRUSTED_CONN = "false"; 
        PropertyBag pb = new PropertyBag();
        pb.put("JDBC Connection String", "!" + getDB_CLASS_NAME() + "!" + getCONN_URL());
        pb.put("Trusted_Connection", getTRUSTED_CONN());
        pb.put("PreQEServerName", getCONN_URL());
        pb.put("Server Type", "JDBC (JNDI)");
        pb.put("Database DLL", "crdb_jdbc.dll");
        pb.put("Database", getDB_NAME());
        pb.put("Database Class Name", getDB_CLASS_NAME());
        pb.put("Use JDBC", "true");
        pb.put("Database Name", getDB_NAME());
        pb.put("Server Name", getCONN_URL());
        pb.put("Connection URL", getCONN_URL());
        pb.put("Server", getSERVER_NAME());
        connectionInfo2.setAttributes(pb);
        connectionInfo2.setUserName(getUSERNAME());
        connectionInfo2.setPassword(getPASSWORD());
        connectionInfo2.setKind(ConnectionInfoKind.SQL);
        int replaceParams = 4;
        dbController.replaceConnection(iConnectionInfo, (IConnectionInfo)connectionInfo2, pFields, replaceParams);
      } else {
        System.out.println("Some fields were not filled. REPORT_NAME, USERNAME, SERVER_NAME, CONN_URL, DB_NAME and DB_CLASS_NAME are required.");
      } 
    } catch (ReportSDKException ex) {
      System.out.println(ex);
    } catch (Exception ex) {
      System.out.println(ex);
    } 
  }




  public void LaunchReport() {
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.ERROR);
    try {
      if (REPORT_NAME != "" && USERNAME != "" && SERVER_NAME != "" && CONN_URL != "" && DB_NAME != "" && DB_CLASS_NAME != "") {
        ReportClientDocument reportClientDoc = new ReportClientDocument();
        reportClientDoc.open(REPORT_NAME, 0);
        reportClientDoc.getDatabaseController().logon(getUSERNAME(), getPASSWORD());
        reportClientDoc.getDataDefController().getRecordFilterController().setFormulaText(SELECTION_FORMULA);
        ConnectionInfo connectionInfo1 = new ConnectionInfo();
        ConnectionInfo connectionInfo2 = new ConnectionInfo();
        DatabaseController dbController = reportClientDoc.getDatabaseController();
        IConnectionInfo iConnectionInfo = dbController.getConnectionInfos(null).getConnectionInfo(0);
        Fields pFields = null;
        if (TRUSTED_CONN != "true")
          TRUSTED_CONN = "false"; 
        PropertyBag pb = new PropertyBag();
        pb.put("JDBC Connection String", "!" + getDB_CLASS_NAME() + "!" + getCONN_URL());
        pb.put("Trusted_Connection", getTRUSTED_CONN());
        pb.put("PreQEServerName", getCONN_URL());
        pb.put("Server Type", "JDBC (JNDI)");
        pb.put("Database DLL", "crdb_jdbc.dll");
        pb.put("Database", getDB_NAME());
        pb.put("Database Class Name", getDB_CLASS_NAME());
        pb.put("Use JDBC", "true");
        pb.put("Database Name", getDB_NAME());
        pb.put("Server Name", getCONN_URL());
        pb.put("Connection URL", getCONN_URL());
        pb.put("Server", getSERVER_NAME());
        connectionInfo2.setAttributes(pb);
        connectionInfo2.setUserName(getUSERNAME());
        connectionInfo2.setPassword(getPASSWORD());
        connectionInfo2.setKind(ConnectionInfoKind.SQL);
        int replaceParams = 4;
        dbController.replaceConnection(iConnectionInfo, (IConnectionInfo)connectionInfo2, pFields, replaceParams);
      } else {
        System.out.println("Some fields were not filled. REPORT_NAME, USERNAME, SERVER_NAME, CONN_URL, DB_NAME and DB_CLASS_NAME are required.");
      } 
    } catch (ReportSDKException ex) {
      System.out.println(ex);
    } catch (Exception ex) {
      System.out.println(ex);
    } 
  }
  
  public void PrintReport(PrintService service, PaperSize paperSize, int copies) {
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.ERROR);
    try {
      if (REPORT_NAME != "" && USERNAME != "" && SERVER_NAME != "" && CONN_URL != "" && DB_NAME != "" && DB_CLASS_NAME != "") {
        ReportClientDocument reportClientDoc = new ReportClientDocument();
        reportClientDoc.open(REPORT_NAME, 0);
        reportClientDoc.getDatabaseController().logon(getUSERNAME(), getPASSWORD());
        reportClientDoc.getDataDefController().getRecordFilterController().setFormulaText(SELECTION_FORMULA);
        ConnectionInfo connectionInfo1 = new ConnectionInfo();
        ConnectionInfo connectionInfo2 = new ConnectionInfo();
        DatabaseController dbController = reportClientDoc.getDatabaseController();
        IConnectionInfo iConnectionInfo = dbController.getConnectionInfos(null).getConnectionInfo(0);
        Fields pFields = null;
        if (TRUSTED_CONN != "true")
          TRUSTED_CONN = "false"; 
        PropertyBag pb = new PropertyBag();
        pb.put("JDBC Connection String", "!" + getDB_CLASS_NAME() + "!" + getCONN_URL());
        pb.put("Trusted_Connection", getTRUSTED_CONN());
        pb.put("PreQEServerName", getCONN_URL());
        pb.put("Server Type", "JDBC (JNDI)");
        pb.put("Database DLL", "crdb_jdbc.dll");
        pb.put("Database", getDB_NAME());
        pb.put("Database Class Name", getDB_CLASS_NAME());
        pb.put("Use JDBC", "true");
        pb.put("Database Name", getDB_NAME());
        pb.put("Server Name", getCONN_URL());
        pb.put("Connection URL", getCONN_URL());
        pb.put("Server", getSERVER_NAME());
        connectionInfo2.setAttributes(pb);
        connectionInfo2.setUserName(getUSERNAME());
        connectionInfo2.setPassword(getPASSWORD());
        connectionInfo2.setKind(ConnectionInfoKind.SQL);
        int replaceParams = 4;
        dbController.replaceConnection(iConnectionInfo, (IConnectionInfo)connectionInfo2, pFields, replaceParams);
        PrintReportOptions printOptions = new PrintReportOptions();
        printOptions.setPrinterName(service.getName());
        printOptions.setJobTitle(REPORT_NAME);
        printOptions.setPrinterDuplex(PrinterDuplex.simplex);
        printOptions.setPaperSource(PaperSource.auto);
        printOptions.setPaperSize(paperSize);
        if (copies > 1) {
          printOptions.setNumberOfCopies(copies);
        } else {
          printOptions.setNumberOfCopies(1);
        } 
        printOptions.setCollated(false);
        reportClientDoc.getPrintOutputController().printReport(printOptions);
      } else {
        System.out.println("Some fields were not filled. REPORT_NAME, USERNAME, SERVER_NAME, CONN_URL, DB_NAME and DB_CLASS_NAME are required.");
      } 
    } catch (ReportSDKException ex) {
      System.out.println(ex);
    } catch (Exception ex) {
      System.out.println(ex);
    } 
  }
  
  public void InitializePrintServices() {
    this.printServices = PrintServiceLookup.lookupPrintServices(null, null);
  }
  
  public String[] GetPrintServices() {
    int idx = 0;
    String[] temp = new String[this.printServices.length];
    byte b;
    int i;
    PrintService[] arrayOfPrintService;
    for (i = (arrayOfPrintService = this.printServices).length, b = 0; b < i; ) {
      PrintService service = arrayOfPrintService[b];
      String existingPrinter = service.getName();
      temp[idx] = existingPrinter;
      idx++;
      b++;
    } 
    return temp;
  }
  
  public PrintService SelectPrintService(PrintService[] services, String selectedPrinter) {
    PrintService temp = null;
    if (services.length != 0 || services != null) {
      byte b;
      int i;
      PrintService[] arrayOfPrintService;
      for (i = (arrayOfPrintService = services).length, b = 0; b < i; ) {
        PrintService service = arrayOfPrintService[b];
        String existingPrinter = service.getName();
        if (existingPrinter.equals(selectedPrinter)) {
          temp = service;
          break;
        } 
        b++;
      } 
    } 
    return temp;
  }
  
  public void ExportReport(ReportExportFormat repExpFrmt, String exportFileName) {
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.ERROR);
    try {
      if (REPORT_NAME != "" && USERNAME != "" && SERVER_NAME != "" && CONN_URL != "" && DB_NAME != "" && DB_CLASS_NAME != "") {
        ReportClientDocument reportClientDoc = new ReportClientDocument();
        reportClientDoc.open(REPORT_NAME, 0);
        reportClientDoc.getDatabaseController().logon(getUSERNAME(), getPASSWORD());
        reportClientDoc.getDataDefController().getRecordFilterController().setFormulaText(SELECTION_FORMULA);
        ConnectionInfo connectionInfo1 = new ConnectionInfo();
        ConnectionInfo connectionInfo2 = new ConnectionInfo();
        DatabaseController dbController = reportClientDoc.getDatabaseController();
        IConnectionInfo iConnectionInfo = dbController.getConnectionInfos(null).getConnectionInfo(0);
        Fields pFields = null;
        if (TRUSTED_CONN != "true")
          TRUSTED_CONN = "false"; 
        PropertyBag pb = new PropertyBag();
        pb.put("JDBC Connection String", "!" + getDB_CLASS_NAME() + "!" + getCONN_URL());
        pb.put("Trusted_Connection", getTRUSTED_CONN());
        pb.put("PreQEServerName", getCONN_URL());
        pb.put("Server Type", "JDBC (JNDI)");
        pb.put("Database DLL", "crdb_jdbc.dll");
        pb.put("Database", getDB_NAME());
        pb.put("Database Class Name", getDB_CLASS_NAME());
        pb.put("Use JDBC", "true");
        pb.put("Database Name", getDB_NAME());
        pb.put("Server Name", getCONN_URL());
        pb.put("Connection URL", getCONN_URL());
        pb.put("Server", getSERVER_NAME());
        connectionInfo2.setAttributes(pb);
        connectionInfo2.setUserName(getUSERNAME());
        connectionInfo2.setPassword(getPASSWORD());
        connectionInfo2.setKind(ConnectionInfoKind.SQL);
        int replaceParams = 4;
        dbController.replaceConnection(iConnectionInfo, (IConnectionInfo)connectionInfo2, pFields, replaceParams);
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream)reportClientDoc.getPrintOutputController().export(repExpFrmt);
        reportClientDoc.close();
        byte[] byteArray = new byte[byteArrayInputStream.available()];
        File file = new File(exportFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byteArrayInputStream.available());
        int x = byteArrayInputStream.read(byteArray, 0, byteArrayInputStream.available());
        byteArrayOutputStream.write(byteArray, 0, x);
        byteArrayOutputStream.writeTo(fileOutputStream);
        byteArrayInputStream.close();
        byteArrayOutputStream.close();
        fileOutputStream.close();
      } else {
        System.out.println("Some fields were not filled. REPORT_NAME, USERNAME, SERVER_NAME, CONN_URL, DB_NAME and DB_CLASS_NAME are required.");
      } 
    } catch (ReportSDKException ex) {
      System.out.println(ex);
    } catch (Exception ex) {
      System.out.println(ex);
    } 
  }
  
  public static String getREPORT_NAME() {
    return REPORT_NAME;
  }
  
  public static void setREPORT_NAME(String reportName) {
    REPORT_NAME = reportName;
  }
  
  public static String getUSERNAME() {
    return USERNAME;
  }
  
  public static void setUSERNAME(String uName) {
    USERNAME = uName;
  }
  
  public static String getPASSWORD() {
    return PASSWORD;
  }
  
  public static void setPASSWORD(String pw) {
    PASSWORD = pw;
  }
  
  public static String getSELECTION_FORMULA() {
    return SELECTION_FORMULA;
  }
  
  public static void setSELECTION_FORMULA(String sFormula) {
    SELECTION_FORMULA = sFormula;
  }
  
  public static String getTRUSTED_CONN() {
    return TRUSTED_CONN;
  }
  
  public static void setTRUSTED_CONN(String trusted) {
    TRUSTED_CONN = trusted;
  }
  
  public static String getSERVER_NAME() {
    return SERVER_NAME;
  }
  
  public static void setSERVER_NAME(String servName) {
    SERVER_NAME = servName;
  }
  
  public static String getCONN_URL() {
    return CONN_URL;
  }
  
  public static void setCONN_URL(String url) {
    CONN_URL = url;
  }
  
  public static String getDB_NAME() {
    return DB_NAME;
  }
  
  public static void setDB_NAME(String dbName) {
    DB_NAME = dbName;
  }
  
  public static String getDB_CLASS_NAME() {
    return DB_CLASS_NAME;
  }
  
  public static void setDB_CLASS_NAME(String className) {
    DB_CLASS_NAME = className;
  }
  
  public PrintService[] getPrintServices() {
    return this.printServices;
  }
  
  public void setPrintServices(PrintService[] printServices) {
    this.printServices = printServices;
  }
  
  public PrintService getPrintService() {
    return this.printService;
  }
  
  public void setPrintService(PrintService printService) {
    this.printService = printService;
  }
  
  @ShortName("CR_PrintService")
  public static class CR_PrintService extends AbsObjectWrapper<PrintService> {}
}

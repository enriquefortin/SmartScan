package com.prusb.jCrystalReports;

import anywheresoftware.b4a.BA.Hide;
import anywheresoftware.b4a.BA.ShortName;
import com.crystaldecisions.ReportViewer.ReportViewerBean;
import com.crystaldecisions.sdk.occa.report.application.ReportClientDocument;
import com.crystaldecisions.sdk.occa.report.lib.ReportSDKException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

@ShortName("CrystalReportsViewer")
@Hide
public class ReportViewerFrame extends JFrame {
  private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  
  private static final long serialVersionUID = 1L;
  
  private final int XPOS = 0;
  
  private final int YPOS = 0;
  
  private final int WIDTH = this.screenSize.width;
  
  private final int HEIGHT = this.screenSize.height;
  
  private ReportViewerBean reportViewer = new ReportViewerBean();
  
  private ReportClientDocument reportClientDoc = new ReportClientDocument();
  
  public ReportViewerFrame(ReportClientDocument reportClientDoc) throws Exception {
    setResizable(true);
    setLocation(0, 0);
    setSize(this.WIDTH, this.HEIGHT);
    setTitle("Visor Crystal Report Kateen-le");
    addComponents();
    addListeners();
    this.reportClientDoc = reportClientDoc;
    this.reportViewer.setReportSource(reportClientDoc.getReportSource());
    this.reportViewer.init();
    this.reportViewer.start();
    setVisible(true);
  }
  
  private void addComponents() {
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add((Component)this.reportViewer);
  }
  
  private void addListeners() {
    addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            ReportViewerFrame.this.quit();
          }
        });
  }
  
  public void quit() {
    try {
      this.reportClientDoc.close();
      dispose();
    } catch (ReportSDKException ex) {
      ex.printStackTrace();
    } 
  }
}

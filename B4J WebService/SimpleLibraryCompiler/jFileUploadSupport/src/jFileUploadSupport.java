package com.tummosoft;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;
import jakarta.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileItemFactory;
import org.apache.commons.fileupload2.core.FileUploadException;
import org.apache.commons.fileupload2.core.ProgressListener;
import org.apache.commons.fileupload2.core.RequestContext;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;
import org.apache.commons.fileupload2.jakarta.JakartaServletRequestContext;
import org.apache.commons.io.FileCleaningTracker;

@ShortName("jFileUploadSupport")
@Version(2.0F)
public class jFileUploadSupport {
  private String _ev;
  
  private File tempfile;
  
  private boolean _multifiles = false;
  
  private boolean _multipart = false;
  
  private static int _filesizemax = 10;
  
  private static int _totalsizemax = 20;
  
  private String _uploadpath = "";
  
  public void Initialize(String paramString) throws IOException {
    this._ev = paramString.toLowerCase(BA.cul);
  }
  
  public boolean getIsMultiFiles() {
    return this._multifiles;
  }
  
  public boolean getIsMultipart() {
    return this._multipart;
  }
  
  public void setFileSizeMax(int paramInt) {
    _filesizemax = paramInt;
  }
  
  public void setTotalSizeMax(int paramInt) {
    _totalsizemax = paramInt;
  }
  
  public void TempFile(String paramString1, String paramString2) {
    this.tempfile = new File(paramString1, paramString2);
  }
  
  public void UploadPath(String paramString) {
    this._uploadpath = paramString;
  }
  
  public void MultipartHook(final BA ba, HttpServletRequest paramHttpServletRequest) throws FileUploadException, IOException {
    JakartaServletRequestContext jakartaServletRequestContext = new JakartaServletRequestContext(paramHttpServletRequest);
    boolean bool = JakartaServletFileUpload.isMultipartContent((RequestContext)jakartaServletRequestContext);
    if (bool) {
      this._multipart = true;
      FileCleaningTracker fileCleaningTracker = new FileCleaningTracker();
      fileCleaningTracker.track(this.tempfile, fileCleaningTracker);
      DiskFileItemFactory diskFileItemFactory = DiskFileItemFactory.builder().setFileCleaningTracker(fileCleaningTracker).get();
      JakartaServletFileUpload jakartaServletFileUpload = new JakartaServletFileUpload((FileItemFactory)diskFileItemFactory);
      jakartaServletFileUpload.setHeaderCharset(Charset.forName("utf-8"));
      jakartaServletFileUpload.setFileSizeMax((1048576 * _filesizemax));
      jakartaServletFileUpload.setSizeMax((1048576 * _totalsizemax));
      jakartaServletFileUpload.setProgressListener(new ProgressListener() {
            public void update(long param1Long1, long param1Long2, int param1Int) {
              BigDecimal bigDecimal = new BigDecimal(String.valueOf(param1Long1 * 100L / param1Long2));
              bigDecimal = bigDecimal.setScale(2, 4);
              String str = bigDecimal.toString();
              ba.raiseEvent(jFileUploadSupport.this, jFileUploadSupport.this._ev + "_uploadprogress", new Object[] { Long.valueOf(param1Long2), str });
            }
          });
      uploadParseRequest(ba, jakartaServletFileUpload, paramHttpServletRequest, this._uploadpath);
    } 
  }
  
private void uploadParseRequest(BA paramBA, JakartaServletFileUpload paramJakartaServletFileUpload, HttpServletRequest paramHttpServletRequest, String paramString) throws IOException {
    try {
        // Asegúrate de que la lista esté correctamente tipada
        List<FileItem> list = paramJakartaServletFileUpload.parseRequest(paramHttpServletRequest);

        if (list.size() > 1) {
            this._multifiles = true;
        }

        // Iterar sobre la lista de FileItem
        for (FileItem fileItem : list) {
            if (fileItem.isFormField()) {
                String str5 = fileItem.getFieldName();
                String str6 = fileItem.getString(Charset.forName("utf-8"));
                continue;
            }

            String str1 = fileItem.getName();
            if (str1.trim().equals("") || str1 == null) {
                continue;
            }

            String str2 = str1.substring(str1.lastIndexOf("/") + 1);
            String str3 = str1.substring(str1.lastIndexOf(".") + 1);
            String str4 = paramString;
            File file = new File(str4);
            if (!file.exists()) {
                file.mkdir();
            }

            InputStream inputStream = fileItem.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(str4 + "/" + str2);
            byte[] arrayOfByte = new byte[1048576];
            int i = 0;
            while ((i = inputStream.read(arrayOfByte)) > 0) {
                fileOutputStream.write(arrayOfByte, 0, i);
            }
            fileOutputStream.close();
            inputStream.close();
            paramBA.raiseEvent(this, this._ev + "_uploadcompleted", new Object[]{Boolean.valueOf(true), str2});
            fileItem.delete();
        }
    } catch (FileUploadException fileUploadException) {
      paramBA.raiseEvent(this, this._ev + "_uploadcompleted", new Object[] { Boolean.valueOf(false), "", Integer.valueOf(0) });
      BA.LogError("Upload Fail, cause: " + fileUploadException.getMessage());
    } 
  }
}

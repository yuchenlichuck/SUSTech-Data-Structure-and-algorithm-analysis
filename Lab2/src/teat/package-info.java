import java.io.* ;
import java.net.* ;
import java.util.* ;
import org.mozilla.intl.chardet.* ;

public class FileCharsetDetector {

  public static boolean found = false ;

  public static void main(String args[]) throws Exception {

    if (args.length < 1) {
      System.out.println(
         "Usage: FileCharsetDetector <path> ");
      return ;
    } 
    
    charSetDetect( args[0]);
  }
  
  private static void charSetDetect (String path) {

    // Initalize the nsDetector() ;
    int lang = nsPSMDetector.ALL ;
    nsDetector det = new nsDetector( lang) ;

    // Set an observer...
    // The Notify() will be called when a matching charset is found.

    det.Init( new nsICharsetDetectionObserver() {
      public void Notify(String charset) {
        FileCharsetDetector.found = true ;
        System.out.println( "CHARSET = " + charset);
      }
    });

    URL url = null;
    BufferedInputStream imp = null;
    try {
      url = new File( path).toURI().toURL();
      imp = new BufferedInputStream( url.openStream());
      byte[] buf = new byte[1024] ;
      int len;
      boolean done = false ;
      boolean isAscii = true ;
         
      while ( (len=imp.read(buf,0,buf.length)) != -1) {
        // Check if the stream is only ascii.
        if (isAscii)
          isAscii = det.isAscii( buf, len);

        // DoIt if non-ascii and not done yet.
        if (!isAscii && !done)
          done = det.DoIt( buf, len, false);
      }
      det.DataEnd();
      imp.close();
         
      if (isAscii) {
        System.out.print( "CHARSET = ASCII");
        tryToOutput( path, "ASCII" );
        found = true ;
      }

      if (!found) {
        String prob[] = det.getProbableCharsets() ;
        for (int i = 0; i < prob.length; i++) {
          System.out.print( "Probable Charset = " + prob[i] );
          tryToOutput( path, prob[i] );
        }
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }
  
  private static void tryToOutput (String path, String charSetName) {
    InputStream inputStream = null;
    BufferedReader in = null;
    Scanner ins = null; 
    try {
      inputStream = new FileInputStream( path);
      in = new BufferedReader( new InputStreamReader( inputStream, charSetName ));
      ins = new Scanner( in );
      String s = ins.next();
      System.out.println ( " : " + s );
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ins.close();
    }
  }
     
}
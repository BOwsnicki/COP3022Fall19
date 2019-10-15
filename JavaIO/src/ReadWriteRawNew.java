import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteRawNew {
	private static final String inpName = "H:/ocd.jpg";
	private static final String outpName = "H:/ocdCopy.jpg";
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inpName);
			fos = new FileOutputStream(outpName);
			int inp;
			while ((inp = fis.read()) != -1) {
				fos.write(inp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) { }
		}

	}
}

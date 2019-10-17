import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteRaw {
	private static final String inpName = "H:/ocd1.jpg";
	private static final String outpName = "H:/ocdCopy.jpg";
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(outpName);
			fis = new FileInputStream(inpName);
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

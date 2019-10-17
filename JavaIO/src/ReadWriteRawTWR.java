import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteRawTWR {
	private static final String inpName = "src/ocd.jpg";
	private static final String outpName = "src/ocdCopy.jpg";

	public static void main(String[] args) {
		// Better "Try with Resources" Java 7+
		try (FileOutputStream fos = new FileOutputStream(outpName);
				FileInputStream fis = new FileInputStream(inpName)) {
			int inp;
			while ((inp = fis.read()) != -1) {
				fos.write(inp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

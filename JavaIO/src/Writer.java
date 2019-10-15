import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
	private static final String fileName = "src/output.txt";

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(fileName));
			for (int i = 0; i < 100; i++) {
				pw.println("Line " + i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
	}
}

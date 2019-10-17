import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteTokens {
	private static final String inFileName = "src/tokens.txt";
	private static final String outFileName = "src/tokensOut.txt";
	public static void main(String[] args) {
		Scanner fInput = null;
		PrintWriter pw = null;
		try {
			fInput = new Scanner(new FileInputStream(inFileName));
			pw = new PrintWriter(new FileOutputStream(outFileName));
			while (fInput.hasNext()) {
				String s = fInput.next();
				pw.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fInput.close();
			pw.close();
		}
		
	}
}




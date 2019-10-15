import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReaderWriter {
	private static final String inpName = "src/in.txt";
	private static final String outpName = "src/out.txt";

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(inpName));
			pw = new PrintWriter(new FileOutputStream(outpName));
			int ic = br.read();
			while (ic != -1) {
				char c = (char) ic;
				switch (c) {
					case '0': pw.print("ZERO "); break;
					case '1': pw.print("ONE "); break;
					case '2': pw.print("TWO "); break;
					case '3': pw.print("THREE "); break;
					case '4': pw.print("FOUR "); break;
					case '5': pw.print("FIVE "); break;
					case '6': pw.print("SIX "); break;
					case '7': pw.print("SEVEN "); break;
					case '8': pw.print("EIGHT "); break;
					case '9': pw.print("NINE "); break;
					default: pw.print(c);
				}
				ic = br.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
			} catch (Exception e) {
			}
		}

	}

}

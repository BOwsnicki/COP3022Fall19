import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByBufferedReader {
	private static final String fileName = "src/in.txt";

	public static void main(String[] args) {
		try {
			BufferedReader fReader = new BufferedReader(new FileReader(fileName));
			int ic = fReader.read();
			while (ic != -1) {
				char c = (char)ic;
				System.out.print(c);
				ic = fReader.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadByToken {
	private static final String fileName = "src/tokens.txt";
	public static void main(String[] args) {
		Scanner fInput = null;
		try {
			fInput = new Scanner(new FileInputStream(fileName));
			while (fInput.hasNext()) {
				String s = fInput.next();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fInput.close();
		}
		
	}
}

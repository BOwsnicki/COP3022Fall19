import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadByScanner {
	private static final String fileName = "src/in.txt";
	public static void main(String[] args) {
		try {
			Scanner fInput =
					  new Scanner(new FileInputStream(fileName));
			while (fInput.hasNextLine()) {
				String s = fInput.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {
	private static final String fileName = "src/people.csv";
	public static void main(String[] args) {
		try {
			Scanner fInput =
					  new Scanner(new FileInputStream(fileName));
			while (fInput.hasNextLine()) {
				String s = fInput.nextLine();
				String[] line = s.split(",");
				for (int i = 0; i < line.length; i++) {
					System.out.print(line[i] + "---");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

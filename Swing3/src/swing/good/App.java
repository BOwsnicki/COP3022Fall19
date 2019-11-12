package swing.good;
import javax.swing.JFrame;

public class App {
	public static void main(String[] args) {
		Model model = new Incrementer();
		
		JFrame mainFrame = new MainFrame(model);
		JFrame subFrame = new SubFrame(model);

		SysOutView sov = new SysOutView(model);
		
		subFrame.setVisible(true);
		mainFrame.setVisible(true);
	}
}

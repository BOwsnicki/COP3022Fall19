import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingDemo {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	public static void main(String[] args) {
		JFrame firstWindow = new JFrame();
		firstWindow.setSize(WIDTH,HEIGHT);
		
		firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JButton endButton = new JButton("Click to end program.");
		
		EndingListener buttonEar = new EndingListener();
		endButton.addActionListener(buttonEar);
		firstWindow.add(endButton);
		firstWindow.setVisible(true);
	}
	
}

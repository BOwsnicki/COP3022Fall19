package swing.bad;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BadApp {
	public static void main(String[] args) {
		JFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		if (mainFrame instanceof ActionListener) {
			ActionListener al = (ActionListener) mainFrame;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
			al.actionPerformed(null);
		}
	}
}

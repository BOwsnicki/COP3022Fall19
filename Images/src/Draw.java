import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JPanel {

	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawString("Hello", 40, 40);
		g2d.fillRect(130, 30, 100, 80);
		g2d.drawOval(30, 130, 50, 60);
		g2d.fillOval(130, 130, 50, 60);
	}

	public static void main(String[] args) {
		Draw m = new Draw();
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.add(m,BorderLayout.CENTER);
		f.setVisible(true);
	}

}
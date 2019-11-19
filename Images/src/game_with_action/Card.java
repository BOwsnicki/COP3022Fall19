package game_with_action;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Card extends JPanel implements MouseListener {
	private BufferedImage face;
	private BufferedImage back;
	private boolean flipped;

	public Card(String file) {
		try {
			face = ImageIO.read(new File(file));
			back = ImageIO.read(new File("back-of-card.png"));
			flipped = true;
		} catch (IOException e) {
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (flipped) {
			g.drawImage(this.back, 0, 0, 100, 100, null);
		} else {
			g.drawImage(this.face, 0, 0, 100, 100, null);
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(100, 100);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Hello");
		flipped = !flipped;
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
package game_simple;

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

	public Card(String file) {
		try {
			face = ImageIO.read(new File(file));
		} catch (IOException e) {
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(this.face, 0, 0, 100, 100, null);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(100, 100);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Hello");
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
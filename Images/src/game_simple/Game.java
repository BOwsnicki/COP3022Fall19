package game_simple;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Game extends JFrame {
	public Game() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		Game g = new Game();
		Card card = new Card("Ada-Lovelace.jpg");
		card.addMouseListener(card);
		g.add(card);
		g.setVisible(true);
	}
}
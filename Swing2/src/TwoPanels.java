import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoPanels extends JFrame implements ActionListener {

	private static final int WIDTH = 500;
	private static final int HEIGHT = 120;

	private JButton hello;
	private JButton world;

	private JCheckBox groucho;
	private JCheckBox harpo;
	private JCheckBox chico;
	private JCheckBox zeppo;

	public TwoPanels() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel left = new JPanel();
		JPanel right = new JPanel();

		hello = new JButton("Hello");
		world = new JButton("World");
		hello.addActionListener(this);

		left.setBorder(BorderFactory.createTitledBorder("Greeting"));
		left.add(hello);
		world.addActionListener(this);
		left.add(world);

		// Don't think you HAVE TO set ActionListeners every time!
		groucho = new JCheckBox("Groucho");
		harpo = new JCheckBox("Harpo");
		chico = new JCheckBox("Chico");
		zeppo = new JCheckBox("Zeppo");

		right.setBorder(BorderFactory.createTitledBorder("Marx Brothers"));
		right.add(groucho);
		right.add(harpo);
		right.add(chico);
		right.add(zeppo);

		add(left);
		add(right);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Buttons
		if (e.getSource() == hello) {
			System.out.println("Hello");
		} else if (e.getSource() == world) {
			System.out.println("World");
		}
		
		// Check boxes
		if (groucho.isSelected()) {
			System.out.println("Groucho");
		}
		if (harpo.isSelected()) {
			System.out.println("Harpo");
		}
		if (chico.isSelected()) {
			System.out.println("Chico");
		}
		if (zeppo.isSelected()) {
			System.out.println("Zeppo");
		}
	}

	public static void main(String[] args) {
		TwoPanels tp = new TwoPanels();
		tp.setVisible(true);
	}
}

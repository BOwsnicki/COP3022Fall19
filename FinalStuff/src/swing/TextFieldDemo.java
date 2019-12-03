package swing;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFieldDemo extends JFrame {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 200;
	private static final int NUMBER_OF_CHAR = 30;

	private JTextField name;
	private JButton clicker;
	private JButton clear;

	public TextFieldDemo() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel nameLabel = new JLabel("Enter your name here:");
		name = new JTextField(NUMBER_OF_CHAR);

		add(nameLabel);
		add(name);

		ActionListener listen = new Listener();
		clear = new JButton("Clear");
		clear.addActionListener(listen);
		add(clear);

		clicker = new JButton("Show me!");
		clicker.addActionListener(listen);
		add(clicker);

	}

	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == clicker) {
				System.out.println("So, you are " + name.getText());
			} else if (e.getSource() == clear) {
				name.setText("");
			}
		}
	}

	public static void main(String[] args) {
		TextFieldDemo tfd = new TextFieldDemo();
		tfd.setVisible(true);
	}

}

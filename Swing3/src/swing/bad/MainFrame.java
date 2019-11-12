package swing.bad;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame 
	implements ActionListener {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	private JButton bt1;
	private JButton bt2;
	private JTextArea textArea;
	
	int count;
	
	public MainFrame() {
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Main Frame");
		bt1 = new JButton("+1");
		bt1.addActionListener(this);
		add(bt1);
		bt2 = new JButton("+2");
		bt2.addActionListener(this);
		add(bt2);
		
		textArea = new JTextArea(5, 20); 
		textArea.setEditable(false);
		add(textArea);
		
		count = 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			count++;
		} else if (e.getSource() == bt2) {
			count += 2;
		}
		textArea.setText("");
		for (int i = 0; i < count; i++) {
			textArea.append("@");			
		}
	}
}

package swing.good;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame implements View {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	private JButton bt1;
	private JButton bt2;
	private Model model;
	private JTextArea textArea;
	
	public MainFrame(Model model) {
		this.model = model;
		model.addView(this);
		ActionListener al = new ClickListener();
		
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Main Frame");
		
		bt1 = new JButton("+1");
		bt1.addActionListener(al);
		add(bt1);
		bt2 = new JButton("+2");
		bt2.addActionListener(al);
		add(bt2);
		
		textArea = new JTextArea(5, 20); 
		textArea.setEditable(false);
		add(textArea);
	}
	
	private class ClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bt1) {
				model.update(1);
			} else if (e.getSource() == bt2) {
				model.update(2);
			}
		}
	}

	@Override
	public void notify(Object result) {
		textArea.setText("");
		for (int i = 0; i < (Integer)result; i++) {
			textArea.append("@");			
		}
	}
}

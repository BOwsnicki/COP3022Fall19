package swing.good;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class SubFrame extends JFrame implements View {
	
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	private JTextArea textArea;
	private Model model;
	
	public SubFrame(Model model) {
		this.model = model;
		model.addView(this);
		
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Sub Frame");
		textArea = new JTextArea(5, 20);
		textArea.setEditable(false);
		add(textArea);
	}

	@Override
	public void notify(Object result) {
		textArea.append(" " + result);
	}
}

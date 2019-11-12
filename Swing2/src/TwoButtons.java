import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoButtons extends JFrame implements ActionListener {
    
	private static final int WIDTH = 200;
	private static final int HEIGHT = 100;
    
	private JButton hello;
	private JButton world;
    
	public TwoButtons() {
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		hello = new JButton("Hello");
		world = new JButton("World");
		hello.addActionListener(this);
		add(hello);
		world.addActionListener(this);
		add(world);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hello) {
			System.out.println("Hello");
		} else if (e.getSource() == world) {
			System.out.println("World");
		}		
	}
	
	public static void main(String[] args) {
		TwoButtons tt = new TwoButtons();
		tt.setVisible(true);
	}
}


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuDemo extends JFrame implements ActionListener
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
    
	private JMenuItem choice1;
	private JMenuItem choice2;
	private JMenuItem choice3;

    public MenuDemo() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu choiceMenu = new JMenu("Choices");

        choice1 = new JMenuItem("Choice 1");
        choice1.addActionListener(this);
        choiceMenu.add(choice1);

        choice2 = new JMenuItem("Choice 2");
        choice2.addActionListener(this);
        choiceMenu.add(choice2);

        choice3 = new JMenuItem("Choice 3");
        choice3.addActionListener(this);
        choiceMenu.add(choice3);

        JMenuBar bar = new JMenuBar();
        bar.add(choiceMenu);
        setJMenuBar(bar);
    }

    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == choice1) {
    		System.out.println("Doing Choice 1");
    	} else if (e.getSource() == choice2) {
    		System.out.println("Doing Choice 2");
    	} else if (e.getSource() == choice3) {
    		System.out.println("Doing Choice 3");
    	}
    }
    
    public static void main(String[] args) {
        MenuDemo md = new MenuDemo( );
        md.setVisible(true);
    }

}

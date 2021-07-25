import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon(MyFrame.class.getResource("unicorn_resize.png"));

		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(icon);
		
		this.getContentPane().setBackground(new Color(255, 198, 178));
		this.add(label);
		this.setTitle("KeyListener TP1");
		this.setVisible(true);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) 
		{
			case 'a': label.setLocation(label.getX()-10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-10);
				break;
			case 's': label.setLocation(label.getX(), label.getY()+10);
				break;
			case 'd': label.setLocation(label.getX()+10, label.getY());
				break;
				
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("You released key char : "+ e.getKeyChar());
		System.out.println("You released key code : "+ e.getKeyCode());
	}
	
	
	
}

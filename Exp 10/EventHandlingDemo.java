import javax.swing.*;
import java.awt.event.*;
public class EventHandlingDemo implements ActionListener
{		
	JFrame frame;
	JButton button;
	JLabel label;
	EventHandlingDemo()
	{
		frame = new JFrame("Event Handling");
		button = new JButton("Click Me");
		button.setBounds(80, 50, 120, 30);
		label = new JLabel();
		label.setBounds(50, 100, 250, 30);
		button.addActionListener(this);
		frame.add(button);
		frame.add(label);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{		
		label.setText("Button Clicked Successfully!");
	}
	public static void main(String args[])
	{ 
		new EventHandlingDemo();
	}
}
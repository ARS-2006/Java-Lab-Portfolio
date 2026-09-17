import javax.swing.*;
import java.awt.event.*;
public class SwingApplication implements ActionListener
{
	JFrame frame;
	JLabel label;
	JTextField textField;
	JButton button;
	SwingApplication()
	{
		frame = new JFrame("SwingApplication"); 
		label = new JLabel("EnterYour Name:");
		label.setBounds(30, 30,120, 30);
		textField = new JTextField();
		textField.setBounds(150, 30, 120,30); 
		button = new JButton("Submit");
		button.setBounds(90, 80, 100, 30);
		button.addActionListener(this);
		frame.add(label);
		frame.add(textField);
		frame.add(button);
		frame.setSize(350, 200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String name = textField.getText();
		JOptionPane.showMessageDialog(frame,"Welcome " + name + "!");
	}
	public static void main(String args[])
	{
		new SwingApplication();
	}
}

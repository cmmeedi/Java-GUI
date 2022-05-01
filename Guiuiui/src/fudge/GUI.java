package fudge;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//The implementation of ActionListener is needed if a program needs to do
//after the click of a button
public class GUI implements ActionListener {
	

	
	//This will be used to keep track of how many times the button is clicked
	private int count = 0;
	// A variable with the data type of JLabel called lable
	private JLabel label;
	// A variable with the data type of JFrame called frame
	private JFrame frame;
	// A variable with the data type of JPanel called panel
	private JPanel panel;
	
	//Create a constructor with the class name
	public GUI() {
		
		//create a new jframe object
		JFrame frame = new JFrame();
		//create a new jpanel
		JPanel panel = new JPanel();
		
		//The creation of a button with "click me" on it
		JButton button = new JButton("click me");
		//This will let the program know that the button has been clicked when it is clicked
		button.addActionListener(this);
		//Create a label that says "Number of clicks: 0"
		JLabel label = new JLabel("Number of clicks: 0");
		
		
		//create a border
		//the numbers go in this order (left to right) top, bottom, left, right
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		//Set a Layout using GridLayout
		panel.setLayout(new GridLayout(0, 1));
		//We add the button to the panel
		panel.add(button);
		//Add the label to the panel
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		//This is what happens when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//The window title
		frame.setTitle("Our GUI");
		//Set the window to match a size
		frame.pack();
		//Make the window visible
		frame.setVisible(true);
	}

		public static void main(String [] args) {
			
			//initialize that constructor and create everything that is within this method
			new GUI();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			//incrementation of count
			count++;
			//This changes the original instantiation of 'label'
			label.setText("Number of clicks: " + count);
		}
	
}

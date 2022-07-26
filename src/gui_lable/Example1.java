package gui_lable;
		/*LABEL = a GUI display area for a string of text, an image or both..*/

/*importing required classes*/
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


/*class*/
public class Example1 {
	
	/*main method*/
	public static void main(String[] args) {

		//creating an image
		ImageIcon image =  new ImageIcon("C:\\Users\\SONY\\Pictures\\Saved Pictures\\B.png");// createing imagi object
		
		// creating border object
		Border border = BorderFactory.createLineBorder(Color.GREEN,3); 
		
		//creating a label
		JLabel label = new JLabel();
		
		// writing a text of a label 
		label.setText("What's up Bob!!! ");
		
		//setting Icon
		label.setIcon(image);
		
		//positioning the text 
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		// setting font color using the normal method
		label.setForeground(Color.GREEN); 
		//label.setForeground(new Color(0x60459809)); // setting font color using this method
		
		// setting font style 
		label.setFont(new Font("MV Boli",Font.PLAIN, 20)); 
		
		// setting the gap between icon and text
		label.setIconTextGap(0);
		
		//setting the background color  wont work without setOpaque
		label.setBackground(Color.BLACK); 
		label.setOpaque(true);
		
		//setting border
		label.setBorder(border);
		
		// setting both image and text at senter vertically and horizontally
		label.setVerticalAlignment(JLabel.CENTER);  
		label.setHorizontalAlignment(JLabel.CENTER);  
		
		//creating frame
		JFrame frame = new JFrame();
		
		//without this the frame wont close when you close it
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//we have to make the fram visible or we wont see it
		frame.setVisible(true);
		
		// adding a label to a frame
		frame.add(label); 
		
		
		frame.pack();/*this will fit everything in a frame but if you gonna use this you dont need laout neither bounds methods neither 
		size for the frame and labes*/

	}
}
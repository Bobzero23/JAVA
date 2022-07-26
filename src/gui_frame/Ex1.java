package gui_frame;
/*required classes*/
import javax.swing.*;
import java.awt.*;

/*suppressing warnings*/
@SuppressWarnings("serial")

/*class*/
public class Ex1 extends JFrame {
	
	/*constructor*/
	Ex1(){
		 
		/*initiating images*/
		ImageIcon icon = new ImageIcon("C:\\Users\\SONY\\Documents\\BOBZERO\\BOB\\CODE SAMPLES\\Eclipse\\JAVA1\\GUI-FRAME\\src\\hahaha.png");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\SONY\\Documents\\BOBZERO\\BOB\\CODE SAMPLES\\Eclipse\\JAVA1\\GUI-FRAME\\src\\haha.jpg");
		
		/*creating lebel*/
		JLabel label = new JLabel();
		
		/*setting icon to the lebel*/
		label.setIcon(icon2); 
		
		/*setting bounds*/
		label.setBounds(150,250, 150, 150);
		
		/*set the lebel invisible*/
		label.setVisible(false);
		
		/*creating a button*/
		JButton button = new JButton();
		
		/*setting bounds*/
		button.setBounds(100,100,250,100);

		/*this button will make the lebel visible*/
		button.addActionListener(e -> label.setVisible(true));
		
		/*setting text to the button*/
		button.setText("NITEKENYE");
		
		/*making it look good*/
		button.setFocusable(false);
		
		/*setting icon to a button*/
		button.setIcon(icon);
		
		/*positioning the text*/
		button.setHorizontalTextPosition(JButton.CENTER); 
		button.setVerticalTextPosition(JButton.BOTTOM);
		
		/*editing the fonts*/
		button.setFont(new Font("Cosmic Sans",Font.BOLD, 25)); 
	
		/*configuring the frame*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(null);
		
		/*adding components to the frame*/
		this.add(button); 
		this.add(label);

	}
}



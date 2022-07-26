package gui_grid_layout;
/*required classes*/
import javax.swing.*;
import java.awt.*;

/*class*/
public class Example {
	
	/*mian method*/
	public static void main(String[] args) {

		/*creating frame*/
		JFrame frame = new JFrame();
		
		/*frame configuration*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10)); //SPACING BETWEEN BUTTONS

		/*SETTING BUTTONS AND ADDING THEM DIRECTLY TO THE FRAME*/
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		//frame.add(new JButton("0"));
		
		/*setting frame visible*/
		frame.setVisible(true);

	}

}

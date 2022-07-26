package gui_flow_layout;

/*required classes*/
import javax.swing.*;
import java.awt.*;

/*class*/
public class Example1 {
	
	/*main method*/
	public static void main(String[] args) {
		
		/*CREATING THE FRAME*/
		JFrame frame = new JFrame();
		
		/* frame configuration*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // THE NUMBERS ARE FOR THE GAP

		/*SETTING BUTTONS AND ADDING THEM DIRECTLY TO THE FRAME*/
//		frame.add(new JButton("1"));
//		frame.add(new JButton("2"));
//		frame.add(new JButton("3"));
//		frame.add(new JButton("4"));
//		frame.add(new JButton("5"));
//		frame.add(new JButton("6"));
//		frame.add(new JButton("7"));
//		frame.add(new JButton("8"));
//		frame.add(new JButton("9"));
		
			/*CREATING PANEL*/
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		panel.setPreferredSize(new Dimension (100,250)); // INABANA SPACE NDO MANA BUTTONS ZIMEENDA CHINI
		
		/*ADDIND ALL BUTTONS TO THE PANEL*/
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
				
		/*ADDING PANEL TO A FRAME*/
		frame.add(panel);
		
		/*SET VISIBLE AT THE END GUESS WHY*/
		frame.setVisible(true);		
	}

}

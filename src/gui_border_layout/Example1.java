package gui_border_layout;
/*required classes*/
import javax.swing.*;
import java.awt.*;

/*class*/
public class Example1 {
	
	/*main method*/
	public static void main(String[] args) {
		/*creating frame*/							
		JFrame frame = new JFrame();
		
		/*frame configuration*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(5,5)); // ADDING MARGINS BETWEEN BORDERS
		
		/*creating panels*/
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		/*setting colors*/
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
	
		/*setting size*/
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
/*---------------------------------------  SUB PANELS  ------------------------------------------------------*/
		/*CREATING PANELS*/
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		/*SETTING COLORS*/
		panel6.setBackground(Color.BLACK);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
	    /*NOW PANEL5 IS ACTING AS A CONTAINER*/
		panel5.setLayout(new BorderLayout());
		
		/*SETTING SIZE*/
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		/*ADDING SUBPANELS TO A PANEL 5*/		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);

		
		/*------------------------------------------ SUB PANELS -------------------------------------------*/
		
		
		/*ADDING PANELS TO FRAME*/
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
		


	}

}

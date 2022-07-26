package gui_layered_layout;
/*required classes*/
import javax.swing.*;
import java.awt.*;

/*class*/
public class Example1 {

	/*main method*/
	public static void main(String[] args) {
		
		
		/*creating lebel 1*/
		JLabel label1 = new JLabel();
		
		/*label1 configuration*/
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		/*creaiting lebel 2*/
		JLabel label2 = new JLabel();
		
		/*lebel2 configuration*/
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		/*creating lebel 3*/
		JLabel label3 = new JLabel();
		
		/*lebel3 configuration*/
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);
		
		/*creting layered pane*/
		JLayeredPane layeredPane = new JLayeredPane();
		
		/*adding labels to the pane*/
		layeredPane.setBounds(0,0,500,500);
		layeredPane.add(label1);
		layeredPane.add(label2);
		layeredPane.add(label3);
		 
		/*CREATING FRAME*/
		JFrame frame = new JFrame();
		
		/*adding layered pane to the frame*/
		frame.add(layeredPane);
		
		/*frame configuration*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}

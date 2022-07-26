package gui_panel;
/*needed classes*/
import javax.swing.*;
import java.awt.*;

/*class*/
public class Example1 {
	
	/*main method*/
	public static void main(String[] args) {
		
		/*creating icon*/
		ImageIcon icon = new ImageIcon("C:\\Users\\SONY\\Documents\\BOBZERO\\BOB\\CODE SAMPLES\\Eclipse\\JAVA1\\GUI-PANEL\\src\\Hello1.png");
		 
		/*creating a label*/
		JLabel label = new JLabel();
		
		/*setting a text to a label*/
		label.setText("Hello");

		/*setting an icon to a lebel*/
		label.setIcon(icon);
		
		/*setting bounds*/
		label.setBounds(230,75,400,75);
		
		/*creating a green panel*/
		JPanel greenpanel = new JPanel();
		
		/*configuring green panel*/
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250, 500,250);
		greenpanel.setLayout(null);
		
		/*creating a blue panel*/
		JPanel bluepanel = new JPanel();
		
		/*configuring a blue panel*/
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0, 250,250);
		bluepanel.setLayout(null);
		
		/*creating a panel*/
		JPanel redpanel = new JPanel();
		
		/*configuring a red panel*/
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0, 250,250);
		redpanel.setLayout(null);
		
		/*creating a frame*/
		JFrame frame = new JFrame();
	
		/*configuring a frame*/
		frame.setVisible(true);
		frame.setSize(510,500);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*adding components to a frame */
		greenpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
	}
}

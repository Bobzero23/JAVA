package gui_checkbox;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex1 extends JFrame implements ActionListener {

		JButton button;
		JCheckBox checkBox;
		ImageIcon exIcon;
		ImageIcon tikIcon;
	Ex1(){
			
		exIcon = new ImageIcon("C:\\Users\\SONY\\Documents\\BOBZERO\\BOB\\CODE SAMPLES\\Eclipse\\JAVA1\\GUI-CHECKBOX\\src\\ex.png");
		tikIcon = new ImageIcon("C:\\Users\\SONY\\Documents\\BOBZERO\\BOB\\CODE SAMPLES\\Eclipse\\JAVA1\\GUI-CHECKBOX\\src\\tik.png");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("SUBMIT");
		button.addActionListener(this);
		
	    checkBox = new JCheckBox(); 
		checkBox.setText("plz select the box");
		checkBox.setFocusable(false);
		checkBox.setIcon(exIcon); // SETTING THE ICON WHEN IT IS DEFAULT (UN SELECTED)
		checkBox.setSelectedIcon(tikIcon); // SETTING ICON TO SHOW WHEN IT IS SELECTED
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected()); // this method is boolean method
		}
		
	}
}

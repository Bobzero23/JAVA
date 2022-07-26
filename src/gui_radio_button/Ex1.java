package gui_radio_button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex1 extends JFrame implements ActionListener{
	
	JRadioButton PizzaButton;
	JRadioButton HamburgerButton;
	JRadioButton HotdogButton;
	
	Ex1(){
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		PizzaButton = new JRadioButton("Pizza");
		PizzaButton.addActionListener(this);
		HamburgerButton = new JRadioButton("Hamburger");
		HamburgerButton.addActionListener(this);
		HotdogButton = new JRadioButton("Hotdog");
		HotdogButton.addActionListener(this);
		
		
		ButtonGroup group = new ButtonGroup(); // KUZWEKA RADIO BUTTONS KATIKA GRUOP SO WE CANNATO SELECT EM ALL AT ONCE
	    group.add(PizzaButton);
	    group.add(HotdogButton);
	    group.add(HamburgerButton);
		
		this.add(PizzaButton);
		this.add(HamburgerButton);
		this.add(HotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == PizzaButton) {System.out.println("YOU ORDERED PIZZA");}
		if (e.getSource() == HamburgerButton) {System.out.println("YOU ORDERED A HAMBURGER");}
		if (e.getSource() == HotdogButton) {System.out.println("YOU ORDERED A HOTDOG");}
		
	}
	

}

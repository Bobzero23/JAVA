package project_tictactoe_gui;

/*must imports*/
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*tictactoe class*/
public class Tictactoe implements ActionListener{

	/*declaring needed variables*/
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel(); //PANEL TO HOLD THE TITLE
	JPanel button_panel = new JPanel(); //PANEL TO HOLD THE BUTTONS
	JLabel textfield = new JLabel();
	JButton[] button = new JButton[9];
	boolean player1_turn;
	
	/*constructor*/
	public Tictactoe() {

		/*designing the frame*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		
		textfield.setBackground(new Color(25, 25, 25));
		textfield.setForeground(new Color(25, 255, 0));
		textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("TIC TAC TOE");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0, 0, 800, 100);
		
		button_panel.setLayout(new GridLayout(3, 3));
		button_panel.setBackground(new Color(234, 245, 52));
		
		title_panel.add(textfield);
		frame.add(title_panel, BorderLayout.NORTH);
		frame.add(button_panel);
		
		frame.setVisible(true);
		
	}

	/*must implemented method frome actionlistener interface*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*method to decide who starts first*/
	public void firstTurn() {
		
	}
	
	/*method to check who wins*/
	public void check() {
		
	}
	
	/*method to show if x wins*/
	public void xWins(int a, int b, int c) {
		
	}
	
	/*method to show if o wins*/
	public void oWins() {
		
	}
	
}

package gui_text_field;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex1 extends JFrame implements ActionListener {
 
	JButton button;
	JTextField TextField;
	
	Ex1()
	{
		//JTextField TextField = new JTextField(); // COZ INABIDI TO DECLARE NJE YA CONSTRUCTOR TO USE IT OUT OF CONSTRUCTOR
		TextField = new JTextField();
		TextField.setPreferredSize(new Dimension(250,40));
		TextField.setFont(new Font("Consolas",Font.PLAIN,35));
		TextField.setForeground(Color.green);
		TextField.setBackground(Color.BLACK);
		TextField.setCaretColor(Color.WHITE); // SETTING THE COLOR OF THE CURSOR
		// TextField.setText("user name"); // KAMA UNATAKA KUANDIKA MANENO NDANI YAKE
		
		//JButton button = new JButton("SUBMIT"); // COZ INABIDI TO DECLARE NJE YA CONSTRUCTOR TO USE IT OUT OF CONSTRUCTOR
		button = new JButton("SUBMIT");
		button.addActionListener(this);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);		
		this.add(TextField);
		this.pack(); // fits the component inside the frame
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			System.out.println("WUZUUUP "+ TextField.getText());
			TextField.setEditable(true);// UKISHA BONYEZA BUTTON NDO IMETOKA HIO
			button.setEnabled(true); // UKISHA BONYEZA BUTTON NDO IMETOKA HIO
		}
	
	}

}

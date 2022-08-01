package project_digital_timer;

/*must imports*/
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyFrame extends JFrame {

	/*creating instances*/
	Calendar calendar;
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	String time;
	
	/*cosntructor*/
	public MyFrame() {
		
		/*creating the frame with its components*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My clock project");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		/*intialization*/
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		
		time = timeFormat.format(Calendar.getInstance().getTime());
		
		this.setVisible(true);
		
	}

}

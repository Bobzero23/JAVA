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
		
		/*adding time label to the frame*/
		this.add(timeLabel);
		this.setVisible(true);

		/*calilng a setTime method*/
		setTime();
	}

	/*method to update the second for every passing second*/
	public void setTime() {

		while(true) {

			/*here we pass time the time infos using String format method*/
			time = timeFormat.format(Calendar.getInstance().getTime());
			
			/*setting time on our time label*/
			timeLabel.setText(time);
			
			/*adding some components to our lable*/
			timeLabel.setFont(new Font("Algerian", Font.PLAIN, 50)); //FONT
			timeLabel.setForeground(new Color(0,0,255)); //FONT COLOR
			
			/*this will handle the second updating*/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
	
}

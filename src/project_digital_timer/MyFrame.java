package project_digital_timer;

/*must imports*/
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	/*creating instances*/
	Calendar calendar;
	SimpleDateFormat timeFormat; //FOR THE TIME
	JLabel timeLabel;
	SimpleDateFormat dayFormat; //FOR THE DAY 
	JLabel dayLabel;
	String day;
	String time;
	
	/*constructor*/
	public MyFrame() {
		
		/*creating the frame with its components*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My clock project");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.getContentPane().setBackground(Color.black);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		/*initialization*/
		timeFormat = new SimpleDateFormat("hh:mm:ss a"); //FOR TIME
		timeLabel = new JLabel(); // FOR TIME
		dayFormat = new SimpleDateFormat("dd:MM:y"); // FOR DAY 
		dayLabel = new JLabel(); // FOR DAY
		
		/*adding some components to our time label*/
		timeLabel.setFont(new Font("Algerian", Font.PLAIN, 50)); //FONT
		timeLabel.setForeground(new Color(0,0,255)); //FONT COLOR
		timeLabel.setBackground(Color.black); //BACKGROUND COLOR
		timeLabel.setOpaque(true);
		
		/*adding some components to our daylable*/
		dayLabel.setFont(new Font("Broadway", Font.PLAIN, 35)); //FONT
		dayLabel.setForeground(new Color(0,0,255)); //FONT COLOR
		dayLabel.setBackground(Color.black); //BACKGROUND COLOR
		dayLabel.setOpaque(true);
		
		/*adding time label to the frame*/
		this.add(timeLabel);
		this.add(dayLabel);
		this.setVisible(true);

		
		/*calling a setTime method*/
		setTime();
	}

	/*method to update the second for every passing second*/
	public void setTime() {

		while(true) {

			/*here we pass the time infos to the time string using String format method*/
			time = timeFormat.format(Calendar.getInstance().getTime());
			/*setting time on our time label*/
			timeLabel.setText(time);
	
			/*here we pass the day infos to the day string using String format method*/
			day = dayFormat.format(Calendar.getInstance().getTime());
			/*setting time on our time label*/
			dayLabel.setText(day);
			
			/*this will handle the second updating*/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
	
}

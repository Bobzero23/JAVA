package project_metrics_converter;
/*Name: RAJABU MUSTAFA KHALFANI*/
/*Student Id: 21901005*/
/*JAVA PROJECT1 METRICS CONVERTER*/


/*MY LIBRARY*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*MY CLASST WHICH IMPLEMENTS ACTIONLISTENER*/
public class Project1 implements ActionListener {

	/* INSTANTIATION OF FRAME */
	JFrame Frame;

	/* INSTANTIATION OF PANELS */
	JPanel Panel1;
	JPanel Panel2;
	JPanel Panel3;
	JPanel Panel4;
	JPanel Panel5;

	/* INSTANTIATION OF TEXTFIELD */
	JTextField Textfield;

	/* INSTANTIATION OF TEXTAREA */
	JTextArea Textarea;

	/* INSTANTIATION OF LABEL */
	JLabel Label1;

	/* INSTANTIATION OF MY FONT */
	Font Myfont = new Font("Dialog", Font.BOLD, 20);

	/* INSTANTIATION OF RADIO BUTTONS */
	JRadioButton[] Radiobutton = new JRadioButton[10];
	JRadioButton Radiobutton1, Radiobutton2, Radiobutton3, Radiobutton4, Radiobutton5;
	JRadioButton Radiobutton6, Radiobutton7, Radiobutton8, Radiobutton9, Radiobutton10;

	/* INSTANTIATION OF NORMAR BUTTONS */
	JButton[] Button = new JButton[12];
	JButton Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button10;
	JButton Pntbutton, Clrbutton, Cnvrtbutton;

	/* HERE IS MY CONSTRUCTOR */
	Project1() {

		/* HERE IS THE FRAME AND ITS METHODS */
		Frame = new JFrame("METRICS CONVERTER");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(500, 450);
		Frame.setLayout(null);
		Frame.setResizable(false);

		/* HERE IS PANEL1 AND ITS METHODS */
		Panel1 = new JPanel();
		Panel1.setBackground(Color.CYAN);
		Panel1.setBounds(0, 0, 490, 40);
		Panel1.setLayout(null);

		/* HERE IS PANEL2 AND ITS METHODS */
		Panel2 = new JPanel();
		Panel2.setBackground(Color.CYAN);
		Panel2.setBounds(0, 40, 490, 140);
		Panel2.setLayout(new GridLayout(5, 2, 10, -10));

		/* HERE IS PANEL3 AND ITS METHODS */
		Panel3 = new JPanel();
		Panel3.setBackground(Color.WHITE);
		Panel3.setBounds(0, 180, 300, 230);
		Panel3.setLayout(new BorderLayout());

		/* HERE IS PANEL4 AND ITS METHODS */
		Panel4 = new JPanel();
		Panel4.setBackground(Color.lightGray);
		Panel4.setBounds(300, 180, 190, 180);
		Panel4.setLayout(new GridLayout(4, 3));

		/* HERE IS PANEL5 AND ITS METHODS */
		Panel5 = new JPanel();
		Panel5.setBackground(Color.GREEN);
		Panel5.setBounds(300, 360, 190, 50);
		Panel5.setLayout(new BorderLayout());

		/* HERE IS LABEL AND ITS METHODS */
		Label1 = new JLabel("Input:");
		Label1.setForeground(Color.BLUE);
		Label1.setFont(Myfont);
		Label1.setBounds(120, 5, 100, 30);

		/* HERE IS TEXTFIELD AND ITS METHODS */
		Textfield = new JTextField();
		Textfield.setBounds(190, 5, 160, 30);
		Textfield.setEditable(true);

		
		/* HERE IS TEXTAREA AND ITS METHODS */
		Textarea = new JTextArea();
		Textarea.setBounds(0, 180, 190, 50);
		Textarea.setEditable(false);
		Textarea.setBackground(Color.WHITE);


		
		/* DECLARATION OF RADIO BUTTONS */
		Radiobutton1 = new JRadioButton("in Miles");
		Radiobutton2 = new JRadioButton("in Kilometres");
		Radiobutton3 = new JRadioButton("in Gallons");
		Radiobutton4 = new JRadioButton("in Litres");
		Radiobutton5 = new JRadioButton("in Pounds");
		Radiobutton6 = new JRadioButton("in Kilograms");
		Radiobutton7 = new JRadioButton("in MHP");
		Radiobutton8 = new JRadioButton("in Knots");
		Radiobutton9 = new JRadioButton("in Inches");
		Radiobutton10 = new JRadioButton("in Centimetres");

		
		/* ADDING RADIO BUTTONS TO THE ARRAY */
		Radiobutton[0] = Radiobutton1;
		Radiobutton[1] = Radiobutton2;
		Radiobutton[2] = Radiobutton3;
		Radiobutton[3] = Radiobutton4;
		Radiobutton[4] = Radiobutton5;
		Radiobutton[5] = Radiobutton6;
		Radiobutton[6] = Radiobutton7;
		Radiobutton[7] = Radiobutton8;
		Radiobutton[8] = Radiobutton9;
		Radiobutton[9] = Radiobutton10;

		/* SHORT WAY TO WRITE METHODS FOR RADIOBUTTONS USING FOR LOOP */
		for (int i = 0; i < 10; i++) {
			Radiobutton[i].addActionListener(this);
			Radiobutton[i].setFocusable(false);
			Radiobutton[i].setBackground(Color.CYAN);
			Radiobutton[i].setFont(new Font("Dialog", Font.BOLD, 20));

		}

		/*
		 * SHORT WAY TO WRITE METHODS FOR NORMAL BUTTONS USING FOR LOOP ADN OTHER
		 * METHODDS
		 */
		for (int i = 0; i < 10; i++) {
			Button[i] = new JButton(String.valueOf(i)); // INITIATING ALL NORMAL BUTTONS AND TITLE THEM
			Button[i].addActionListener(this);
			Button[i].setFocusable(false);
			Button[i].setFont(new Font("Dialog", Font.BOLD, 20));
		}

		/* HERE IS CONVERT BUTTON AND ITS METHODS */
		Cnvrtbutton = new JButton("Convert!");
		Cnvrtbutton.setFocusable(false);
		Cnvrtbutton.setFont(new Font("Dialog", Font.BOLD, 20));
		Cnvrtbutton.setBounds(290, 180, 200, 30);
		Cnvrtbutton.addActionListener(this);

		/* HERE IS CLEAR BUTTON AND ITS METHODS */
		Clrbutton = new JButton("C");
		Clrbutton.setFocusable(false);
		Clrbutton.setFont(new Font("Dialog", Font.BOLD, 20));
		Clrbutton.addActionListener(this);

		/* HERE IS POINT BUTTON AND ITS METHODS */
		Pntbutton = new JButton(".");
		Pntbutton.setFocusable(false);
		Pntbutton.setFont(new Font("Dialog", Font.BOLD, 20));
		Pntbutton.addActionListener(this);

		/* ADDING RADION BUTTON TO THE UPPER PANEL SO THAT THEY CAN BE DISPLAYED */
		Panel2.add(Radiobutton[0]);
		Panel2.add(Radiobutton[1]);
		Panel2.add(Radiobutton[2]);
		Panel2.add(Radiobutton[3]);
		Panel2.add(Radiobutton[4]);
		Panel2.add(Radiobutton[5]);
		Panel2.add(Radiobutton[6]);
		Panel2.add(Radiobutton[7]);
		Panel2.add(Radiobutton[8]);
		Panel2.add(Radiobutton[9]);

		/*
		 * ADDING RADIO BUTTONS IN GRUOP SO THAT WE CAN ONLY CHOOSE ONE BUTTON AT A TIME
		 */
		ButtonGroup Group = new ButtonGroup();
		Group.add(Radiobutton1);
		Group.add(Radiobutton2);
		Group.add(Radiobutton3);
		Group.add(Radiobutton4);
		Group.add(Radiobutton5);
		Group.add(Radiobutton6);
		Group.add(Radiobutton7);
		Group.add(Radiobutton8);
		Group.add(Radiobutton9);
		Group.add(Radiobutton10);

		/* ADDING NORMAL BUTTONS TO THE PANEL 4 WHICH LOCATED AT SOUTH WEST */
		Panel4.add(Button[1]);
		Panel4.add(Button[2]);
		Panel4.add(Button[3]);
		Panel4.add(Button[4]);
		Panel4.add(Button[5]);
		Panel4.add(Button[6]);
		Panel4.add(Button[7]);
		Panel4.add(Button[8]);
		Panel4.add(Button[9]);
		Panel4.add(Clrbutton);
		Panel4.add(Button[0]);
		Panel4.add(Pntbutton);

		/* ADDING CONVERT BUTTON TO THE PANEL */
		Panel5.add(Cnvrtbutton);

		/* ADDING TEXTAREA TO THE SOUTH EAST PANEL */
		Panel3.add(Textarea);

		/* ADDING ALL PANELS TO THE FRAME */
		Frame.add(Panel5);
		Frame.add(Panel4);
		Frame.add(Panel3);
		Frame.add(Panel2);
		Frame.add(Panel1);

		/* ADDING LEBEL TO THE UPPER PANEL */
		Panel1.add(Label1);

		/* ADDIND TEXTFIELD TO THE UPPER PANEL */
		Panel1.add(Textfield);

		/*----------------------SETTNG THE FRAME AT THE END TO AVOID SOME BUGS AND ERRORS-------------------------*/
		Frame.setVisible(true);
	}

/*---------------------------------------------------HERE IS MY MAIN METHOD------------------------------*/
	public static void main(String[] args) {

		new Project1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {

/*-------------------------------------ACTIVATING THE ALL BUTTONS AND GIVING THEM VALUE ACCORDING TO THEIR INDEX-----------------------------------*/
			if (e.getSource() == Button[i]) {
				Textfield.setText(Textfield.getText().concat(String.valueOf(i)));
			}

		}
		/*-------------------------------------ACTIVATING THE POINT BUTTON-----------------------------------*/
		if (e.getSource() == Pntbutton) {
			Textfield.setText(Textfield.getText().concat("."));

		}

		/*-------------------------------------ACTIVATING THE CLEAR BUTTON-----------------------------------*/
		if (e.getSource() == Clrbutton) {
			Textfield.setText("");
		}

		/*-------------------------------------ACTIVATING THE CONVERT BUTTON-----------------------------------*/
		if (e.getSource() == Cnvrtbutton) {
			if (this.Textfield.getText().length() <= 0) { // IF THERE IS NO INPUT AT ALL
				this.addInformation("Invalid Input");
			} // THIS WILL BE PRINTED TO THE TEXT AREA
		 else {
			double value = Double.parseDouble(this.Textfield.getText()); // CHANGING THE INPUT IN TEXTAREA TO DOUBLE

	/*----------------------------------CALCULATION IF A CERTAIN BUTTON SELECTED----------------------------------------------------*/
			
				
			    if  (this.Radiobutton1.isSelected()) {
					double kilometers = value * 1.609;
					this.addInformation(value + " Miles equals " + kilometers + " Kilometres");
				} else if (this.Radiobutton2.isSelected()) {
					double mil = value / 1.609;
					this.addInformation(value + " kilometers equals " + mil + " Miles");
				} else if (this.Radiobutton3.isSelected()) {
					double liter = value * 3.785;
					this.addInformation(value + " gallons equals " + liter + " litres");
				} else if (this.Radiobutton4.isSelected()) {
					double gallon = value / 3.785;
					this.addInformation(value + " liters equals " + gallon + " gallons");
				} else if (this.Radiobutton5.isSelected()) {
					double kilogram = value * 0.453;
					this.addInformation(value + " pounds equals " + kilogram + " kilograms");
				} else if (this.Radiobutton6.isSelected()) {
					double pound = value / 0.453;
					this.addInformation(value + " kilograms equals " + pound + " pounds");
				} else if (this.Radiobutton7.isSelected()) {
					double knot = value * 0.868;
					this.addInformation(value + " MPH equals " + knot + " Knots");
				} else if (this.Radiobutton8.isSelected()) {
					double mph = value / 0.868;
					this.addInformation(value + " Knots equals " + mph + " MPH");
				} else if (this.Radiobutton9.isSelected()) {
					double centimeter = value * 2.54;
					this.addInformation(value + " inches equals " + centimeter + " cm");
				} else if (this.Radiobutton10.isSelected()) {
					double inch = value / 2.54;
					this.addInformation(value + " centimeters equals " + inch + " inches");
				}
			}
		}
	}

	/*-----------------------------------------------ADDING INFORMATION TO THE TEXT AREA-------------------------------------*/
	private void addInformation(String string) {
		this.Textarea.append(string + "\n");

	}
}
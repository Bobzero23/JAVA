package project_telecommunication;

public class Desk_phone implements Telephone{

	/*declaring a variable for the phone number*/
	String phoneNumber;
	boolean isRinging = false;
	String myNumber = "12345";
	
	/*this is our constructor*/
	public Desk_phone(String myNumber) {
		
		this.myNumber = myNumber;
	}
	
	/*THESE ARE THE METHODS WE IMPLEMENTED FROM INTERFACE*/

	
	@Override
	public void powerOn() {
		
		System.out.println("Desk phone is always on");
	}

	@Override
	public void dial(String phoneNumber) {
		System.out.println("calling " + phoneNumber + "");
	}

	@Override
	public void answer() {
	
		
		
		if(isRinging == true) {
			System.out.println("The phone is answered");
			
		}else {
			System.out.println("The phone is not ringing");
		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		
		if (phoneNumber == myNumber) {
			
			isRinging = true;
			isRinging();
		}
		else {
			System.out.println("Wrong number or the phone is off");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		System.out.println("The phone is ringing");
		return isRinging;
	}
	
	

}

package project_telecommunication;

public class Mobile_phone implements Telephone{
	
	/*declaring a variable for the phone number*/
	String phoneNumber;
	boolean isRinging = false;
	String myNumber = "12345";
	boolean isPowerOn = false;
	
	/*this is our constructor*/
	public Mobile_phone(String myNumber) {
		this.myNumber = myNumber;
	}
	
	/*THESE ARE THE METHODS WE IMPLEMENTED FROM INTERFACE*/

	
	@Override
	public void powerOn() {
		
		isPowerOn = true;
		System.out.println("Desk phone is always on");
	}

	@Override
	public void dial(String phoneNumber) {
		System.out.println("calling " + phoneNumber + "");
	}

	@Override
	public void answer() {
	
		
		
		if(isRinging == true && isPowerOn == true) {
			System.out.println("The phone is answered");
			
		}else {
			System.out.println("The phone is not ringing");
		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		
		if (phoneNumber == myNumber && isPowerOn == true) {
			
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
		
		if(isPowerOn == true) {
		System.out.println("The phone is ringing");
		
	
		}
		return isRinging;
	}
	

}

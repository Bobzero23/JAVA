package project_telecommunication;

/*interface*/
public interface Telephone {

	/*methods*/
	
	/*to power one the device*/
	void powerOn();
	
	/*to call someone*/
	void dial(String phoneNumber);
	
	/*to answer the call*/
	void answer();
	
	/*to check if the phone is ringing*/
	 boolean callPhone(String phoneNumber);
	
	 /*to check if the phone is ringing*/
	 boolean isRinging();
	
}

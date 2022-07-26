package project_telecommunication;
/*PROJECT PATH
 * 
 * MAIN PURPOSE IS TO USE INTERFACE
 * 
 * Create a Main class and leave it for now
 * 
 * Create an interface with the following methods
 * +powerOn
 * +dial(String phoneNumber) --> when you call
 * +answer
 * +boolean callPhone (String phoneNumber) --> when someone else calls you
 * +boolean isRinging
 * 
 * Create a Desk_phone class
 * this class should implements our interface
 * initialize things we gonna need
 * +private String phoneNumber
 * +private boolean isRinging
 * +then implement all the interface methods
 * 
 * 
 * Now come to methods
 * 
 * +powerOn method
 * -this method always shows that the power is always on
 * 
 * +dial method
 * -calling a phoneNumber on deskphone
 * 
 * +answer method
 * -if the phone is ringing then answer the phone
 * -if we answer the phone then the phone stops ringing
 * -else the phone is not ringing
 * 
 * +callphone method
 * -if phoneNumber is your number then itakua intaita
 * -display that the phone is ringing
 * -else the phone is not ringing
 * -ruturn isRinging
 * 
 * +isRinging method
 * -this is a boolean method 
 * -so just return is ringing
 * 
 * Now go to Main class
 * +and create the deskphone class there
 * +pass in some yourNumber
 * +now powerOn the phone
 * +call your number 
 * +answer then phone
 * 
 * Now create another phone
 * +this phone will have all properties of deskphone
 * +but only works when the power is on */
 
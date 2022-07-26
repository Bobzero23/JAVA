package project_simple_game;
/*PROJECT PATH
 *
 * MAIN PURPOSE IS TO COMPREHEND JAVA CORE AND OOP CONCEPTS
 * 
 * Create a Main class and leave it for now
 * 
 * Create a player one class file 
 * give it a name 
 * give it a weapon
 * and give it a health
 * 
 * Create a constructor for it and 
 * +pass all the properties in the parameter
 * +initialize the properties with the parameter using this
 * 
 * Create a damageBygun1  void method 
 * +reducing health by 30
 * +if health is less than zero then set health to zero
 * +display that hitted by gun one and display the new health
 * +if health is zero simply display that player is dead
 * 
 * Create a damageBygun2 void method which every thing will be sama as 
 * the damageByGun1 method except this gun deal 50 damage
 * 
 * Put setters and getters
 * makes easy to get and setting the data or a certain value
 * 
 * 
 * Now create a separete class for player 2 which extends player 1 class
 * player 2 will have armor and a different health so, 
 * +declare those two things
 * +create a constructor same as player 1's class
 * 
 * Override the damageBygun1 method
 * +but if armor is on health is reduced by 20
 * +if health is less than zero then set health as zero
 * +then display that armor is on and display the new health
 * +if armor is off then healt reduced by 30
 * +then again if health is less than zero then set health as zero 
 * +then display that armor is on and display the new health
 * another if display that a certain player is dead using getters and setters
 * 
 * overide the damageBygun2 method and do the same thing you did to the damageBygun1
 * then with aromor the health is reduced by 40
 * and without aromor the health is reduced by 50
 * 
 * now  go to the main class 
 * +create the object of one of the class 
 * +use some getters and setters to check if thet working 
 * +good job if they are working 
 * 
 * now we have to limit the acces of the health
 * +go to the consotructor
 * +if health is less than 0 or greater than 100 set it as 100
 * +else set health as health 
 * 
 * now check that if gun1 is working 
 * also chekc if that gun2 is working 
 * 
 * now add another method to heal
 * +but if player is dead cant heal
 * +but if the player is alive set his health to 100*/
 

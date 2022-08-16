/* MAVEN 
 * This platform is provided by apache so that we can work with java based program, like to get jar files etc.
 *
 * ENVIRONMENT SET UP
 * Make sure you have the JKD on your machine
 * Then download maven on its website
 * After that you gonna have to set environment paths
 * 
 * LITTLE CHECK UP
 * To see if you have JKD in your machine just simply open command line and type jave -version
 * To see that you have maven in you machine simply open command line and type (damn I forgot the command)
 * 
 * CREATING A SIMPLE MAVEN PROJECT ON COMMADN LINE
 * Open  a command line and type mvn archtype:generate
 * After typing this you will get a suggestion for a quick start project in a commandline
 * just click enter if you wanna do it, but if yo gonna play this make sure you have opened the command line 
 * in a particular file you wanna create this project
 * 
 * INSIDE THE COMMAND LINE PROJECT 
 * this is example on how to do that project
 * groupid = com.maven_demo --> take this as package
 * artifactId = Maven demo --> take this as project name
 * snapshot = 2.4.5 --> take this as a version of your project development 
 * package name = you can just take as it is or just add some stuffs then you are good to go
 * after that they will ask you to confirm just type Y and then click enter
 * after you done all of this steps the project will be created inside the folder you opened command line
 * 
 * MAVEN LIFE CYCLE
 * there are some commands we gonna see in here but again make sure you are inside a particular folder for this
 * oppen a command line and these are the commands you can use
 * validate = simply validating the folder or project and neccessary file and informations
 * compile = compiles the source code of the project
 * test = testing the compiled code 
 * package = takes the compiled code and package it in a suitable format ex. JAR
 * verify = simply verifying to see if everythin is as expected 
 * install = installing the package to the local repository
 * deploy = simply pushing your work to the remote repository
 * 
 * RUNNING THE JAVA CODE INSIDE THE MAVEN
 * simply after you get the jar file by packaging your code
 * open the command line in the target folder
 * then write java -cp theNameOfTheJarFile TheNameOfThePackage.TheNameOfTheClass
 * 
 * 
 */
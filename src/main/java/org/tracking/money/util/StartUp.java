package org.tracking.money.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartUp implements ServletContextListener {
	
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	
	public void contextInitialized(ServletContextEvent sce) {
//	     final Runnable beeper = new Runnable() {
//	         public void run() { System.out.println("beep"); }
//	       };
//	       final ScheduledFuture<?> beeperHandle =
//	         scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
//	       scheduler.schedule(new Runnable() {
//	         public void run() { beeperHandle.cancel(true); }
//	       }, 60 * 60, SECONDS);
//	     }
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
}

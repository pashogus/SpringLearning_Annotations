/**
 * 
 */
package com.agilent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agilent.sync.SyncCheck;

/**
 * @author 540091
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		SyncCheck sync =context.getBean("syncCheckImpl", SyncCheck.class);
		sync.check();

	}

}

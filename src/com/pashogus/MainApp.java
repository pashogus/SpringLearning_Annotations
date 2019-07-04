/**
 * 
 */
package com.pashogus;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 540091
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println("Starting of this");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Coach Cricket =context.getBean("cricketCoach", Coach.class);
		Test Cricket = (Test) context.getBean("testImpl");
		Cricket.testClass("test");
//		System.out.println(Cricket.GetWorkout());
//		System.out.println(Cricket.getMessage());
		context.close();
	}
	
	/*
	 * Ctricket Coach Class--Inside Fortuen Service
hello hi
Ctricket Coach Class--Insode Setter method
Ctricket Coach Class--hello hi
Field Injection insode get workout
null
Field Injection insode get message
hello hi
	 * 
	 * 
	 * 
	 * i have called only the cricketcoachFiledInjection bean, 
	 * but spring is executed both the beans (crciket coach and Cricket coachFieldInjection)  , is this a loose coupling
	 */

}

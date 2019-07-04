/**
 * 
 */
package com.pashogus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */
@Component
public class CricketCoachFieldinjection implements Coach {

	@Autowired
	private FortuneService service;
	
	@Override
	public String GetWorkout() {
	System.out.println("Field Injection "+"insode get workout");
		return null;
	}


	@Override
	public String getMessage() {
		System.out.println("Field Injection "+"insode get message");
		return service.getMessage();
	}



}

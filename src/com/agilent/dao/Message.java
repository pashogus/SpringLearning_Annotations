/**
 * 
 */
package com.agilent.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */
@Component
public class Message extends Mailer {
	
	@Value("${case1}")
	private String case1;
	@Value("${case2}")
	private String case2;
	@Value("${case3}")
	private String case3;
	@Value("${case4}")
	private String case4;
	
	public String getCase1() {
		return case1;
	}

	public String getCase2() {
		return case2;
	}

	public String getCase3() {
		return case3;
	}

	public String getCase4() {
		return case4;
	}

	public Message()
	{
		
	}
}
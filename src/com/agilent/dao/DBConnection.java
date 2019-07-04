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
public class DBConnection {

	@Value("${dbURL}")
	private String dbURL;
	@Value("${dbuser}")
	private String dbuser;
	@Value("${dbpwd}")
	private String dbpwd;
	@Value("${token}")
	private String token;
	@Value("${done}")
	private String done;
	


	public DBConnection ()
	{
		
	}
	
	public String getDbURL() {
		return dbURL;
	}
	public String getDbuser() {
		return dbuser;
	}
	public String getDbpwd() {
		return dbpwd;
	}
	
	
	public String getToken() {
		return token;
	}

	public String getDone() {
		return done;
	}
	
	
}

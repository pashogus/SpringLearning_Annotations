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
public class Mailer {

@Value("${toAddress}")
	private String toAddress;
@Value("${ccAddress}")
	private String CCAddress;
@Value("${bccAddress}")
	private String BCCAddress;
@Value("${subject}")
	private String Subject;
@Value("${port}")
	private String port;

public Mailer ()
{
	
}
public String getToAddress() {
	return toAddress;
}
public String getCCAddress() {
	return CCAddress;
}
public String getBCCAddress() {
	return BCCAddress;
}
public String getSubject() {
	return Subject;
}
public String getPort() {
	return port;
}

}
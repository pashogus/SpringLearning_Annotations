/**
 * 
 */
package com.agilent.db;

import java.sql.Connection;

/**
 * @author 540091
 *
 */
public interface WCCConnector {

	public Connection getConn ();
	public int doneCount();
	public int currentWCCToken();
}

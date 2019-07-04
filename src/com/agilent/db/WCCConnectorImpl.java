/**
 * 
 */
package com.agilent.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.agilent.dao.DBConnection;
import com.agilent.dao.Dao;

/**
 * @author 540091
 *
 */
@Component
public class WCCConnectorImpl implements WCCConnector {

	/* (non-Javadoc)
	 * @see com.agilent.db.WCCConnector#getConn()
	 */
	
	@Autowired
	DBConnection con;
	
	@Autowired 
	Dao dao;
	
	@Override
	public Connection getConn() {
		Connection conn = null;
		Statement donestmt=null;
		ResultSet donerst = null;
		Statement tokenstmt = null;
		ResultSet tokenrst =null;
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =(Connection) DriverManager.getConnection(con.getDbURL(),con.getDbuser(), con.getDbpwd());
       	    donestmt = conn.createStatement();
            donerst = donestmt.executeQuery(con.getDone());
    		while (donerst.next())
    		{
    			dao.setDonecount(Integer.valueOf(donerst.getString(1)));
    			
    		}
    		
    		tokenstmt = conn.createStatement();
			tokenrst = tokenstmt.executeQuery(con.getDone());
			while (tokenrst.next()) {
				token.setWcctoken(Integer.valueOf(tokenrst.getString(1)));
				
			}
        }  
		
		catch (ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch (SQLException se)
		{
        	se.printStackTrace();
		}
		return (Connection) conn;
	}


	/* (non-Javadoc)
	 * @see com.agilent.db.WCCConnector#doneCount()
	 */
	@Override
	public int doneCount() {
		Connection conn = null;
		Statement donestmt=null;
		ResultSet donerst = null;
		
		try
		{
		 donestmt = conn.createStatement();
		 donerst = donestmt.executeQuery(con.getDone());
		while (donerst.next())
		{
			dao.setDonecount(Integer.valueOf(donerst.getString(1)));
			
		}
		}
		catch (SQLException e )
		{
			
		}
		return dao.getDonecount();
	}

	/* (non-Javadoc)
	 * @see com.agilent.db.WCCConnector#currentWCCToken()
	 */
	@Override
	public int currentWCCToken() {
		// TODO Auto-generated method stub
		return 0;
	}

}

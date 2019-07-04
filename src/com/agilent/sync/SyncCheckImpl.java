/**
 * 
 */
package com.agilent.sync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.agilent.dao.Dao;

/**
 * @author 540091
 *
 */
@Component
public class SyncCheckImpl implements SyncCheck {

	/* (non-Javadoc)
	 * @see com.agilent.sync.SyncCheck#check(com.agilent.dao.Dao)
	 */
	
	
	@Autowired
	Dao dao;
	
	@Override
	public Dao check() {
		
		System.out.println("toAddrss"+dao.getToAddress());
		return null;
	}

}

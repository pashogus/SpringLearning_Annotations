/**
 * 
 */
package com.agilent.dao;

import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */

@Component
public class Dao extends Message {
	
	private int wcctoken;
	private int lasttoken;
	private int currentoken;
	private int wcccount;
	private int wcscount;
	private int donecount;
	
	public int getDonecount() {
		return donecount;
	}
	/**
	 * @param donecount the donecount to set
	 */
	public void setDonecount(int donecount) {
		this.donecount = donecount;
	}
	/**
	 * @return the wcccount
	 */
	public int getWcccount() {
		return wcccount;
	}
	/**
	 * @param wcccount the wcccount to set
	 */
	public void setWcccount(int wcccount) {
		this.wcccount = wcccount;
	}
	/**
	 * @return the wcscount
	 */
	public int getWcscount() {
		return wcscount;
	}
	/**
	 * @param wcscount the wcscount to set
	 */
	public void setWcscount(int wcscount) {
		this.wcscount = wcscount;
	}

	
	/**
	 * @return the wcctoken
	 */
	public int getWcctoken() {
		return wcctoken;
	}
	/**
	 * @param wcctoken the wcctoken to set
	 */
	public void setWcctoken(int wcctoken) {
		this.wcctoken = wcctoken;
	}
	/**
	 * @return the lasttoken
	 */
	public int getLasttoken() {
		return lasttoken;
	}
	/**
	 * @param lasttoken the lasttoken to set
	 */
	public void setLasttoken(int lasttoken) {
		this.lasttoken = lasttoken;
	}
	/**
	 * @return the currentoken
	 */
	public int getCurrentoken() {
		return currentoken;
	}
	/**
	 * @param currentoken the currentoken to set
	 */
	public void setCurrentoken(int currentoken) {
		this.currentoken = currentoken;
	}
	
	

}

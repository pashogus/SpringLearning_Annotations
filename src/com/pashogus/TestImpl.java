/**
 * 
 */
package com.pashogus;

import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */
@Component
public class TestImpl implements Test {

	/* (non-Javadoc)
	 * @see com.pashogus.Test#testClass(java.lang.String)
	 */
	
	
	
	@Override
	public void testClass(String test) {
		System.out.println("value"+test);

	}

}

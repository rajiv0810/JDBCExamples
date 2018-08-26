/**
 * 
 */
package com.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajus
 *
 */
public class CountATest {

	@Test
	public void test() {
		JunitTesting testA = new JunitTesting();
		int output = testA.count("alfa");
		assertEquals(2, output);
	}

}

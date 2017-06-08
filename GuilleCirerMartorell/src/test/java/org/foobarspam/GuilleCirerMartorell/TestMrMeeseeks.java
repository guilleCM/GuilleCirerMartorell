package org.foobarspam.GuilleCirerMartorell;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMrMeeseeks extends TestCase {
	
	@Test
	public void testMrMeeseksConstructor() {
		//primer MrMe
		MrMeeseeks mrMe = new MrMeeseeks();
		int expected = 1001;
		assertEquals(mrMe.getId(), expected, 0);
		
		//segundo MrMe
		mrMe = new MrMeeseeks();
		expected = 1002;
		assertEquals(mrMe.getId(), expected, 0);
		
		//tercer MrMe
		mrMe = new MrMeeseeks();
		expected = 1003;
		assertEquals(mrMe.getId(), expected, 0);
	}
}

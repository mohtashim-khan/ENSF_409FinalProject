/**
 *@author	Group 73 (Mackenzie,Mohtashim, Ritwik, Usman) <a>
 *href="mailto:mohtashim.khan@ucalgary.ca">mohtashim.khan@ucalgary.ca</a>
 *Project Manager: Mohtashim Khan
 *@version 1.0
 *@since 1.0
 *
 *UITest will perform basic tests for all methods and functionality of the UI Class.
 */


//Package declaration
package edu.ucalgary.ensf409;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.TreeMap;

import org.junit.Test;

public class UITest {
	
	@Test
	  // Constructor created with 4 arguments
	  // Concats getter methods (getType, getItem, getQuanity, getTotalPrice, getDBURL, getUsername, getPassword)
	  // to test again expected String
	  public void testConstructor4() {
	    UI testObj = new UI("study lamp, 1", "DBURLTest","usernameTest", "passwordTest");
	    String expResult = testObj.getType() + 
	    				   testObj.getItem() +
	    				   testObj.getQuantity() +
	    				   testObj.getDBURLType() +
	    				   testObj.getUsername ()+
	    				   testObj.getPassword();
	    
	    assertEquals("studylamp1DBURLTestusernameTestpasswordTest", expResult);
	    				   

	    // See if the arrays are the same
	  //  assertTrue("Constructor test has failed", Arrays.equals(,));
	  }
	
	@Test
	public void testCalculateOrder()
	{
		UI testObj = new UI("study lamp, 1", "jdbc:mysql://localhost/inventory", "Mohtashim", "assignment9");
		testObj.processOrder();
		testObj.calculateOrder();
		String[] result = testObj.getUsedIDs();
		String[] expected = {"L223", "L982"};
		assertEquals(Arrays.toString(expected),Arrays.toString(result));
	}
	
	
	@Test 
	public void testCreateFile()
	{
		UI testObj = new UI("study lamp, 1", "jdbc:mysql://localhost/inventory", "Mohtashim", "assignment9");
		
	}

	@Test
	public void testDeleteUsedIDs()
	{
		
	}
	
	@Test
	public void testDisplayOrder()
	{
		
	}
	
	@Test
	public void testFormatOrderRequest()
	{
		
	}
	
	@Test
	public void testProcessOrder()
	{
		
		
	}
	
	@Test
	public void testStrToInt()
	{
		
	}

}



package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.CellPhone;
import com.training.collection.Television;

public class TelevisionTest {

	Television tv1,tv2,tv3;

	@Before
	public void setUp() {
		tv1=new Television("Samsung","Led",true,50000.0);
		tv2=new Television("sony","plasma",false,60000.0);
		tv3=new Television("onida","lcd",true,80000.0);
	       
	}

	/**It check that when we override equal and hashcode method for equality only to the
	 * company,Type and price then even though _3DEnabled is not same but
	 *  company and model is same then it shows it as duplicate 
	 * 
	 */
	@Test
	public void testTheEqualityOfSetByCompanyAndTypeAndPrice() {
		Television tv4=new Television("Samsung","Led",true,50000.0);
		Set<Object> set1=new HashSet<>();
	  	 set1.add(tv1);
		 set1.add(tv2);		
		 set1.add(tv3);
		 set1.add(tv4);
		 int expected=3;
		 assertEquals(3,set1.size());
		

	}
	/*It check that when we not override equal and hashcode method for equality
	 *  to other than make and model then even though operatingSystem and processor is same
	 *  it does not specify it as duplicate object
	 */
	
	@Test
	public void testTheEqualityOfSetIfCompanyTypeAndPriceIsNotTheSame() {
		
		Television tv4=new Television("panasonic","led",true,90000.0);
		Set<Object> set1=new HashSet<>();
	  	 set1.add(tv1);
		 set1.add(tv2);		
		 set1.add(tv3);
		 set1.add(tv4);
		 int expected=3;
		 assertNotEquals(3,set1.size());
	}
	//check equality by equals method
	@Test
	public void testTwoObjectEquals() {
	Television tv4=new Television("Samsung","Led",true,50000.0);
	  assertTrue(tv1.equals(tv4));
	}
	//check equality by hashcode method
	@Test
	public void testTwoObjectHashCodeAreEqual() {
	Television tv4=new Television("Samsung","Led",true,50000.0);
	    assertEquals(tv1.hashCode(), tv4.hashCode());
	}



}

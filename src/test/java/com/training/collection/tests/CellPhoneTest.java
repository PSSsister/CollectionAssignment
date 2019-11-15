package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.Car;
import com.training.collection.CellPhone;

public class CellPhoneTest {
	CellPhone cell,cell1,cell3;

	@Before
	public void setUp() {
	        cell=new CellPhone("Samsung","s1","ArSupport","pie",50000.0);
	        cell1=new CellPhone("Mi","y3","Camera","lollypop",60000.0);
	        cell3=new CellPhone("iphone","iphone10","more features ","ios",80000.0);
	       
	}

	/**It check that when we override equal and hashcode method for equality only to the
	 * company,operatingSystem and model then even though description  and price is not same but
	 *  company and model is same then it shows it as duplicate 
	 * 
	 */
	@Test
	public void testTheEqualityOfSetByComanyAndModelAndOperatingSystem() {
		CellPhone cell4=new CellPhone("Samsung","s1","ArSupport","pie",50000.0);
	     Set<Object> set1=new HashSet<>();
	  	 set1.add(cell);
		 set1.add(cell1);		
		 set1.add(cell3);
		 set1.add(cell4);
		 int expected=3;
		 assertEquals(3,set1.size());
		

	}
	/*It check that when we not override equal and hashcode method for equality
	 *  to other than company , model and OperatingSystem then even though description and price is same
	 *  it does not specify it as duplicate object
	 */
	
	@Test
	public void testTheEqualityOfSetIfCompanyAndModelAndOSIsNotTheSame() {
		
		CellPhone cell4=new CellPhone("Assus","zenPhone","camera quality","android",50000.0);
		Set<Object> set1=new HashSet<>();
	  	 set1.add(cell);
		 set1.add(cell1);		
		 set1.add(cell3);
		 set1.add(cell4);
		 int expected=3;
		 assertNotEquals(3,set1.size());
	}
	//it check equality by equals method
	@Test
	public void testTwoObjectEquals() {
	  CellPhone cell4=new CellPhone("Samsung","s1","Ar support","pie",50000.0);
	  assertTrue(cell.equals(cell4));
	}
	//It check equality by hashcode method
	@Test
	public void testTwoObjectHashCodeAreEqual() {
	    CellPhone cell4=new CellPhone("Samsung","s1","Ar support","pie",50000.0);
	    assertEquals(cell.hashCode(), cell4.hashCode());
	}


}

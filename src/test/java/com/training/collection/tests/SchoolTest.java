package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.School;
import com.training.collection.Television;

public class SchoolTest {
	School sc1,sc2,sc3;

	@Before
	public void setUp() {
		sc1=new School("jnv","Mangaon","Raigad",1);
		sc2=new School("Shivaji","Irali","Sangli",2);
		sc3=new School("ryan","Nigdi","pune",3);
	       
	}

	/**It check that when we override equal and hashcode method for equality only to the
	 * name,city and district then even though greatSchoolRanking is not same but
	 *  company and model is same then it shows it as duplicate 
	 * 
	 */
	@Test
	public void testTheEqualityOfSetByNameCityAndDistrict() {
		School sc4=new School("jnv","Mangaon","Raigad",1);;
		Set<Object> set1=new HashSet<>();
	  	 set1.add(sc1);
		 set1.add(sc2);		
		 set1.add(sc3);
		 set1.add(sc4);
		 int expected=3;
		 assertEquals(3,set1.size());
		

	}
	/*It check that when we not override equal and hashcode method for equality
	 *  to other than name,city and district then even though greatSchoolRanking same
	 *  it does not specify it as duplicate object
	 */
	
	@Test
	public void testTheEqualityOfSetIfNameCityAndDistrictIsNotTheSame() {
		
		School sc4=new School("D Y PATIL","terna","Nerul",2);
		Set<Object> set1=new HashSet<>();
	  	 set1.add(sc1);
		 set1.add(sc2);		
		 set1.add(sc3);
		 set1.add(sc4);
		 int expected=3;
		 assertNotEquals(3,set1.size());
	}
	//check equality by equals method
	@Test
	public void testTwoObjectEquals() {
		School sc4=new School("jnv","Mangaon","Raigad",1);
	  assertTrue(sc1.equals(sc4));
	}
	//check equality by hashcode method
	@Test
	public void testTwoObjectHashCodeAreEqual() {
		School sc4=new School("jnv","Mangaon","Raigad",1);
	    assertEquals(sc1.hashCode(), sc4.hashCode());
	}




}

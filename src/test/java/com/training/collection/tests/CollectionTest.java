package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.Laptop;

public class CollectionTest {
	Laptop laptop,laptop4,laptop3,laptop5;
	
	@Before
	public void setUp() {
	    laptop=new Laptop("Lenova","L480","windows","i5");
	    laptop4=new Laptop("Sony","Sdfd7745","jsdh","i9");
	    laptop3=new Laptop("Dell","D567","Linux","i7");
	    laptop5=new Laptop("Lenova","L480","windows","i5");
	}

	@Test
	public void testSizeOfArrayListCollection() {
		
		List<Object> list=new ArrayList<>();
		list.add(laptop);
		list.add(laptop4);
		list.add(laptop3);
		list.add(laptop5);
		int expected=4;
		assertEquals(expected,list.size());
	}
		
   @Test
   public void testInsertionOrderArrayListCollection() {
	   
	    
		List<Object> list=new ArrayList<>();
		list.add(laptop);
		list.add(laptop4);
		list.add(laptop3);
		list.add(laptop5);
		Laptop expected[]= {laptop,laptop4,laptop3,laptop5};
		Laptop actual[]=new Laptop[4];
		Iterator<Object> iterator=list.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Laptop) iterator.next();
			index++;
		}
		assertArrayEquals(expected,actual);
   }
   
   @Test
   public void testTheSizeOfLinkedList() {
	   List<Object> list2=new LinkedList<>();
	   list2.add(laptop);
	   list2.add(laptop4);
	   list2.add(laptop3);
	   list2.add(laptop5);
	   int expected=4;
	   assertEquals(expected,list2.size());
   }
  
   @Test
   public void testTheInsertionOrderOfLinkedList() {
	   List<Object> list2=new LinkedList<>();
	   list2.add(laptop);
	   list2.add(laptop4);
	   list2.add(laptop3);
	   list2.add(laptop5);
	   Laptop expected[]= {laptop,laptop4,laptop3,laptop5};
		Laptop actual[]=new Laptop[4];
		Iterator<Object> iterator=list2.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Laptop) iterator.next();
			index++;
		}
		assertArrayEquals(expected,actual);
   }
	   
	@ Test
	public void testTheSizeOfSetCollection()
	{
		Set<Object> set1=new HashSet<>();
  	    set1.add(laptop);
	    set1.add(laptop4);		
	    set1.add(laptop3);
	    set1.add(laptop5);
	    int expected=3;
		assertEquals(expected,set1.size());

	}
	
	@Test
	public void testTheInsertionOrderOfSet() {
		Laptop laptop6=new Laptop("accer","A455","unix","u23");
		Set<Object> set1=new HashSet<>();
		set1.add(laptop6);
  	    set1.add(laptop);
	    set1.add(laptop4);		
	    set1.add(laptop3);
	    set1.add(laptop5);
	    Laptop expected[]= {laptop6,laptop,laptop4,laptop3};
		Laptop actual[]=new Laptop[4];
		Iterator<Object> iterator=set1.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Laptop) iterator.next();
		    index++;
		}
		 System.out.println(Arrays.toString(actual));
		assertNotEquals(expected,actual);
	}
	/*It check that when we override equal and hashcode method for equality only to the
	 * company and model then even though operatingSystem and processor is not same but
	 *  company and model is same then it shows it as duplicate 
	 *  
	 */ 
	@Test
	public void testTheEqualityOfSetByCompanyAndModel() {
		
		 laptop=new Laptop("Lenova","L480","windows","i5");
		 laptop4=new Laptop("Lenova","L480","jsdh","i9");
		 laptop3=new Laptop("Dell","D567","Linux","i7");
		 Set<Object> set1=new HashSet<>();
	  	 set1.add(laptop);
		 set1.add(laptop4);		
		 set1.add(laptop3);
		 int expected=2;
		 assertEquals(2,set1.size());
		

	}
	/*It check that when we not override equal and hashcode method for equality
	 *  to other than company and model then even though operatingSystem and processor is same
	 *  it does not specify it as duplicate object
	 */
	
	@Test
	public void testTheEqualityOfSetIfCompanyAndModelIsNotTheSame() {
		
		 laptop=new Laptop("Lenova","L480","windows","i5");
		 laptop4=new Laptop("accer","A460","windows","i5");
		 laptop3=new Laptop("Dell","D567","Linux","i7");
		 Set<Object> set1=new HashSet<>();
	  	 set1.add(laptop);
		 set1.add(laptop4);		
		 set1.add(laptop3);
		 int expected=2;
		 assertNotEquals(2,set1.size());
	}
	//test equality by equals method
	@Test
	public void testTwoObjectEquals() {
	  assertTrue(laptop.equals(laptop5));
	}
	//test equality by hashcode method
	@Test
	public void testTwoObjectHashCodeAreEqual() {
	   assertEquals(laptop.hashCode(), laptop5.hashCode());
	}

   }

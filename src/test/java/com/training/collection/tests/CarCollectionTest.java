package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.Car;
import com.training.collection.Laptop;

public class CarCollectionTest {
	Car car1,car2,car3;
	@Before
	public void setup()
	{
	   car1=new Car("Toyoto","Honda","2004",700000.83);
	   car2=new Car("Ferrari","maruti dzire","2011",600000.83);
       car3=new Car("Nissan","maruti","2006",500000.83);
		
	}

	//test to check sorting by arrayList collection
	@Test
	public void testSortingByArrayListCollection() {
				
		List<Car> list=new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		
	    Collections.sort(list);
	    Car expected[]= {car2,car3,car1};
	    System.out.println(list);
	    Car actual[]=new Car[3];
		Iterator<Car> iterator=list.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Car) iterator.next();
		    index++;
		}
		 System.out.println(Arrays.toString(actual));
		 assertArrayEquals(expected,actual);
	}
	//check sorting by Linked list
	@Test
	public void testSortingByLinkedListCollection() {
	
		List<Car> list2=new LinkedList<>();
		list2.add(car1);
		list2.add(car2);
		list2.add(car3);
		
	    Collections.sort(list2);
	    Car expected[]= {car2,car3,car1};
	    System.out.println(list2);
	    Car actual[]=new Car[3];
		Iterator<Car> iterator=list2.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Car) iterator.next();
		    index++;
		}
		 System.out.println(Arrays.toString(actual));
		 assertArrayEquals(expected,actual);
	  }
   
		
	/**
	 * Check the sorting order of collection treeset
	 */

	@Test
	public void testSortingByTreeSetCollection() {
	    Set<Car> set=new TreeSet<>();
		set.add(car1);
		set.add(car2);
		set.add(car3);
		Car expected[]= {car2,car3,car1};
	    System.out.println(set);
	    Car actual[]=new Car[3];
		Iterator<Car> iterator=set.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]=(Car) iterator.next();
		    index++;
		}
		 System.out.println(Arrays.toString(actual));
		 assertArrayEquals(expected,actual);
	  }

	/**It check that when we override equal and hashcode method for equality only to the
	 * make and model then even though year and price is not same but
	 *  make and model is same then it shows it as duplicate 
	 * 
	 */
	@Test
	public void testTheEqualityOfSetByMakeAndModel() {
		
		 Car car4=new Car("Toyoto","Honda","2004",700000.83);
		 Set<Object> set1=new HashSet<>();
	  	 set1.add(car1);
		 set1.add(car2);		
		 set1.add(car3);
		 set1.add(car4);
		 int expected=3;
		 assertEquals(3,set1.size());
		

	}
	/*It check that when we not override equal and hashcode method for equality
	 *  to other than make and model then even though year and price is same
	 *  it does not specify it as duplicate object
	 */
	
	@Test
	public void testTheEqualityOfSetIfMakeAndModelIsNotTheSame() {
		
		Car car4=new Car("Activa","activa","2004",700000.83);
		Set<Object> set1=new HashSet<>();
	  	 set1.add(car1);
		 set1.add(car2);		
		 set1.add(car3);
		 set1.add(car4);
		 int expected=3;
		 assertNotEquals(3,set1.size());
	}
   //check equality by make,model by equals method
	@Test
	public void testTwoObjectEquals() {
	  Car car4=new Car("Toyoto","Honda","2004",700000.83);;
	  assertTrue(car1.equals(car4));
	}
	//check equality by make,model by hashcode method
	@Test
	public void testTwoObjectHashCodeAreEqual() {
	   Car car4=new Car("Toyoto","Honda","2004",700000.83);
	   assertEquals(car1.hashCode(), car4.hashCode());
	}

	    
	}




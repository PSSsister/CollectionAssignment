package com.training.collection.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.Laptop;
import com.training.collection.Student;

public class StudentTest {

	
	@Before 
	public void setUp()
	{
		Student stud=new Student();
	}
	/*Test whether Insertion order is preserved or not preserved in set 
	   this method states that it preserve insertion order
	   */
	@Test
	public void testInsertionOrderArrayListCollection() {
		List<String> list=new ArrayList<>();
		list.add("Priyanka");
		list.add("Swati");
		list.add("Mansi");
		list.add("Divya");
        String expected[]= {"Priyanka","Swati","Mansi","Divya"};
		String actual[]=new String[4];
		Iterator<String> iterator=list.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]= iterator.next();
			index++;
		}
		assertArrayEquals(expected,actual);
   }
	/*Test whether Insertion order is preserved or not preserved in set 
	   this method states that it preserve insertion order
	   */
	   @Test
	   public void testInsertionOrderLinkedListCollection() {
		List<String> list=new ArrayList<>();
		list.add("Priyanka");
		list.add("Swati");
		list.add("Mansi");
		list.add("Divya");
		System.out.println(list);
		String expected[]= {"Priyanka","Swati","Mansi","Divya"};
		String actual[]=new String[4];
		Iterator<String> iterator=list.iterator();
		int index=0;
		while(iterator.hasNext())
		{
			actual[index]= iterator.next();
			index++;
		}
		assertArrayEquals(expected,actual);
	}
		
	 /*Test whether Insertion order is preserved or not preserved in set 
	   this method states that it doesn't preserve insertion order
	   */
	 @Test
     public void testTheInsertionOrderOfSet() {
		    Set<String> set=new HashSet<>();
		    set.add("Priyanka");
		    set.add("Swati");
		    set.add("Mansi");
		    set.add("Divya");
			String expected[]= {"Priyanka","Swati","Mansi","Divya"};
			String actual[]=new String[4];
			Iterator<String> iterator=set.iterator();
			int index=0;
			while(iterator.hasNext())
			{
				actual[index]= iterator.next();
			    index++;
			}
	        System.out.println(Arrays.toString(actual));
            assertNotEquals(expected,actual);

	 }
	 //Natural order is not preserved by using HashSet 
	 @Test
     public void testTheNaturalOrderofSetUsingHashset() {
		    Set<String> set=new HashSet<>();
		    set.add("Priyanka");
		    set.add("Swati");
		    set.add("Mansi");
		    set.add("Divya");
			//System.out.println(set);
			String expected[]= {"Divya","Mansi","Priyanka","Swati"};
			String actual[]=new String[4];
			Iterator<String> iterator=set.iterator();
		    int i=0;
			while(iterator.hasNext())
			{
				actual[i]=iterator.next();
			    i++;
			}
			System.out.println(Arrays.toString(actual));
			assertNotEquals(expected,actual);

	 }
	    //Natural order is  preserved by using Treeset and it doesn't preserve insertion order
		 @Test
	     public void testTheNaturalOrderofSetUsingTreeset() {
			    Set<String> set=new TreeSet<>();
			    set.add("Priyanka");
			    set.add("Swati");
			    set.add("Mansi");
			    set.add("Divya");
			    String expected[]= {"Divya","Mansi","Priyanka","Swati"};
				String actual[]=new String[4];
				Iterator<String> iterator=set.iterator();
				int i=0;
		        while(iterator.hasNext())
				{
		        	actual[i]= iterator.next();
				    i++;
		        }
		        System.out.println(Arrays.toString(actual));
		        assertArrayEquals(expected,actual);
		       
		 }
         //check retrieval of values by key
		 @Test
	     public void testMap() {
			   HashMap<String,String> hmap=new HashMap<>();
			    hmap.put("Priyanka","Pinneapple");
			    hmap.put("Swati","Mango");
			    hmap.put("Mansi","Guava");
			    hmap.put("Divya","WaterMelon");
			    assertEquals("Pinneapple",hmap.get("Priyanka"));
		 }	
				      


}



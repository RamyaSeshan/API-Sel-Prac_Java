package mandatoryHomeWork.Week15.Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class UniqueNumberofOccurrences_LC_1207 {
	
	// https://leetcode.com/problems/unique-number-of-occurrences/
	
	/*
	 * PSUEDO CODE 
	 * 
	 * declate temp =0
	 * Declare a map ,get array valies in Key and its occurance cnt in Value
	 * Iterate thur Map.entry , check if temp = value [ entry.getValue ] , then return false 
	 *    otherwise assign temp to value in entry.getValue
	 *  Finally when out of the loop return true 
	 * 
	 */


public boolean uniqueOccurrences(int[] arr) {
	
	Map<Integer , Integer > map = new HashMap<Integer , Integer >() ;	
	List<Integer> list = new ArrayList<Integer> ();
	
	for (int i : arr) {
		map.put(i, map.getOrDefault(i, 0) +1 ) ;		
	}
	
	for (Map.Entry<Integer , Integer> entry : map.entrySet()) {
		
		if ( list.contains(entry.getValue()) ) { return false ;}
		else list.add(entry.getValue()) ;
			
	}	
	return true;	
    }


@Test
public void test1()
{
	int[] arr = {1,2,2,1,1,3 };
	boolean uniqueOccurrences = uniqueOccurrences(arr) ;
	System.out.println(uniqueOccurrences);	
	}


@Test
public void test2()
{
	int[] arr = {1,2 };
	boolean uniqueOccurrences = uniqueOccurrences(arr) ;
	System.out.println(uniqueOccurrences);	
	}

@Test
public void test3()
{
	int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
	boolean uniqueOccurrences = uniqueOccurrences(arr) ;
	System.out.println(uniqueOccurrences);	
	}



@Test
public void test4()
{
	int[] arr = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
	boolean uniqueOccurrences = uniqueOccurrences(arr) ;
	System.out.println(uniqueOccurrences);	
	}


}

package DSA_DailyConnect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
//  Time Complexity : O[N] +  O[N]  ; Space Complexity O[N] +  O[N] 

public class Array_Intersect_LC_349 {
	
	 public Integer[] intersection1(int[] nums1, int[] nums2) {
		
		 Set<Integer> setA = new HashSet<Integer>();
		 List<Integer> list = new ArrayList<Integer>();
		 
		 for (Integer value : nums1) {			 
			 list.add(value);
		    }
		 
		for (Integer value : nums2) {
			
			if(list.contains(value))
			 {
				setA.add(value) ;
			 }
		  } 		 
		 
		int  size =setA.size() ;
		Integer[] arrayRes = setA.toArray(new Integer[size]);
		return arrayRes;
		  
	    }
	
	 
	 public Integer[] intersection(int[] nums1, int[] nums2) 
	 {
		Map <Integer , Integer> map = new HashMap<Integer , Integer>();
		 
		 
		 return null;
	 }
	 
 @Test
public void  Test1()
{
	int[] nums1 =  {1,2,2,1} , nums2 = {2,2} ;
	Object[] intersection = intersection( nums1,  nums2);
	
	for (Object object : intersection) {
		 System.out.println(object);
	    }	
}

 @Test
 public void  Test2()
 {
 	int[] nums1 =  {4,9,5} , nums2 = {9,4,9,8,4} ;
 	Object[] intersection = intersection( nums1,  nums2);
 	
 	for (Object object : intersection) {
 		 System.out.println(object);
 	    }	
 }
 	
	 
}

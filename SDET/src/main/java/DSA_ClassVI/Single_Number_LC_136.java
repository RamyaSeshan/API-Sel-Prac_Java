package DSA_ClassVI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

// https://leetcode.com/problems/single-number/description/
public class Single_Number_LC_136 {
	
public int singleNumber1(int[] nums) {	 // using HashMap
	
	Map<Integer ,Integer> map = new HashMap<Integer ,Integer>() ;
	
	for (int i = 0; i < nums.length; i++) {
		map.put(nums[i], map.getOrDefault(nums[i], 0) +1) ;
	}

	for(Map.Entry<Integer, Integer > entryset :  map.entrySet())
	{
		if(entryset.getValue() ==1 ) return entryset.getKey() ;
	}		
	return -1;        
    }

public int singleNumber(int[] nums) { // using hashset
	Set<Integer> set = new HashSet<Integer>() ;
	
	/*for (int i = 0; i < nums.length; i++) { // this will also work 
	  if (set.contains(nums[i])) 
	  {	set.remove(nums[i]) ;  }
	  else set.add(nums[i]) ;
	}*/
	
	for (int i = 0; i < nums.length; i++) {
		
		  if (set.add(nums[i]))  // set -add returns false 
		  {	set.add(nums[i]) ;  }
		  else set.remove(nums[i]) ;
		}
	return set.iterator().next() ;
}


@Test
public void Test1()
{
	int[] nums = {2,2,1} ;
	int singleNumber = singleNumber( nums) ;
	System.out.println(singleNumber);	
}

@Test
public void Test2()
{
	int[] nums = {4,1,2,1,2} ;
	int singleNumber = singleNumber( nums) ;
	System.out.println(singleNumber);	
}

@Test
public void Test3()
{
	int[] nums = {1} ;
	int singleNumber = singleNumber( nums) ;
	System.out.println(singleNumber);	
}

}

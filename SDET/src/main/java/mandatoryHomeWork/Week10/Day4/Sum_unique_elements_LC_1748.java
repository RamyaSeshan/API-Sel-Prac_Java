package mandatoryHomeWork.Week10.Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Sum_unique_elements_LC_1748 {
	
	 //https://leetcode.com/problems/sum-of-unique-elements/
	
	// Time Complexity O[Nlog N ]   ; Space Complexity O[N]
	
	/*
	 * Psuedo Code
	 *   Iterate and add values to map
	 *   Again Iterate thru Map.Entry , check if value 1 exixts , then add its corresponding key to count
	 *   return count  * 
	 *
	 */
	
	 public int sumOfUnique(int[] nums) {
		int count = 0;
		
		 Map<Integer , Integer> map = new  HashMap<Integer , Integer> (); 
		 
		 for (int i = 0; i < nums.length; i++) 
		 {  map.put(nums[i], map.getOrDefault(nums[i],0) +1 ) ;	  }
		
		 for (Map.Entry<Integer , Integer> entry : map.entrySet()) 
		 {
			if(entry.getValue() == 1)
			{count += entry.getKey() ;}
		 }	
		 return count;
		 
		 
	    }

	 
	 
@Test
public void Test1()
{
	int[] nums = {1,2,3,2};
	int sumOfUnique = sumOfUnique( nums) ;
	System.out.println(sumOfUnique);
}

@Test
public void Test2()
{
	int[] nums = {1,1,1,1,1};
	int sumOfUnique = sumOfUnique( nums) ;
	System.out.println(sumOfUnique);
}

@Test
public void Test3()
{
	int[] nums = {1,2,3,4,5};
	int sumOfUnique = sumOfUnique( nums) ;
	System.out.println(sumOfUnique);
}

}

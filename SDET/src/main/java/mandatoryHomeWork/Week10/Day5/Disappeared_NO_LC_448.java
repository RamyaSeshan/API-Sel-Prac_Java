package mandatoryHomeWork.Week10.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Disappeared_NO_LC_448 {
	  // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
	
	 public List<Integer> findDisappearedNumbers1(int[] nums) {
		
		 List<Integer> list = new ArrayList<Integer>();
		 
		 Arrays.sort(nums);
		 
		 for (int i = 1; i <= nums.length; i++) 
		 {			 
		if ( Arrays.binarySearch(nums, i) < 0 )
		  {
			list.add(i) ;
			}		
		 }		
		 return list;	        
	    }

	 public List<Integer> findDisappearedNumbers(int[] nums) {
		
		 
		 
		 return null; 
	 }
	 @Test
	 public void Test1()
	 {
		int[]  nums = {4,3,2,7,8,2,3,1 };
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums) ;
		System.out.println(findDisappearedNumbers);		 
	 }
	 
	 @Test
	 public void Test2()
	 {
		int[]  nums = {1,1 };
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums) ;
		System.out.println(findDisappearedNumbers);		 
	 } 
	 
}

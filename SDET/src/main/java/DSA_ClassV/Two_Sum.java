package DSA_ClassV;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Two_Sum {
	//https://leetcode.com/problems/two-sum/description/
	
	/*
	 * Psuedo Code //nums = [2,7,11,15], target = 9
	 * 
	 * sort the input array
	 * left =0 , right = nums.lenght -1
	 *   if take sum of nums[left] + nums[right] > target  , decrement  right 
	 *    if take sum of nums[left] + nums[right] < target  , increemtn   left
	 *    else add index right , left to int result  
	 * 
	 */
	
	 public int[] twoSum2(int[] nums, int target) { // This will NOT work in this optimized 2 p
		
		 Arrays.sort(nums);
		 int left =0 , right = nums.length-1 ;
		 
		 while (left <= nums.length-1 && right >=0 )
		 {  			 
			 if(nums[left] + nums[right]  > target ) { right--; }
			 else if (nums[left] + nums[right]  < target ) { left++; }
			 else if (nums[left] + nums[right]  ==  target ) return new int[] {left , right };		 
		 }
		 
		 return new int[] {0};	        
	    }
	 
	 public int[] twoSum1(int[] nums, int target)  // worked in brute force 
	 {
		
		 for (int i = 0; i < nums.length -1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if(nums[i] +nums[j] == target )
					return new int[] {i,j };				
			  }
		}		 
		 return new int[] { } ;
	 }

	 
	 public int[] twoSum(int[] nums, int target) // using hasMap  {2,7,11,15}
	 {
		Map<Integer ,Integer> map = new HashMap<Integer ,Integer>() ;	
		
		for (int i = 0; i < nums.length; i++) { 
			 if (map.containsKey(target -nums[i]) )
			 {
				return new int[] {map.get(target-nums[i]), i } ;
			 }
			 else 
				 {map.put(nums[i], i) ; } // 7 , 2
			 
		  }
		 return null;
		}

	
@Test
public void Test1()
{
	 int[] nums = {2,7,11,15} ; int  target = 9 ;
	 int[] twoSum = twoSum( nums,  target) ;
	 System.out.println(Arrays.toString(twoSum));}


@Test
public void Test2() //  2,3,4 
{
int[] nums = {3,	2,4} ; int  target = 6 ;
int[] twoSum = twoSum( nums,  target) ;
System.out.println(Arrays.toString(twoSum));
}

@Test
public void Test3()
{
int[] nums = {3,3} ; int  target = 6 ;
int[] twoSum = twoSum( nums,  target) ;
System.out.println(Arrays.toString(twoSum));
} 
}

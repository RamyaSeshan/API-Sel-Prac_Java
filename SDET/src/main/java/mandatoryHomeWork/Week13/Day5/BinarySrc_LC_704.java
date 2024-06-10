package mandatoryHomeWork.Week13.Day5;

import org.junit.Test;

public class BinarySrc_LC_704 {
	
	//https://leetcode.com/problems/binary-search/
	
	/*
	 * Psuedo COde 
	 * 
	 * find the mid of lenght of array and assign it to pointer
	 *  if nums[poninter ] = target  return pointer 
	 *  else if nums[poninter ] > target pointer --
	 *   else if nums[poninter ] < target pointer ++
	 * 
	 */
public int search1(int[] nums, int target) { // THis did not work for tets data 2 
	
	 int pointer = nums.length /2 ;
	// int  pointer = -1 ;
	 
	 while (pointer >=0 && pointer < nums.length  )
	 {
		 if (nums[pointer] == target ) return  pointer ;
		 else if (nums[pointer] < target ) pointer++;
		 else if (nums[pointer] > target ) pointer--;
	 }
	if (pointer  >=0 ) return pointer ;
	else return -1;        
    }


public int search(int[] nums, int target)  // Using Binary Search
{
	int L = 0 , R = nums.length-1  , mid =0 ;
				
	while (L <= R){
		mid = (L+R)/2;
		if(nums[mid] == target ) return mid;
		else if (nums[mid] < target) { L= mid+1 ; }
		else if (nums[mid] > target) { R= mid-1 ; }
	}
	
	return -1;
}

@Test
public void test1()
{
	int[] nums = {-1,0,3,5,9,12 } ; int  target = 9 ;
	int search = search(nums,  target) ;
	System.out.println(search);
}


@Test
public void test2()
{
	int[] nums = {-1,0,3,5,9,12} ; int  target = 2 ;
	int search = search(nums,  target) ;
	System.out.println(search);
}
}

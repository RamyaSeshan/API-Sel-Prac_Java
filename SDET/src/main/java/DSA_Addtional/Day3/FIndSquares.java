package DSA_Addtional.Day3;

import org.junit.Test;

public class FIndSquares {
	
	@Test
	public void test1()
	{
		int[] nums = {2,3,4,4,5};
		int[] squareAndSort = squareAndSort(nums) ;
		
		for (int i : squareAndSort) {
			System.out.print( i + " ");
		}
		
		System.out.print("-----------------");
	}
	
	@Test
	public void test2()
	{
		int[] nums = {-7, -5, 1, 4, 7};
		int[] squareAndSort = squareAndSort(nums) ;
		
		for (int i : squareAndSort) {
			System.out.print( i + " ");
		}
		System.out.print("------------------");
	}
	
	@Test
	public void test3()
	{
		int[] nums = {};
		int[] squareAndSort = squareAndSort(nums) ;
		
		for (int i : squareAndSort) {
			System.out.print( i + " ");
		}
		System.out.print("------------------");
	}
	

	public int[] squareAndSort(int[] nums) {
		int left =0 , right = nums.length -1 ;
		int[] sortedSQ = new int[ nums.length ];
		int insertIndex = nums.length -1 ;
		
		while (left <= right)
		{
			if  (   Math.abs(nums[left])   <   Math.abs(nums[right])   )
			{
				sortedSQ[insertIndex] = nums[right] * nums[right] ;
				right --;				
			}else 
			{
				sortedSQ[insertIndex] = nums[left] * nums[left] ;
				left ++;
			}
			
			insertIndex --;
		}
		return sortedSQ;
	}

}

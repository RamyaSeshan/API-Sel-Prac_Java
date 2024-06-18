package DSA_Addtional.Day2;

import org.junit.Test;

public class MoveZeroes {
	
	@Test
	public void test1()
	{
		int[] nums = {1,0,11,0,5,0};
		moveZeroesRight(nums);
		for (int i : nums) {
			System.out.print ( i  +" ");			
		}
		System.out.println("------------------------");
	}
	
	@Test
	public void test2()
	{
		int[] nums = {1,20,11,10,5,30};
		moveZeroesRight(nums);
		for (int i : nums) {
			System.out.print( i +" " );			
		}
		System.out.println("------------------------");
	}
	
	@Test
	public void test3()
	{
		int[] nums = {0,0,0,1};
		moveZeroesRight(nums);
		for (int i : nums) {
			System.out.print( i +" " );			
		}
		System.out.println("------------------------");
	}
	

	public void moveZeroesRight(int[] nums) {
		int p1 =0 , p2 = nums.length-1 ;
				
		while (p1 < p2 )
		{
			if (nums[p1] == 0 &&  nums[p2] !=0 )
			{
				nums[p1] = nums[p2] ;
				nums[p2]  =0 ; 
				p1++ ; p2--;
			}
			else if ( nums[p1] !=0 &&  nums[p2] ==0  ) { p1++;  p2--; }
			else if (  nums[p1] !=0 &&  nums[p2] !=0  ) p1++;
			else if (  nums[p1] ==0 &&  nums[p2] ==0  ) p1++; p2--;
		}
		
	}

}

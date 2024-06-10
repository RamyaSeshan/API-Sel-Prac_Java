package DSA_18Nov;

import java.util.Arrays;

import org.junit.Test;

public class Max_Prod_2Ele_Array_LC_1464 {
	
	@Test
	public void test1()
	{
		int [] nums = {3,4,5,2};
		int maxProduct = maxProduct( nums) ;
		System.out.println(maxProduct);
	}
	@Test
	public void test2()
	{
		int [] nums = {1,5,4,5};
		int maxProduct = maxProduct( nums) ;
		System.out.println(maxProduct);
	}

	@Test
	public void test3()
	{
		int [] nums = {3,7};
		int maxProduct = maxProduct( nums) ;
		System.out.println(maxProduct);
	}
	
public int maxProduct(int[] nums) { // takes 2 ms 
       
	  int prod = 0;	  
	  Arrays.sort(nums);
	  prod = (nums[nums.length -1 ] -1 ) * (nums[nums.length -2 ] -1 ) ;  
	  return prod;	  
    }

}

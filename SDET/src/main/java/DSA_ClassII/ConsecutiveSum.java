package DSA_ClassII;

import org.junit.Test;

/*
 * Psuedo Code
 * 
 * int sum =0 , int max =0 ; int index =0
 * int start = 0 ; next = start+k-1  
 * 
 * while (start < nums.lenght && next < nums.lenght)  // 152371
 * {
 *    index = start ;
 *    while (index < = next)
 *    {
 *     sum = sum+nums[index];
 *    index++;   
 *    } 
 *   if (max < sum ) { max = sum ;}
 *   if (next < nums.lenth-1 )
 *    {
 *    sum=0; 
 *    start = start +1 ; next = start+k-1) ; } 
 * 
 * }
 */
public class ConsecutiveSum {
	
	public int conseSum(int [] nums , int target)
	{
	int sum =0 ; int max =Integer.MIN_VALUE ; int index =0 ;
	int start = 0 ; int next = start+target-1  ;
 	
	 while (start <= nums.length-1 && next <= nums.length-1)  // 152371
		 {
		 index = start ;
		 while (index <= next)
		  {
		  sum = sum+nums[index];
		  index++;   
		 } 
		
		 if (max < sum ) { max = sum ;}		
		  
		 sum=0; 
		 start = start +1 ; next = (start+target)-1 ; 	 
		
	   }		
		return max;
	}

	
	@Test
	public void Test1()
	{
		int [] nums = { 1,5,2,3,7,1};
		 int target =3;
		int conseSum = conseSum(nums ,  target);
		System.out.println(conseSum);		
	}
	
	@Test
	public void Test2()
	{
		int [] nums = { 1,5,2};
		 int target =3;
		int conseSum = conseSum(nums ,  target);
		System.out.println(conseSum);		
	}
	
	@Test
	public void Test3()
	{
		int [] nums = { 1,5,2};
		 int target =4;
		int conseSum = conseSum(nums ,  target);
		System.out.println(conseSum);		
	}
	
	@Test
	public void Test4()
	{
		int [] nums = { -1,-5,-7};
		 int target =3;
		int conseSum = conseSum(nums ,  target);
		System.out.println(conseSum);		
	}
}

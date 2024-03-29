package Interview_Practise;

import org.junit.Test;

public class PivotIndex_LC_724_WKIII_HW 
{
	@Test
	public void test1()
	{
		int[] nums =  { 1,7,3,6,5,6 } ;
		int pivotIndex = pivotIndex(nums) ;
		System.out.println("test1 -- " + pivotIndex);
	}
	
	@Test
	public void test2()
	{
		int[] nums =  { 1,2,3} ; // 0,5  | 1 ,3  | 
		int pivotIndex = pivotIndex(nums) ;
		System.out.println("test2 -- " + pivotIndex);
	}
	
	@Test
	public void test3()
	{
		int[] nums =  {2,1,-1} ; // 0,5  | 1 ,3  | 
		int pivotIndex = pivotIndex(nums) ;
		System.out.println("test3 -- " + pivotIndex);
	}
	

	public int pivotIndex(int[] nums) {
		
		int leftsum =0 , rightsum =0 ,j =0;
		
		for (int i = 1; i < nums.length; i++) {
			rightsum = rightsum + nums[i] ;
		}
		
		while (j < nums.length)
		{					
			if ( leftsum ==  rightsum)  return j ;
			else 
			{				
				leftsum = leftsum +nums[j] ;
				if( j < nums.length -1  )  rightsum = rightsum -  nums[j +1 ] ;
				j++;
			}
		}
		
		return -1; 
		

	}
}

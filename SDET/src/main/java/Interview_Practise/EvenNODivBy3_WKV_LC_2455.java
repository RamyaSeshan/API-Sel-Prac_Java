package Interview_Practise;

import org.junit.Test;

public class EvenNODivBy3_WKV_LC_2455 {
	
	
	@Test
	public void test1()
	{
		int[] nums = {1,3,6,10,12,15 };
		int averageValue = averageValue(nums) ;
		System.out.println( averageValue  );
	}
	
	@Test
	public void test2()
	{
		int[] nums = {1,2,4,7,10};
		int averageValue = averageValue(nums) ;
		System.out.println( averageValue  );
	}


	public int averageValue(int[] nums) {
		
		int count =0;
		int i =0 , sum =0;
		while ( i < nums.length )
		{
		if (nums[i] % 6 ==0  ) 						
		 { count ++; sum = sum + nums[i] ; }			
		i++;
		}
				
		return count==0 ? 0: sum /count;	
		
	}

}

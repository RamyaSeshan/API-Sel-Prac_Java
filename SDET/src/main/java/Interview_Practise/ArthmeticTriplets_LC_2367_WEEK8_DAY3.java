package Interview_Practise;

import org.junit.Test;

public class ArthmeticTriplets_LC_2367_WEEK8_DAY3
{

	 @Test
	 public void test1()
	 {
			int[] nums = {0,1,4,6,7,10} ;
			int diff = 3 ;
			int arithmeticTriplets = arithmeticTriplets( nums,  diff)  ;
			System.out.println( " arithmeticTriplets ---" + arithmeticTriplets);
	 }
	 
	 
	 @Test
	 public void test2()
	 {
			int[] nums = {4,5,6,7,8,9} ;
			int diff = 2 ;
			int arithmeticTriplets = arithmeticTriplets( nums,  diff)  ;
			System.out.println( " arithmeticTriplets test 2 ---" + arithmeticTriplets);
	 }
	 
	 @Test
	 public void test3()
	 {
			int[] nums = {0,8,9,10} ;
			int diff = 3 ;
			int arithmeticTriplets = arithmeticTriplets( nums,  diff)  ;
			System.out.println( " arithmeticTriplets test 3 ---" + arithmeticTriplets);
	 }

	public int arithmeticTriplets(int[] nums, int diff) {  // 0,1,4,6,7,10 
		int count =0 ;
		int left =0 , right = left + 1  , secRight = 0;
		
		while ( left < nums.length - 1  && right < nums.length )
		{
			if(nums[right] - nums[left] < diff) right ++;
			else if ( nums[right] - nums[left]  > diff ) left ++ ;
			else if (  nums[right] - nums[left]  == diff  )
			{
				if(right != nums.length -1 )  secRight = right ;
				
				while ( right < nums.length - 1  && secRight < nums.length )
				{
					if( nums[secRight] - nums[right]  > diff  ) break;
					else if( nums[secRight] - nums[right]  < diff  ) secRight ++;
					else if ( ( nums[secRight] - nums[right])  ==  diff )   { count ++ ; break ; }
				}				
				
				left = left + 1; right = left +1 ;
			}			
		}
		
		return count;
	}

}

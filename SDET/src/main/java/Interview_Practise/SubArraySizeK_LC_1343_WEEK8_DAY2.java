package Interview_Practise;

import org.junit.Test;

public class SubArraySizeK_LC_1343_WEEK8_DAY2 
{
	@Test
	public void test1()
	{
		int [] arr = {2,2,2,2,5,5,5,8 } ;
		int k = 3, threshold = 4 ;
		int numOfSubarrays = numOfSubarrays(  arr , k , threshold) ;
		System.out.println(  numOfSubarrays  );
	}

	@Test
	public void test2()
	{
		int [] arr = {11,13,17,23,29,31,7,5,2,3} ;
		int k = 3, threshold = 5 ;
		int numOfSubarrays = numOfSubarrays(  arr , k , threshold) ;
		System.out.println(  numOfSubarrays  );
	}
	
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		
		int pointer = 0 ,  CurrentSum =0 , avg =0 , count = 0;
		while (pointer < k )
		{
			CurrentSum = CurrentSum + arr[pointer ++ ] ;
		}
		
		
		while (pointer  < arr.length)
		{
			avg = CurrentSum / k ;
			if ( avg >= threshold  ) count = count+1 ;
			
			CurrentSum = CurrentSum + arr[pointer ] ;
			CurrentSum = CurrentSum - arr[ pointer - k  ];
			
			pointer++ ;			
		}
		
		avg = CurrentSum / k ;
		if ( avg >= threshold  ) count = count+1 ;

		return count ;
	}


}

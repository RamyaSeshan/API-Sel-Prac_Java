package Interview_Practise;

import org.junit.Test;

public class SqOfSorterArrays_LC_977_WKII_HW
{
	//@Test
	public void test1()
	{
		int[] nums = {-4,-1,0,3,10 };
		int[] sortedSquares = sortedSquares( nums) ;
		
		for (int i : sortedSquares)
		{
			 System.out.print( "  " + i);
		}
	}
	
	@Test
	public void test2()
	{
		int[] nums = {-7,-3,2,3,11};   //        121 49  9   
		int[] sortedSquares = sortedSquares( nums) ;
		
		for (int i : sortedSquares)
		{
			 System.out.print( "  " + i);
		}
	}
	

	public  int[] sortedSquares(int[] nums) {
		
     int k;
	int l =0 , r = k =nums.length -1  ;
	int[] res = new int [ nums.length  ] ;
	  
	  while ( l <= r  &&  k >=0)
	  {
		  if ( nums [l] * nums [l] >= nums [r] * nums [r] )
		  {
			  res[k] =   nums [l] * nums [l] ;
			   l  = l +1 ;
			   
		  }else if ( nums [l] *  nums [l]  <  nums [r] * nums [r] )
		  {
			  res[k] =   nums [r] * nums [r] ;
			  r = r -1 ;
		  }
		  
		
		  
		  k = k -1 ;
	  }
	  
	  return res ;

	}
}

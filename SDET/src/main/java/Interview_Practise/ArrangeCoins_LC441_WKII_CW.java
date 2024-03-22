package Interview_Practise;

import org.junit.Test;

public class ArrangeCoins_LC441_WKII_CW {
	
	/*
	 * Sum of 1 to n number , mathematical formula is : n * (n +1 ) / 2 
	 * Here we can use Binary Search 
	 * intialize left =0 , right = n , mid = left + (right -left ) /2 
	 * k =  mid + (mid +1  ) /2 
	 */
	@Test
	public void test1()
	{
		int n =5 ;
		int arrangeCoins = arrangeCoins( n) ;
		System.out.println("test 1 ---" +arrangeCoins);
	}
	

	@Test
	public void test2()
	{
		int n =8 ;
		int arrangeCoins = arrangeCoins( n) ;
		System.out.println("test 2 ---" +arrangeCoins);
	}
	
	public int arrangeCoins(int n) 
	{
		int left =0 , right = n , mid , k;
		
		
		
		while (left  <= right )
		{
			mid = left +   (right - left ) /2  ;
			k= mid  *   (mid+1 ) / 2  ;
		   
		  if( k==n ) return mid ;
		  else if ( k < n ) left = mid + 1;
		  else right = mid -1 ;
		
		}
		
		return -1;
		
	}
	public int arrangeCoins_BF(int n) 
	{
	    int count = 0 , i =1;
	    
		while ( i <= n )
		{
			n = n - i;
			i++;
			count ++;
		}
		
		
		return count;
		
	}
	

}

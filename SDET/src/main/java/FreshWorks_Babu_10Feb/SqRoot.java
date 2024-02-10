package FreshWorks_Babu_10Feb;

import org.junit.Test;

public class SqRoot {
	
	@Test
	public void test1()
	{
		int num = 8;
		//int num = 100;
		int sqrt = sqrt(num);
		System.out.println( " sqrt is  " +sqrt);
	}

	public  int sqrt_BF(int num) {
	
		for (int i = 0; i < num / 2 ; i++) 
		{
			if( i * i > num ) return i -1;
		}
		
		return 0;
	}
	
	/*
	 * 1. if the number is zero or one , return itself (num)
			 2. initalize left with one and right with x/2;
			 3. assing int output =0;
			 4. iterate the while left less than or equal right
			    find the middle point mid = left + (right - left) / 2;
			    find the sqrt, sqrt = mid * mid ;
			 check:
			       if x == sqrt , return mid;
			       else if sqrt < x , left = mid +1 , output =mid ;
			       else right = mid -1 ;
	 */	 
			
			 
	public  int sqrt(int num)
	{
		if ( num ==0 || num ==1  ) return 1 ;
		int left = 1 , right = num / 2 , result = 0 ,mid , sq   ;
		
		while ( left <= right )  // 2,2
		{
			mid = left + ( right - left ) / 2 ;  // 3
			sq =  mid * mid  ; //9
			
			if(num == sq) return mid ;
			else if (sq < num )   {  left = mid + 1 ; result = mid ;  } 
			else right = mid -1 ;
		}
		
		return result  ;
		
	}

}

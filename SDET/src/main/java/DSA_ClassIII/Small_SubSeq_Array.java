package DSA_ClassIII;

import org.junit.Test;

public class Small_SubSeq_Array {
	
	/* DSA Class 3 -- On 23 Sep 2023 
	 * given an array of pos integers , find the smallest sub sequence array lenght 
	 * whose sum of elements is greater than given no k 
	 * 
	 * input int[] nums =  { 1,2,3,4,5}  k =10 
	 * 
	 * output 3 
	 * 
	 * PSUEDO CODE 
	 * input k=3 ; winSize =0  // [4,2,7,11,7,6,25 ] k =20    4 6 

left = right =0 ; currSum=0

currSum = currSum + nums[right ] 

while (right <  nums.len )

{

if( currSum < =  k)
{
right ++ ;
currSum = currSum + nums[right]
 
}  
else (currSum >  k )
{
   tempWinSize = right -left +1 ; // 4-1 +1 = 4 
if ( winSize <  tempWinSize) winSize = tempWinSize; //4  4
currSum = currSum - nums[left]   
left++;

}

return winSize

}
      O[N X M ] -- Time and Space Complexity
	 */

	
	public int small_subArray1(int[] nums  , int k )
	{
	
		int left =  0 , right =0  , currSum=0  ,winSize =0  , tempWinSize ;
		//currSum = currSum + nums[right] ;
		
		while (right < nums.length ) // { 1,2,3,4,5} k =10 
		{			
			if( currSum < k)
			{
				 currSum = currSum + nums[right] ;				
			      {right ++ ; }
			  	 		 
		    }
			else if ( currSum >= k)
			{
				tempWinSize = right - left +1 ;
			
				if(winSize < tempWinSize )   winSize = tempWinSize;
				currSum = currSum - nums[left] ;	
		
				left++;	
		
			}
		}
	return winSize ;
}
	
	public int small_subArray(int[] nums  , int k )
	{

		int left =  0 , right =0  , currSum=0  ,winSize =Integer.MAX_VALUE , tempWinSize =0 ;
		
		while ( right <= nums.length)
		{			
			if (currSum <= k  ) 
			{
			    if (right == nums.length  )  break; 
			    currSum = currSum + nums[right++];			  
			}
			else if (currSum > k  ) 
			{
				tempWinSize = right - left ;
				if (winSize > tempWinSize ) { winSize = tempWinSize ;}			
				if (left == nums.length  )  break; 
				else
					currSum = currSum - nums[left++];		
			}
		}
		return winSize;
	}
	
@Test
public void Test1()
{
	int[] nums =  { 1,2,3,4,5} ; int  k = 10  ;
	int small_subArray = small_subArray(nums  , k );
	System.out.println(small_subArray);		
}

@Test
public void Test2()
{
	int[] nums =  { 4,2,7,11,7,6,} ; int  k = 20 ;
	int small_subArray = small_subArray(nums  , k );
	System.out.println(small_subArray);		
}

@Test
public void Test3()
{
	int[] nums =  { 4,2,7,11,7,6,25} ; int  k = 20 ;
	int small_subArray = small_subArray(nums  , k );
	System.out.println(small_subArray);		
}
}

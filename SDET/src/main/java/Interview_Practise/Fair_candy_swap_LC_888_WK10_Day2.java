package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Fair_candy_swap_LC_888_WK10_Day2 
{
	@Test
	public void Test1()
	{
		int[] aliceSizes = {1,1}, bobSizes = {2,2} ;
		int[] fairCandySwap = fairCandySwap( aliceSizes,  bobSizes) ;
		for (int i : fairCandySwap) {
			System.out.println(i);
		}
	}

	public  int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
	{
		Set<Integer> set = new HashSet<Integer>() ;
		int bobTotal =0  , aliceTotal = 0 , diff =0  ,temp;
		
		for (int i = 0; i < bobSizes.length; i++) 
		{
			bobTotal = bobTotal+ bobSizes[i] ; // 4
		}
		//System.out.println( "bobTotal   " +bobTotal);
		
		for (int i = 0; i < aliceSizes.length; i++) 
		{
			aliceTotal = aliceTotal+ aliceSizes[i] ; //2 
			set.add(aliceSizes[i] ) ;			
		}
		//System.out.println( "aliceTotal   " +aliceTotal);
		diff =  ( aliceTotal - bobTotal ) / 2 ; // -1
		
		System.out.println( "diff   " +diff);
		
		for (int i = 0; i < bobSizes.length; i++) 
		{
			temp = bobSizes[i] + diff ;
			//System.out.println( "temp   " +temp);
			
			if (set.contains(  temp)  ) 
			    return new int[] { bobSizes[i] , temp } ;
			
		}
				
		return null;
	}



}

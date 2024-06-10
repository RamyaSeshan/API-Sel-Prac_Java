package mandatoryHomeWork.Week10.Day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Fair_candy_swap_LC_888 {
	
	//https://leetcode.com/problems/fair-candy-swap/
	
	/* Time Complexity : O[N ] + O [N]  ; Space Complexity - O[N]
	 * PSUEDO code
	 *   1.Get total sum of aliceCandies and Bob Candies 
	 *   2.Put one of the person candies ina set 
	 *   3.Find the diffrence of aliceCandies &  Bob Candies  and divide it by 2 [ because if we have diff 5 candies , then we need to 
	 *     balce the share by giving 2.5 to both of them ]
	 *  4.iterate thur the person candies who is NOT added to set 
	 *    --> get the temp value as current candie in the box + diff  [ diff found in syep 3 ]
	 *    --> check if this temp value exists in set , if so return current candie  and value that matches in set 
	 *    
	 */
	
	 public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		
		 int bobTotal = 0 , aliceTotal = 0 ,temp ;
		 Set <Integer> set = new HashSet<Integer>() ;
		 
		 for (int i : bobSizes) {
			 bobTotal += i;
		}
		 
		for (int j : aliceSizes) {
			aliceTotal += j ;
			set.add(j);
		} 
	
		int diff = (aliceTotal -bobTotal  )/2;	
		
		for (int bobCandie : bobSizes) {
			
			temp = bobCandie + diff;
			if(set.contains(temp))
			{
				return new int[] {temp , bobCandie };
			}		
				}		
		 return null;
	        
	    }

	 @Test
	 public void Test1()
	 {
		 int[] aliceSizes = {1,1}, bobSizes = {2,2} ;
		 int[] fairCandySwap = fairCandySwap( aliceSizes,  bobSizes) ;
		 for (int i : fairCandySwap) {
			  System.out.println(i);
		   }
	 }
	 
	 @Test
	 public void Test2()
	 {
		 int[] aliceSizes = {1,2}, bobSizes = {2,3} ;
		 int[] fairCandySwap = fairCandySwap( aliceSizes,  bobSizes) ;
		 for (int i : fairCandySwap) {
			  System.out.println(i);
		   }
	 }
	 
	 
	 @Test
	 public void Test3()
	 {
		 int[] aliceSizes = {2}, bobSizes = {1,3} ;
		 int[] fairCandySwap = fairCandySwap( aliceSizes,  bobSizes) ;
		 for (int i : fairCandySwap) {
			  System.out.println(i);
		   }
	 }
}

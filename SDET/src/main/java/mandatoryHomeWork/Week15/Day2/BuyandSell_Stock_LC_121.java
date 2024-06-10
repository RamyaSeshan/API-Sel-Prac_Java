package mandatoryHomeWork.Week15.Day2;

import org.junit.Test;

public class BuyandSell_Stock_LC_121 {
	
	 //  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	
	/*  Time Complexity  -- O[N]  ; Space Complexity -- O[1]
	 * Psuedo code
	 * declare var max = 0, currentMax   //prices = [7,1,5,3,6,4] 
	 * Iterate thru the array in outer for loop
	 *  -- > Iterate thru array from 2nd element [ i+1] in inner for loop 
	 *  --> check if prices[i] < prices[j] , then 
	 *    --> currentMax =  prices[j] - prices[i] 
	 *    --> check if currentMax > max , then max = currentMax ;
	 * finally return max
	 */

	 public int maxProfit1(int[] prices) {
	      int max =0 , currentMax , i=0;
	      while  ( i < prices.length -1) {
	    	  for (int j = i+1; j < prices.length; j++) 
	    	  {
	    		  if(prices [i] < prices[j])
	    		  {	  currentMax = prices[j]- prices [i];
	    			  if(currentMax > max ) max = currentMax;
	    		  }			
			  }	
	    	 i++;
		}	   
	      return max;
	    }
	 
	 public int maxProfit(int[] prices) //7,1,5,3,6,4
	 {
		  int max =0 , currentMax , buyPrice = Integer.MAX_VALUE ;
		  
		  for (int i = 0; i < prices.length; i++)
		  {
			if (prices[i] < buyPrice) buyPrice = prices[i] ;
			
			currentMax= prices[i]- buyPrice;
			if (currentMax > max) max = currentMax;				
		  }
		
		  return max;
	 }
 @Test
public void test1()
{
	 int[] prices = {7,1,5,3,6,4};
	 int maxProfit = maxProfit( prices) ;
	 System.out.println(maxProfit);
}
 
 @Test
public void test2()
{
	 int[] prices = {7,6,4,3,1};
	 int maxProfit = maxProfit( prices) ;
	 System.out.println(maxProfit);
}
}

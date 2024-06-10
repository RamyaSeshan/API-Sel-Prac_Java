package mandatoryHomeWprk;

import org.junit.Assert;
import org.junit.Test;

public class StriaghtLine_LC_1232 {
	//https://leetcode.com/problems/check-if-it-is-a-straight-line/ 
	
	/*
	 * PSUEDO CODE 
	 * Input  2 dim int array
	 * Output -- boolean value 
	 * 
	 * Solution Known : Yes 
	 * Alternate / additional approach : NO 
	 * 
	 * Logic:
	 * dec 2 dimetional array 
	 * in for loop till lenght of 2 dim array row lenght 
	 *   check (A[i][0] != A[i-1][0]+1  ||  A[i][1] != A[i-1][1]+1) , return false 
	 *   (ie) always x cordinate equala prior x co -or +1 AND Y co or equals prioe Y cor +1 
	 * otherwise , post completion of for loop , return true
	 *   
	 */

	public boolean TwoDimArray(int[][] A)
	{
		for (int i =  A.length-1; i >0 ; i--) {		  
			if (A[i][0] != A[i-1][0]+1  ||  A[i][1] != A[i-1][1]+1)
			{
				return false;
			}					  
		}	return true; } 

	@Test
	public void chkStLine()
	{
		int[][] A = {{1,2},{2,3},{3,4} ,{4,5},{5,6},{6,7}};			
	Assert.assertEquals(TwoDimArray(A), true);

	}

	@Test
	public void test2()
	{
		int[][] A = {{1,1},{2,2},{3,4} ,{4,5},{5,6},{7,7}};
		Assert.assertEquals(TwoDimArray(A), false);
	}
	
	

	@Test
	public void test3()
	{
		int[][] A = {{1,1},{2,2},{3,3} ,{4,4},{5,5},{7,7}};
		Assert.assertEquals(TwoDimArray(A), true);
	}

}

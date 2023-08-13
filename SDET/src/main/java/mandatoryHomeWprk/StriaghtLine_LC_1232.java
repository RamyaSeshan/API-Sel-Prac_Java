package mandatoryHomeWprk;

import org.junit.Assert;
import org.junit.Test;

public class StriaghtLine_LC_1232 {

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

}

package Interview_Practise;

import org.junit.Test;

public class ReturnIndices 
{
	
	@Test
	public void test1()
	{
		int[] A = {2,3,5,7};
		int target = 9 ;
		int[] targetSum = targetSum(A , target );
		for (int i : targetSum)  
		{
			System.out.println(i);
		}
	}

	public int[] targetSum(int[] a, int target) {
		
		int left =0 , right = a.length -1 ;
		
		while ( left <=  a.length -1  &&  right >= 0)
		{
			if (a[left] + a [right] == target) return new int[] { left , right  } ;
			else if (a[left] + a [right] > target ) right = right -1 ;
			else if (a[left] + a [right] <  target) left = left + 1; 			
		}
		return null;		
	}

}

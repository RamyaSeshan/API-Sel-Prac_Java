package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MissingNo_LC_268_WKIII_HW 
{
	@Test
	public void test1()
	{
		int[] nums = {3,0,1} ;
		int missingNumber = missingNumber( nums) ;
		System.out.println( "test 1 --- " +missingNumber);
	}
	
	@Test
	public void test2()
	{
		int[] nums = {0,1} ;
		int missingNumber = missingNumber( nums) ;
		System.out.println( "test 2 --- " +missingNumber);
	}
	

	public int missingNumber(int[] nums) {
		Set<Integer> set = new HashSet<  Integer>() ;
		int j =0 ;

		for (int i = 0; i < nums.length; i++) 
		{
			set.add(nums[i] ) ;
		}

		while (j < nums.length +1  )
		{
			if (  !set.contains(j)  ) return j;
			j ++;
		}
		return -1;

	}
}

package DSA_Addtional.Day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemoveElement {


	/*
	 * static array and dynamic array !!
	 * 
	 * static array --> Length fixed --> number of elements is declared at the begining
	 * you cannot resize them --> resize?? --> create another array (Arrays.copyOf)
	 * 
	 * Dynamic array --> Array size that can change (grow or shrink) 
	 * List / Set / Map  
	 * 
	 */

	@Test
	public void test1()
	{
		int[] nums = {5,3,2,1,2,3};
		int target =  3;
		int[] removeElement = removeElement(nums, target);
		//System.out.println( removeElement );

		for (int i : removeElement) {
			System.out.println( i );
		}
		System.out.println( "----------------------------" );
	}


	@Test
	public void test2()
	{
		int[] nums = {};
		int target =  3;
		int[] removeElement = removeElement(nums, target);
		//System.out.println( removeElement );

		for (int i : removeElement) {
			System.out.println( i );
		}
		System.out.println( "----------------------------" );
	}
	public int[] removeElement(int[] nums, int target) {
		List<Integer> list = new ArrayList<Integer>() ;

		for (int i : nums)
		{
			if (i != target) list.add(i) ;
		}

		int[] result = new int[list.size()] ;

		for (int i = 0; i < list.size(); i++) 
		{
			result[i] = list.get(i) ;
		}

		return result;
	}

}

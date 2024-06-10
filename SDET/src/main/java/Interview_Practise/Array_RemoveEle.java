package Interview_Practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Array_RemoveEle {
	
	// Time Complexity O[N] , SPace Complexity O[N]
	
	@Test
	public void test1()
	{
		int[] nums = {10,20,40 ,50 ,60 ,60 ,20};
		int target = 60 ;
		Object[] remove_Ele = remove_Ele(nums , target) ;
		
		
		for (Object object : remove_Ele) 
		{
			System.out.println("  " + object);
		}
	}

	public  Object[] remove_Ele(int[] nums, int target) 
	{
		List<Integer> list = new ArrayList<Integer>() ;
		
		for (Integer val : nums) 
		{
			if( ! list.contains(val)) list.add(val) ;
		}
		
		Object[] array = list.toArray() ;
		return array ;
		
	}

}

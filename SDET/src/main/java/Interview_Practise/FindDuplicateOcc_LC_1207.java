package Interview_Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class FindDuplicateOcc_LC_1207 
{
	@Test
	public void test1()
	{
		int[] arr = {1,2,2,1,1,3 };
		boolean uniqueOccurrences = uniqueOccurrences( arr)  ;
		System.out.println(uniqueOccurrences);
	}
	
	@Test
	public void test2()
	{
		int[] arr = {1,2};
		boolean uniqueOccurrences =  uniqueOccurrences( arr)  ;
		System.out.println("test 2 --- " +uniqueOccurrences);
	}
	
	@Test
	public void test3()
	{
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		boolean uniqueOccurrences =  uniqueOccurrences( arr)  ;
		System.out.println("test 3--- " +uniqueOccurrences);
	}

	public  boolean uniqueOccurrences(int[] arr) {
		Map<Integer , Integer> map = new HashMap< Integer , Integer >() ;
		Set <Integer > set = new HashSet< Integer>() ;
		
		for (Integer val : arr) {
			
			map.put(val, map.getOrDefault(val, 0) + 1 ) ;
		   } 
		
		
	
		for (Map.Entry<Integer, Integer > entry :map.entrySet()) 
		{
			if ( !  set.contains(entry.getValue()))  set.add(entry.getValue()) ;
			else return false;
		}
		return true;		
		

	}
}

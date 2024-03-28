package Interview_Practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class INtersectionOfArray_LC_349_WKIII_HW 
{

	// https://leetcode.com/problems/intersection-of-two-arrays/description/

	@Test
	public void test1()
	{
		int[] nums1 = {1,2,2,1} ;
		int[] nums2 = {2,2 } ;
		Object[] intersection = intersection(nums1,  nums2) ;
		
		for (Object object : intersection)
		{
			System.out.print( " " +object);
		}
	}

	public Object[] intersection(int[] nums1, int[] nums2) 
	{
		Set<Integer> set = new HashSet< Integer >() ;
		List<Integer > list = new ArrayList< Integer >() ;

		for (int i = 0; i < nums1.length; i++) 
		{
			if ( !set.contains(nums1[i]))   set.add(nums1[i]) ;
		}

		 System.out.println(set);
		 
		for (int i = 0; i < nums2.length; i++) 
		{
			if ( set.contains( nums2[i] ))  
				{
				if (!  list.contains(nums2[i]))
				list.add(nums2[i]) ;
				}
		}
        System.out.println(list);
		return list.toArray() ;
	}

}

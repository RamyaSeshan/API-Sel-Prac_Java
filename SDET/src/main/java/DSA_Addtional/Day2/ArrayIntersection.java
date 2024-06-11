package DSA_Addtional.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayIntersection {

	@Test
	public void test1()
	{
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {2,12};
		List<Integer> intersection = intersection(nums1, nums2);
		System.out.println( intersection );		
	}

	@Test
	public void test2()
	{
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {1,2,11,12};
		List<Integer> intersection = intersection(nums1, nums2);
		System.out.println( intersection );		
	}
	
	@Test
	public void test3()
	{
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {123,123,212};
		List<Integer> intersection = intersection(nums1, nums2);
		System.out.println( intersection );		
	}


	public List<Integer> intersection(int[] nums1, int[] nums2) {

         Arrays.sort(nums1) ;  Arrays.sort(nums2);
		int p1 =0  , p2 =0 ;
		List<Integer> list = new ArrayList<Integer>() ;

		while ( p1 < nums1.length && p2 < nums2.length)
		{
			if (nums1[p1] == nums2[p2] ) {  list.add(nums1[p1] )  ; p1++ ; p2++ ;} 
			else if ( nums1[p1] < nums2[p2] ) p1++;
			else if ( nums1[p2] < nums2[p1] ) p2++;
		}

		return list;
	}

}

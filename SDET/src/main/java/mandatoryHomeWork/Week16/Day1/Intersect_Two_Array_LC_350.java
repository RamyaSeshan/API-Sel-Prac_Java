package mandatoryHomeWork.Week16.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Intersect_Two_Array_LC_350 {
	
	 // https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
	
	/*/
	 * Sort both the arrays
	 * have pointer p1 for array1 and p2 for array 2
	 * iterate in while loop while p1 < array1.len and p2 < array2.len
	 *  check if arrayIele at p1 == arrayIIele at p2 , then add to list , incremen p1 & p2
	 *   -- if arrayIele at p1 < arrayIIele at p2 incremen p1 , otherwise incremen p2
	 * convert list to array and return
	 * 
	 */
	
public int[] intersect(int[] nums1, int[] nums2) { // takes 3 ms 
	
	Arrays.sort(nums1); Arrays.sort(nums2);
	List<Integer> list = new ArrayList<Integer>() ;
	int p1 = 0 , p2 =0 ;	
	
	while ( p1 < nums1.length && p2 < nums2.length)
	{
		if(nums1[p1] == nums2[p2])
		{	
			list.add(nums1[p1]) ;
			p1 ++; p2++ ;			
		}else 
		{
			if(nums1[p1] < nums2[p2]) {p1 ++; }
			else  { p2 ++ ; }
		}
	}    
	int[] result = new int[list.size()] ;
	for (int i = 0; i <list.size(); i++) {
		result[i] = list.get(i) ;
 	}
	return result;
    }



@Test
public void test1()
{
	int[] nums1 = {1,2,2,1 } ;int[]  nums2 = {2,2} ;
	int[] intersect = intersect( nums1,  nums2) ;
	
	for (int i : intersect) {
		System.out.println(i);
	}
}


@Test
public void test2()
{
	int[] nums1 = {4,9,5 } ;int[]  nums2 = {9,4,9,8,4} ;
	int[] intersect = intersect( nums1,  nums2) ;
	
	for (int i : intersect) {
		System.out.println(i);
	}
}
}

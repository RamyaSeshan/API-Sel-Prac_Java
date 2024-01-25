package Interview_Practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Array_Intesrsect {
	
	// Brute force will be O[N2]
	// 2 Pointer O[N]
	
	/*/
	 * Psuedo Code for Brute Force 
	 *   using 2 loops , iterate thur 1st loop
	 *   compare its values with vales in second array in second loop
	 *   if it matches , add to list and brek out of second loop	
	 */
	
	/*/
	 * Psuedo code for 2 Pointers [ for ascending sorted arrays ]
	 *   take 2 pointers poiting to firt ele of array 1 and array 2 respectively
	 *    if array1 of p1 and array2 of p2 match -- add to list and increment both the pointer 
	 *    if array1 of p1  < array2 of p2 , , increment p1 else increment p2
	 *   
	 */
	
	/*@Test
	public void test_Array_Intesrsect1 () 
	{		
		int[] nums1 = {1,2,3,4,6,7 };
		int[] nums2 = {4,5,8,9,10,12 } ;
		List<Integer> verify_Array_Intesrsect = verify_Array_Intesrsect(nums1 , nums2 );
		System.out.println(verify_Array_Intesrsect);
	}
	
	@Test
	public void test_Array_Intesrsect2 () 
	{		
		int[] nums1 = {1,2,3,14,6,7 };
		int[] nums2 = {4,5,8,9,10,12 } ;
		List<Integer> verify_Array_Intesrsect = verify_Array_Intesrsect(nums1 , nums2 );
		System.out.println(verify_Array_Intesrsect);
	}
	@Test
	public void test_Array_Intesrsect3 () 
	{		
		int[] nums1 = {1,2,3,4,5,7 };
		int[] nums2 = {4,5,8,9,10,14 } ;
		List<Integer> verify_Array_Intesrsect = verify_Array_Intesrsect(nums1 , nums2 );
		System.out.println(verify_Array_Intesrsect);
	}
	
	
	@Test
	public void test_Array_Intesrsect4 () 
	{		
		int[] nums1 = {12,10,11,1};
		int[] nums2 = {12,8,1,0, } ;
		List<Integer> verify_Array_Intesrsect = verify_Array_Intesrsect_desc(nums1 , nums2 );
		System.out.println(verify_Array_Intesrsect);
	}*/

	@Test
	public void test_Array_Intesrsect5 () 
	{		
		int[] nums1 = {1,10,12};
		int[] nums2 = {12,8,1,0, } ;
		List<Integer> verify_Array_Intesrsect = verify_Array_Intesrsect_asc_desc(nums1 , nums2 );
		System.out.println(verify_Array_Intesrsect);
	}
	
	private List<Integer> verify_Array_Intesrsect_BF(int[] nums1, int[] nums2) {
		
		List<Integer> list = new ArrayList<Integer>() ;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) 
				{ list.add(nums1[i] ) ;
				break;}			
		}		
		}
		return list;	
}
	
private List<Integer> verify_Array_Intesrsect_asc(int[] nums1, int[] nums2) { // ascending array 
		
		List<Integer> list = new ArrayList<Integer>() ;
		int p1 =0 , p2 =0 ;
		
		while(p1 < nums1.length && p2 < nums2.length ) 
		{
			if (nums1[p1] == nums2[p2]) { list.add(nums1[p1]) ; p1++ ; p2++ ;}
			else if (nums1[p1] < nums2[p2]) p1++ ;
			else p2++;
		}
		return list;	
}

private List<Integer> verify_Array_Intesrsect_desc(int[] nums1, int[] nums2) { // descending array 
	
	List<Integer> list = new ArrayList<Integer>() ;
	int p1 =nums1.length -1, p2 =nums2.length -1  ;
	
	while(p1 >=0 && p2 >=0 ) 
	{
		if (nums1[p1] == nums2[p2]) { list.add(nums1[p1]) ; p1-- ; p2-- ;}
		else if (nums1[p1] < nums2[p2]) p1-- ;
		else p2--;
	}
	return list;	
}
	

private List<Integer> verify_Array_Intesrsect_asc_desc(int[] nums1, int[] nums2) { // Asc Array 1 & descending array 2
	
	List<Integer> list = new ArrayList<Integer>() ;
	int p1 =0 ,p2 =nums2.length -1  ;
	
	while(p1 < nums1.length && p2 >=0 ) 
	{
		if (nums1[p1] == nums2[p2]) { list.add(nums1[p1]) ; p1++ ; p2-- ;}
		else if (nums1[p1] < nums2[p2]) p1++ ;
		else p2--;
	}
	return list;	
}

}

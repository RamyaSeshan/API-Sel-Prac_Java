package DSA_Addtional.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class MergeSortedArray {
	
	@Test
	public void test1()
	{
		int[] nums1 = {1,2,4};
		int[] nums2 = {2,3,5};
		mergeArray(nums1, nums2) ;
		//List<Integer> mergeArray = mergeArray(nums1, nums2);
		//System.out.println(  "test1 -- " +mergeArray);
	}
	
	@Test
	public void test2()
	{
		int[] nums1 = {1,2,4};
		int[] nums2 = {2,3,5};
		mergeArray(nums1, nums2) ;
		//List<Integer> mergeArray = mergeArray(nums1, nums2);
		//System.out.println(  "test1 -- " +mergeArray);
	}
	

	public List<Integer> mergeArray1(int[] nums1, int[] nums2) {
	
		List<Integer> list = new ArrayList< Integer >() ;
		int left =0 , right =0 ;
		
		while ( left < nums1.length && right < nums2.length )
		{
			if (nums1[left] <= nums2[right])
			{
				list.add(nums1[left]) ; left ++ ;
			}else 
			{
				list.add( nums2[right]) ; right ++ ;
			}
		}
		
		if ( left <= nums1.length -1 )
		{
			for (int i = left; i <=  nums1.length -1; i++) {
				list.add(nums1[i]) ;
			}
		}else if ( right <= nums2.length -1)
		{
			for (int i = right; i <=  nums2.length -1; i++) {
				list.add(nums2[i]) ;
			}
		}
		
		return list;
		
	}
	
	public void mergeArray(int[] nums1, int[] nums2)
	{
		int[] res = new int[ nums1.length + nums2.length ] ;
		System.out.println( "res lenght -- " +res.length );
		
		int left =0 , right =0 ,index =0 ;
		
		while (left < nums1.length  ||  right < nums2.length  )
		{
			if(left == nums1.length)
			{ res[index ++ ] = nums2[right ++] ; }		
			else if  (right == nums2.length)
			{res[index ++ ] = nums1[left ++] ; }	
			
			
			if(nums1[left] <= nums2[right]) {  res[index ++ ] = nums1[left ++]  ; }
			else 
			{  res[index ++ ] = nums2[right ++] ;   }				
			
		}
		
		System.out.println(   Arrays.toString(res)   );
		
	}

}

package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InterSectEle_2Array {
	
	@Test
	public void test1()
	{
		Integer[] nums1 = new Integer[] { 10, 20,30,40 ,50 } ;
		Integer[] nums2 =  new Integer[] { 100, 200,300,400 ,50 ,60, 70  } ;
		
		Integer find_Intersect = find_Intersect(nums1 , nums2) ;
		System.out.println(find_Intersect);
	}
	
	@Test
	public void test2()
	{
		Integer[] nums1 = new Integer[] { 10, 20,30,40 ,50 } ;
		Integer[] nums2 =  new Integer[] { 100, 200,300,400 ,500 ,60, 70  } ;
		
		Integer find_Intersect = find_Intersect(nums1 , nums2) ;
		System.out.println(find_Intersect);
	}
	

	public Integer find_Intersect(Integer[] nums1, Integer[] nums2)
	{
	  List<Integer> list = Arrays.asList(nums1) ;
	 // System.out.println(" The list is " + list );
	  
	  for (Integer val : nums2) 
	  {
		
		  if ( list.contains(val))  return val ;
      }
	  
	  return -1 ; 
	}

}

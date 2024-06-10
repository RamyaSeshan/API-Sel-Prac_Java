package DSA_18Nov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Diff_TwoArray_LC_2215 {
	
	// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
	
	/*
	 * Brute force -- Psuedo code 
	 *  iterate array 1 in outer loop and array 2 in inner loop
	 *   in the begining of the secong inner loop , add array of i value to list
	 *  check if outer loop arrya value == inner loop array value , then remove array 1 of i value from list and break  
	 *  repeat the same steps with array2 in outer loop and array1 in inner loop and add values to list 2 
	 *  finally return both the list in another list 
	 */

	@Test
	public void Diff_TwoArray_LC_2215()
	{
		//int[] nums1 = {1,2,3,3} ,nums2 = {1,1,2,2 };
		int[] nums1 = {1,2,3} ,nums2 = {2,4,6}; // 1  2 4 6 
		 List<List<Integer>> findDifference_BF = findDifference_2Pointers( nums1, nums2) ;
		 System.out.println(findDifference_BF);		
	}

	
	@Test
	public void Diff_TwoArray_LC_2215_TC02()
	{
		int[] nums1 = {1,2,3,3} ,nums2 = {1,1,2,2 };
		//int[] nums1 = {1,2,3} ,nums2 = {2,4,6}; // 1  2 4 6 
		 List<List<Integer>> findDifference_BF = findDifference_2Pointers( nums1, nums2) ;
		 System.out.println(findDifference_BF);		
	}
	
	public void findDifference(int[] nums1, int[] nums2) {  // this is NOT the right one 
		List<Integer> list1 = new ArrayList<Integer>() ;
		List<Integer> list2 = new ArrayList<Integer>() ;
		
		for (int i = 0; i < nums1.length; i++) {
			if(! list1.contains(nums1[i])) { list1.add(nums1[i]) ; }
			
			for (int j = 0; j < nums2.length; j++) 
			{
				if (nums1[i] == nums2[j]) 
				{  
					list1.remove(list1.size() -1 ) ;					
				    break ;
				}		
						}		
				}	
		
		
		for (int i = 0; i < nums2.length; i++) {
			if(! list2.contains(nums2[i])) { list2.add(nums2[i]) ; }
			
			for (int j = 0; j < nums1.length; j++) 
			{
				if (nums2[i] == nums1[j]) 
				{  
					list2.remove(list2.size() -1 ) ;				
				     break ;
				}		
						}		
				}	
		
		
		System.out.println("------------------") ;
		System.out.println(list1);
		System.out.println("------------------") ;
		System.out.println(list2);
	}
	
	/*
	 * Psuedo code -- BF 
	 * declare 2 list of Integer 
	 *  traverse thur first array till its lenght
	 *   -->intiallt set a flag as false 
	 *   -->iterate thru secobf for loop till lenght if 2nd array 
	 *       --> check if array 1 element == array 2 element at the given index , if so change the flag to TRUE and break 
	 *   --> outside the second array loop , if Flag is NOT FALSE , add to list 1 
	 *   Repeat above steps for with change in Array for ist and seconf loop
	 */

	public List<List<Integer>>  findDifference_BF(int[] nums1, int[] nums2) // Takes 92 ms  , Time Complexity O[N2] + O [N2] 
	{
		List<Integer> list1 = new ArrayList<Integer>() ;
		List<Integer> list2 = new ArrayList<Integer>() ;
		List<List<Integer>> list = new ArrayList<List<Integer>>() ;
		Boolean flag ;
		Arrays.sort(nums1); Arrays.sort(nums2);
		
		for (int i = 0; i < nums1.length; i++) {
			flag = false ;
			for (int j = 0; j < nums2.length; j++) 
			{
				if (nums1[i] == nums2[j])
				{flag = true; 	break ; }				
			}
			if (! flag) 
			{   if ( ! list1.contains(nums1[i]))
				     {   list1.add(nums1[i]) ;	 }		
		    }		
	}
		
		for (int i = 0; i < nums2.length; i++) {
			flag = false ;
			for (int j = 0; j < nums1.length; j++) 
			{
				if (nums2[i] == nums1[j])
				{flag = true; 	break ; }				
			}
			if (! flag) 
			{   if ( ! list2.contains(nums2[i]))
				     {   list2.add(nums2[i]) ;	 }		
		    }						
		}		
	
		list.add(list1) ; list.add(list2) ;
		return list;		
}

		/*
	 * Psuedo code
	 * sort both the array
	 * declare 2 list and an list of list 
	 * left = 0 , right = 0 
	 * iterate while left < nums.len and right < nums2.lenght 
	 *   check if nums1 elemment < nums2 element , then add nums1 element to list 1 and increment left
	 *   check if nums2 elemment < nums1 element ,  increment left
	 *   else increment left and right 
	 * 
	 * chekc if left < nums1.len , otherwise add remaining num1 ele to left 
	 * chekc if right < nums2.len , otherwise add remaining num1 ele to right 
	 * 
	 * 
	 * 
	 */
		
	public List<List<Integer>>  findDifference_2Pointers(int[] nums1, int[] nums2) // took 7 ms Time Complexity - - O[N]
	{
		List<Integer> list1 = new ArrayList<Integer>() ;
		List<Integer> list2 = new ArrayList<Integer>() ;
		List<List<Integer>> list = new ArrayList<List<Integer>>() ;
		int left =0 , right =0;
		Arrays.sort(nums1); Arrays.sort(nums2);		
		
		while (left < nums1.length && right < nums2.length )
		{
			if (nums1[left] < nums2[right]) 
			{  
				if ( list1.isEmpty()  ||   list1.get(list1.size()- 1) != nums1[left] )
				{ 	list1.add(nums1[left] ) ;  }
				left ++;			
			}
			else if (nums1[left] > nums2[right])
			{
				if ( list2.isEmpty()  ||   list2.get(list2.size()- 1) != nums2[right]  )
				{ 	list2.add(nums2[right] ) ;  }
				right ++;   		
			}
			else if (nums1[left] == nums2[right]) 
			{  left = left + 1  ; right = right +1 ;			
			
			while( right < nums2.length && nums2[right ] == nums2[right -1 ]   )
			{	right ++;  }
			
			while( left < nums1.length  && nums1[left ] == nums1[left  -1 ] )
			{	left ++;  }
						
			}			
			
		}	
		
		while (left < nums1.length) 
		{
			if (list1.isEmpty()  ||   list1.get(list1.size()- 1) != nums1[left] )
			{ 	list1.add(nums1[left] ) ; }
			 left ++;
			 
			 while( left < nums1.length  && nums1[left ] == nums1[left  -1 ] )
				{	left ++;  }
		}
		
		while (right < nums2.length)
		{
			if ( list2.isEmpty()  ||   list2.get(list2.size()- 1) != nums2[right] )
			{list2.add(nums2[right] ) ;  }
			right ++;	
			
			while( right < nums2.length && nums2[right ] == nums2[right -1 ]   )
			{	right ++;  }
			
		}
		
		list.add(list1) ; list.add(list2) ;
		return list;		
	}
	
	
}

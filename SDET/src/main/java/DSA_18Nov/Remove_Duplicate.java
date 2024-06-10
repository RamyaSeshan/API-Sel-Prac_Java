package DSA_18Nov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Remove_Duplicate {
	
	/*/
	 * Psuedo Code 
	 *   1,1,2,3, 
	 *   
	 *   iterate thru 2 loop , in first loop take value and chk with secong loop elem
	 *     if it matches , move forward , else add to list and break
	 *     
	 *     when we use hash O[N ] 
	 */

	/*
	 * Psuedo code -- 2 Pointers  1,1,1,2,3,3  
	 *  
	 */
	@Test
	public void test_Remove_Duplicate () 
	{		
		int[] nums1 = {1,2,2,4,4,1 };		
		// int[] verify_Remove_Duplicate = verify_Remove_Duplicate(nums1 );
		verify_Remove_Duplicate(nums1 );
	//System.out.println(Arrays.toString(verify_Remove_Duplicate));
	}

	private int[] verify_Remove_Duplicate_BF(int[] nums) { // 1,1,2,3,3,
		
		List<Integer> list = new ArrayList<Integer>() ;
		for (int i = 0; i < nums.length; i++) {
			if( !list.contains(nums[i]))
			 {list.add(nums[i]) ; }				
		}
		
		////System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			 nums[i] = list.get(i) ;
			System.out.println(nums[i]);
		}
		return nums;		
	}
	
	private void verify_Remove_Duplicate(int[] num) //{1,2,2,4,4,1 }; 2 Pointer 
	{
		 int  j = 1;
	        for (int i = 1; i < num.length; i++) {
	            if(num[i]!=num[i-1]){
	                num[j]=num[i];
	                j++; 
	                
	            }
	        }
	        System.out.println(Arrays.toString(num));
	        System.out.println("unique count   " + (j-1));
	}
}

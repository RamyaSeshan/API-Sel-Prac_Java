	package mandatoryHomeWork.Week15.Day1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MajorityElement_LC_169 {	
		
	//https://leetcode.com/problems/majority-element/
	
	/*  Time Comlexity O[N]  ; Space Complexity O[1]
	 * PSUEDO CODE 
	 * declate var max =0 
	 * declare a map , have key as Arrayele and have counter in vlaue 
	 * iterate thur array and add values in Map
	 * Iterate thur Map.entry , if value > arraysize /2 and greater than max , set it to result
	 * return result	 * 
	 * 
	 */
	
	 public int majorityElement(int[] nums) {  // This is most Optimized
		 int result = 0 , max =0 ;
		 Map<Integer , Integer > map = new HashMap<Integer , Integer>() ;
		 int size = nums.length /2 ;
		 
		 for (int i = 0; i < nums.length; i++) 
		 {			 
			 map.put(nums[i], map.getOrDefault(nums[i], 0) +1) ;			 
			/* if(map.get(nums[i]) > size )
			 {
				// max = map.get(nums[i]);
				return nums[i] ;	
				} */
		}	
	 
        for (Map.Entry<Integer, Integer>  entry : map.entrySet()) {
		 
		if ( entry.getValue() > size && entry.getValue() > max )
		{
			max = entry.getValue() ;
			result = entry.getKey() ;
		}		
	   }	 
		return result;	        
	    }
	
	 public static int MajorityOcc(int[] nums )
		{
		    int count =1 ;	
			for (int i = 0; i < nums.length; i++) { // [1,2,1,2,1]
				for (int j = i+1; j < nums.length; j++) {
					
					if(nums[i] == nums[j])
					{
						count = count+1;
					}
					
					if (count >  (nums.length)/2)
					{ return nums[i];  }
			
			}
				count=1;
			}
			return -1;
			
		}

	 @Test
	 public void Test1()
	 {
		 //int[] nums = {3,2,3} ;
		 int[] nums = {2,2,1,1,1,2,2} ;
		 //int majorityElement = majorityElement(nums) ;
		 int majorityOcc = MajorityOcc( nums ) ;
		 System.out.println(majorityOcc); 		
	 }
	 
	 
	 @Test
	 public void Test2()
	 {
		 int[] nums = {2,2,1,1,1,2,2} ;
		 int majorityElement = majorityElement(nums) ;
		 System.out.println(majorityElement); 		
	 }

	 @Test
	 public void Test3()
	 {
		 int[] nums = {2,1,1,5,4,2} ;
		 int majorityElement = majorityElement(nums) ;
		 System.out.println(majorityElement); 		
	 }
	 
}

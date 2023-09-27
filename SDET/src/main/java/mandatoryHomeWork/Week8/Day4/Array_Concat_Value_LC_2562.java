package mandatoryHomeWork.Week8.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

//https://leetcode.com/problems/find-the-array-concatenation-value/description/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] nums| output int

2.Frame Test data (valid, invalid, complex and edge cases)
Input: nums = [7,52,2,4]
Output: 596

Input: nums = [7,52,2,4]
Output: 596

Input: nums = [52]
Output: 52

Input: nums = [1]
Output: 1

3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

1.convert nums to list , declare int concat =0 , temp=0
2.declare left = list[0] , right =list.size-1
3.Iterate in while loop  left < = right
   --> cancat list[left] and list[right] and assign it t string 
   --> convert string to int and assign it to temp
   --> add temp and cancat
   --> delete values list[left] and list[right]
   --> increment left and decrement right 
4.return cancat

   while (left <= right)
   String s =  list[left] +list[right]+""
   temp = Integer.parseInt(s);
   cancat = cancat+temp
   list.remove(left) and list.remove(left)
   left++ ; right--


7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */


public class Array_Concat_Value_LC_2562 {
	
	 public long findTheArrayConcVal(int[] nums) { //{5,14,13,8,12};
		 int  temp=0 ,  i,j;	
		 long concat =0;
		 if(nums.length ==1 ) return nums[0];
		 int left = 0 , right = nums.length-1 ;		
		 
		 while (left < right)
		   { 		
				 i = nums[left]; j = nums[right];
				 String s = ""+i ;
				 s = s+j;
			
				temp = Integer.parseInt( s);
				concat =concat+temp;
			
				 left++ ; right-- ;					 			 
			 }
		 
		 if(left == right)
		 {
			 concat = concat+nums[left];
		 }
		 return concat;	
		 }		
	
	 
	 /*
	  * Psuedo code
	  * 
	  * 1.declare int cancat , left , right ,mid , temp  AND String left , right  
	  * 2.get the lenght of num array , calculate mid , left and right 
	  * 3.declare int cancat , left , right
	  * 4.check if array lenght is odd , assign cancat = mid value 
	  * 5.Iterate thru while loop till  left > = 0 and right <= nums.len-1
	  *   --> a.assign nums[left ] to String left and nums[left ] to String right  [  left =nums[left] , right = nums[right]   ]
	  *   --> convert to integer value  [ temp = Interger.parseInt(left+right) ]
	  *   --: add that to cancat [ cancat = cancat +temp ]
	  *    
	  * 6.return cancat 
	  *   
	  */
	 public long findTheArrayConcVal1(int[] nums) 
	 {
		if(nums.length == 1) return nums[0] ;
		 
		int left ,right , mid , temp ;
		long cancat = 0 ;
		String sleft ,sright ;
		
		mid = nums.length /2 ;
		left = mid -1;
		
		if(nums.length %2 == 0)
		  {right = mid ; }
		else
		  {	right = mid +1 ;
			 cancat = nums[mid] ;
		  }		
		
		while (left >= 0 && right < nums.length)
		{
			sleft = nums[left] +"";
			sright = nums[right] +"";
			
			temp = Integer.parseInt(sleft + sright) ;			
			cancat = cancat + temp;	
			temp =0;
			left-- ; right++;
		}		
		 return cancat; 
	 }
	 
@Test
public void Test1()
{
	 int[] nums =  {7,52,2,4};
	 long findTheArrayConcVal = findTheArrayConcVal( nums); // 522 +74  = 
	 System.out.println(findTheArrayConcVal);
}


@Test
public void Test2()
{
	 int[] nums =  {5,14,13,8,12};  //  13+148+512 = 673
	 long findTheArrayConcVal = findTheArrayConcVal( nums);
	 System.out.println(findTheArrayConcVal);	 
} 

@Test
public void Test3()
{
	 int[] nums =  {5};  // 512 + 148 =  660 +13 
	 long findTheArrayConcVal = findTheArrayConcVal( nums);
	 System.out.println(findTheArrayConcVal);	 
} 


@Test
public void Test4()
{	
int[] nums =
{3432,1461,9408,1439,2367,7539,2927,1015,5397,8879,6827,4187,524,4113,7001,1300,9667,2058,4258,4406,2469,2774,573,7398,9586,6870,7355,4020,6147,5830,3953,6760,1786,5161,5919,7692,23,9298,4719,9116,4637,487,9865,9222,309,6642,6707,3603,3914,4549,8037,6815,6730,3256,5081,7388,5339,5956,5857,3933,8948,94,6793,5300,7199,3989,4371,4013,5622,5433,3157,8211,532,2249,7579,1074,8921,4570,9082,1279,4940,1616,6683,89,8620,9859,727,6688,801,9045,8488,7193,8972,597,8881,8163,7410,640,9424,5487,4823,4968,6647,2037,8535,8826,5583,8041,3650,4036,971,3350,3832,9908,1889,7753,7671,1872,5011,6872,3268,2253,9001,8491,7841,1749,7600,3885,1693,4690,9461,9283,2497,1129,1552,7392,9360,879,158,7077,695,6910,463,4782,8278,688,537,9359,285,2070,4984,7337,891,8877,8111,8084,5614,400,565,2404,2547,1996,9896,438,8499,1542,2358,7657,7397,9974,8929,5349,3398,6553,5431,3271,9861,7441,6113,5526,1172,1928,3370,4326,2738,2977,1113,7514,872,5017,9110,2921,1288,4935,8882,4149,3412,9310,4724,3934,3461,1535,3922,98};
long findTheArrayConcVal = findTheArrayConcVal( nums);
System.out.println(findTheArrayConcVal);
}



}

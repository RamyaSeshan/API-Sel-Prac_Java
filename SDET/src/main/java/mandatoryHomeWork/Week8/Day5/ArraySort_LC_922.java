package mandatoryHomeWork.Week8.Day5;

import java.util.Arrays;

import org.junit.Test;

	//https://leetcode.com/problems/sort-array-by-parity-ii/description/

/*
Time & Space Complexity -- O[N]
PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] nums| output int

2.Frame Test data (valid, invalid, complex and edge cases)
Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 
Input: nums = [0,3]
Output: [0,3]

Input: nums = [3,0]
Output: [0,3]


3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)   //4,2,5,7   || 2,3

1.declare 2 pointers  left =0 , right= nums.lenght-1 , temp =0
2.iterate thru while loop till left <= nums.lenght-1 and right >=0
   
   --> check if nums[left] %2==0 , then left = left+2
   --> otherwise check if nums[right] %2 !=0 , then right = right-2
   --> otherwise 
       --> temp = nums[left] , nums[left] = nums[right] , nums[right] = temp
       --> increment left by2  and decrement right by 2
4.return int [] nums


7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */
public class ArraySort_LC_922 {
	
	
public int[] sortArrayByParityII(int[] nums) {
	
	int left =0 , right= nums.length-1 , temp =0 ;
	
	while( left <= nums.length-1 &&  right >=0)
	{
		if (nums[left] %2 == 0 ) left = left +2 ;
		else if (nums[right] %2 !=0 ) right = right -2 ;
		else 
		{
			temp = nums[left]; nums[left] = nums[right] ; nums[right] = temp ;
			left = left +2 ;
			right = right -2 ;			
		}		
	}	
	return nums;        
    }


@Test
public void Test1()
{
	int[] nums = {4,2,5,7};  // 4 2 7 5 
	int[] sortArrayByParityII = sortArrayByParityII( nums) ;
	System.out.println(Arrays.toString(sortArrayByParityII));
}

@Test
public void Test2()
{
	int[] nums = {2,3};
	int[] sortArrayByParityII = sortArrayByParityII( nums) ;
	System.out.println(Arrays.toString(sortArrayByParityII));
}

@Test
public void Test3()
{
	int[] nums = {3,2};
	int[] sortArrayByParityII = sortArrayByParityII( nums) ;
	System.out.println(Arrays.toString(sortArrayByParityII));
}

@Test
public void Test4()
{
	int[] nums = {1,0};
	int[] sortArrayByParityII = sortArrayByParityII( nums) ;
	System.out.println(Arrays.toString(sortArrayByParityII));
}
}

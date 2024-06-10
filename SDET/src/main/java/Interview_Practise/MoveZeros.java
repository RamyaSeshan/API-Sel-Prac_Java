package Interview_Practise;

import org.junit.Test;

public class MoveZeros 
{

	/*
	 *   L 0 R NON0 --  MOVE BOTH
	 *   L0 R 0 -- MOVE L
	 *   LNON 0 R 0  MOVE SWAP & MOVE BOTH 
	 *   LNON R NON -- MOVE R 
	 *   
	 */

	@Test
	public void test1()
	{
		int[] nums = {0,1,2,0,0 } ;  
		int[] moveZero = moveZero(nums) ;
		for (int i : moveZero) {
			System.out.println(i);
		}
	}

	public int[] moveZero(int[] nums) {
     
		int left =0 , right = nums.length -1 ;
		int temp ;
		
		while (left <= nums.length -1  && right >=0)
		{
			if(nums[left] !=0 && nums[right] !=0)
			{
				 right --;
			}else if (nums[left] ==0 && nums[right] ==0)
			{
				left ++ ;
			}else if (nums[left] !=0 && nums[right] ==0)
			{
				temp = nums[left] ;
				nums[left] =nums[right] ;
				nums[right] = temp ;
				System.out.println("nums[left]  is " + nums[left]  + "nums[right]  is "  +nums[right] );
				left ++ ;right -- ;
			}else 
			{
				left ++ ; right -- ;
			}
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println("---------------------------");
		return nums;
		

	}


}

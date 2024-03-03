package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Disappeared_NO_LC_448_Week10_Day5 

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

{
	@Test
	public void Test1()
	{
		int[]  nums = {4,3,2,7,8,2,3,1 };
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums) ;
		System.out.println(findDisappearedNumbers);		 
	}

	@Test
	public void Test2()
	{
		int[]  nums = {1,1 };
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums) ;
		System.out.println( " test 2 " +findDisappearedNumbers);		 
	} 
	
	@Test
	public void Test3()
	{
		int[]  nums = { 2,2};
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums) ;
		System.out.println( " test 3 " +findDisappearedNumbers);		 
	} 
	

	public List<Integer> findDisappearedNumbers_1(int[] nums) 
	{
		Set<Integer> set = new HashSet< Integer >() ;
		List< Integer > list = new ArrayList< Integer >() ;

		for (int i = 0; i < nums.length; i++) 
		{
			set.add(nums[i]) ;
		}

		for (int i = 0; i < nums.length  ; i++) 
		{
			if ( ! set.contains(i + 1 )) list.add(i+ 1  ) ;
		}


		return list;
	}


	public List<Integer> findDisappearedNumbers(int[] nums)  //   1,1,2,2
	{
		Arrays.sort(nums);
		int temp =1  , i =0 ;
		List< Integer > list = new ArrayList< Integer >() ;

		while ( i < nums.length )
		{		

			if(  nums [i]  == temp  ) { temp = temp + 1  ;  i = i + 1 ;}
		
			else if (  i == nums.length -1 && nums [i] == nums [i -1 ]    ) 
			{
				list.add(temp) ;
				i =  i + 1 ;					
				
			}
			
			else if (  i !=0  && nums [i] == nums [i -1 ]) { i = i+1 ;}
			else if ( nums [i]  != temp )
			{
				list.add(temp) ;
				temp ++;
				i = i+ 1;
			}

		}

		return list;

	}



}

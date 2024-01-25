package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindSingleEle 
{
	// TimeComplexity :  O[1]   SpaceComplexity : O[N]

	@Test
	public void test1()
	{
		int[] nums = { 1,2,2,3,3,5,5,1,1,8 };
		Integer findSinNo = findSinNo(nums) ;
		System.out.println(findSinNo);
	}

	public Integer findSinNo(int[] nums) 
	{

     Map<Integer , Integer> mapA = new HashMap<Integer , Integer>() ;
     
     for (int i = 0; i < nums.length; i++) 
     {
		mapA.put(nums[i], mapA.getOrDefault(mapA.get(nums[i]), 0) +1 ) ;
	 }
     
     System.out.println(mapA);
     
     
     for (Map.Entry<Integer, Integer>  entry : mapA.entrySet() ) 
     {
		if(entry.getValue() == 1 ) return entry.getKey();
	 }
     
	 return -1;

	}
}

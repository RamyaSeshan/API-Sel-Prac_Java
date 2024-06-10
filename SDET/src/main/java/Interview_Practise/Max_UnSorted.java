package Interview_Practise;

import org.junit.Test;

public class Max_UnSorted {
	
@Test
public void test1()
{
	//int[] nums = {10, 1 ,-10 ,20 ,50 , 0 };
	int[] nums = {-10, -1 ,-10 ,-20 ,-50 , 0 };
	  int find_Max = find_Max(nums) ;
	  System.out.println(find_Max);
}

private int  find_Max(int[] nums) {
	
	int max = Integer.MIN_VALUE ;
	
	for (int i : nums) {
		if ( i > max ) { max = i ;}
	}	
	return max;	
}

}

package HackerRankAss_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Problem_II {
	
	public static List<Integer> performOperations (List<Integer> arr , List<List<Integer>> operations)
	{		
		int start =0 , end =0  ,temp; // 9,8,7,6,5,4,3,2,1,0  
		
		for (List<Integer> i : operations) {
			start= i.get(0);
			end= i.get(1);
			
			while (start < end )
			{	
				temp = arr.get(start) ;
				arr.set(start, arr.get(end)  );
				arr.set(end, temp );
				start++ ; end--;
			}
		}		
		return arr;	
		
/*
 * 
int start =0 , end =0 ,i=0 ,temp; // 9,8,7,6,5,4,3,2,1,0  
		
		while (i < operations.size())
		{
			start= operations.get(i).get(0);
			end= operations.get(i).get(1);
			
			while (start < end )
			{
				temp = arr.get(start) ;
				arr.set(start, arr.get(end)  );
				arr.set(end, temp );
				start++ ; end--;
			}	
			i++;
		}		
		return arr;		
 */
	}

	
	@Test
	public void test1()
	{

		/*List<Integer> aaa = new ArrayList<Integer>( ){{
	        add(9);
	        add(8);
	        add(7); add(6); add(5); add(4); add(3); add(2); add(1); add(0);
	          } }; */

  
  List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
  
	listOfList.add(new ArrayList<Integer>(Arrays.asList(0,9)));
	
	List<Integer> result = performOperations(new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9)), listOfList);
	System.out.println(result);
	
	
	
}
}

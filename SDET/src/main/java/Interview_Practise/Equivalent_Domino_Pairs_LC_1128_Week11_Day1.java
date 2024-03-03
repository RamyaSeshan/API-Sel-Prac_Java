package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Equivalent_Domino_Pairs_LC_1128_Week11_Day1 
{
	//@Test
	public void Test1()
	{
		int[][] dominoes =  {{1,2},{2,1},{3,4},{5,6} } ;
		int numEquivDominoPairs = numEquivDominoPairs( dominoes);
		System.out.println(numEquivDominoPairs);
	}
	
	//@Test
	public void Test2()
	{
		int[][] dominoes =  {{1,2},{1,2},{1,1},{1,2}, {2,2} } ;
		int numEquivDominoPairs = numEquivDominoPairs( dominoes);
		System.out.println("test 2 " +numEquivDominoPairs);
	}
	
	
	@Test
	public void Test3()
	{
		int[][] dominoes =  {{1,2},{2,1},{1,2} , {3,4},{4,3} ,{3,4} } ;
		int numEquivDominoPairs = numEquivDominoPairs( dominoes);
		System.out.println("test 3 --> " +numEquivDominoPairs);
	}
	
	

	public int numEquivDominoPairs(int[][] dominoes) {
		
		for (int i = 0; i < dominoes.length; i++)
		{
			Arrays.sort(dominoes[i]) ;
		}
		
		Map< List<Integer> , Integer> map = new HashMap<List<Integer> , Integer>() ;
		int pairs =0;
		
		for (int i = 0; i < dominoes.length; i++) 
		{
			List<Integer> list = new ArrayList<Integer>() ;
			
			for (int j = 0; j < 2; j++) 
			{
				list.add(dominoes[i][j]) ;
			}
			
			if( map.containsKey(list))
			{
				map.put(list, map.get(list) + 1 ) ;
				pairs = pairs + map.get(list) ;
			}else 
				map.put(list,0) ;
		}
		
		
		return pairs;
	}

}

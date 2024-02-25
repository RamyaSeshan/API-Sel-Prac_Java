package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Jewels_stones_LC_771_Week10_Day3 
{
	
	@Test
	public void test1()
	{
		String jewels = "aA";  
		String  stones = "aAAbbbb" ;
		int numJewelsInStones = numJewelsInStones( jewels,  stones) ;
		System.out.println( " numJewelsInStones test1    " + numJewelsInStones);
	}

	
	@Test
	public void test2()
	{
		String jewels = "z";  
		String  stones = "ZZ" ;
		int numJewelsInStones = numJewelsInStones( jewels,  stones) ;
		System.out.println( " numJewelsInStones  test2 " + numJewelsInStones);
	}
	public int numJewelsInStones(String jewels, String stones) 
	{
	
		Map< Character , Integer> map = new HashMap<Character , Integer>() ;
		int total = 0 ;
		
		for (int i = 0; i < stones.length(); i++) // O[N] 
		{
		  map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1 )	;
		 
		}
		
		//System.out.println(map);
		
		for (int i = 0; i < jewels.length(); i++)   // O [N] 
		{
			if ( map.containsKey( jewels.charAt(i)) )  total= total + map.get(jewels.charAt(i)) ;
		}
		
		return total ;
	}
	
	
}

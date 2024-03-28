package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class JewelsStone_LC_771_WKIII_HW 
{
	@Test
	public void test1()
	{
		String jewels = "aA", stones = "aAAbbbb" ;
		int numJewelsInStones = numJewelsInStones( jewels,  stones) ;
		System.out.println("test 1 --- " + numJewelsInStones);
	}
	
	@Test
	public void test2()
	{
		String jewels = "z", stones = "ZZ" ;
		int numJewelsInStones = numJewelsInStones( jewels,  stones) ;
		System.out.println("test 2 --- " + numJewelsInStones);
	}
	
	

	public  int numJewelsInStones(String jewels, String stones) 
	{
		Set<Character> set = new HashSet< Character>() ;
		int count =0 ;
		
		for (int i = 0; i < jewels.length(); i++) 
		{
			set.add(jewels.charAt(i)) ;
		}
              
        for (int i = 0; i < stones.length(); i++) 
        {
			if( set.contains(stones.charAt(i))) count ++;
		}
        
        return count ;
	}
}

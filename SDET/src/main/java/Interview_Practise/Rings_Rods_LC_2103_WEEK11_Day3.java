package Interview_Practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Rings_Rods_LC_2103_WEEK11_Day3 
{
	@Test
	public void Test1()
	{
		String rings = "B0R0G0R9R0B0G0" ;
		int countPoints = countPoints( rings) ;
		System.out.println(countPoints);	
	}
	
	@Test
	public void Test2()
	{
		String rings = "B0R0G0R9R0B0G0" ;
		int countPoints = countPoints( rings) ;
		System.out.println(countPoints);	
	}
	
	@Test
	public void Test3()
	{
		String rings = "G4" ;
		int countPoints = countPoints( rings) ;
		System.out.println(countPoints);	
	}
	

	public int countPoints(String rings) 
	{		
		Map< Character , HashSet<Character > > map = new HashMap<Character , HashSet<Character >>() ;
		HashSet<Character> ringsINRod =   new HashSet<Character>() ;

		for (int i = 0; i < rings.length(); i = i + 2 ) 
		{
			char ring = rings.charAt(i) ;
			char rod = rings.charAt( i + 1 );
			
			HashSet<Character> ringSet = map.getOrDefault(rod, new HashSet<Character>() );
			ringSet.add(ring) ;
			
			map.put(rod, ringSet) ;
			
			//System.out.println(" rod  is  " + rod );
			//System.out.println(ringSet );
			//System.out.println("-------------------");
			
			if(ringSet.size() == 3 ) ringsINRod.add(rod) ;
			
			
		}
		return ringsINRod.size();
	}
} 

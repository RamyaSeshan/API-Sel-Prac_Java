package mandatoryHomeWork.Week11.Day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

//https://leetcode.com/problems/rings-and-rods/

/*
 * Time Complexity O[N]  ; Space Complexity [
 * PSUEDO code 
 *   //"B0B6G0R6R0R6G9"
 *   intiate a map color with key -- charatcter and value -- Integer to hold the colorring  and its count 
 *   intiate a map ring to hold rodNo and map color 
 *   Iterate thru the string , increment it by 1+2  
 *     -- > check if ringMap contains key[String.charAT(1)
 *     
 *          --> check if colorMap contains Key [ chatAT(0) ] , otherwise add and increment its value by 1 
 *     *** unable to come up with Psuedo code *** 
 *     
 *     --
 *   
 */

public class Rings_Rods_LC_2103 {
	
public int countPoints1(String rings) { // rings = "B0B6G0R6R0R6G9"
	
	if(rings.length() ==2 ) return 0;
	
	Map<Integer , Map <Character , Integer >> mapRod = new HashMap<Integer , Map <Character , Integer >>() ;
	 Map <Character , Integer > mapRing = new HashMap<Character , Integer >() ;
	int count = 0 ;
	
	for (int i = 0; i < rings.length(); i= i+2) {	
						
		if(! mapRod.containsKey((int) rings.charAt(i+1)))
		{
			if (! mapRing.containsKey(rings.charAt(i)))
			{
				mapRing.put(rings.charAt(i), 1 ) ;
			}else
			{ mapRing.put(rings.charAt(i), mapRing.getOrDefault(rings.charAt(i), 0) +1 ) ; }
			 
			mapRod.put((int) rings.charAt(i+1), mapRing) ;
			
		}else 
		{
			if (! mapRing.containsKey(rings.charAt(i)))
			{
				mapRing.put(rings.charAt(i), 1 ) ;
			}else
			{ mapRing.put(rings.charAt(i), mapRing.getOrDefault(rings.charAt(i), 0) +1 ) ; }
			
			mapRod.put((int) rings.charAt(i+1), mapRing) ;
		}
		
	}
	
	for (int i = 0; i  <= 9; i++) {
		
		if(mapRod.containsKey(i))
		{
			for (Map.Entry<Character , Integer>  entries : mapRing.entrySet()) {
				
				
			}
		}
		
	}
	
	return count;
	
        
    }



public int countPoints(String rings) { // rings = "B0B6G0R6R0R6G9"
	
	if(rings.length() ==2 ) return 0;	
    Map<Character , HashSet<Character> > rod =  new HashMap<Character , HashSet<Character>>() ;
	Set<Character> rodWithThreeRings = new HashSet<Character>() ;
	
	for (int i = 0; i < rings.length(); i = i+2) {
	  
		char rodNo = rings.charAt(i + 1) ;
		char ringColor = rings.charAt(i) ;	
	
			HashSet<Character> ring = rod.getOrDefault(rodNo,  new HashSet<Character>() ) ;
			ring.add(ringColor) ;
		
			rod.put(rodNo, ring) ;	
			
			if(ring.size() == 3 )  rodWithThreeRings.add(rodNo) ;
		}
  //System.out.println(rod);
	
	return rodWithThreeRings.size() ;
	
	}


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
	String rings = "G4" ;
	int countPoints = countPoints( rings) ;
	System.out.println(countPoints);	
}


@Test
public void Test3()
{
	String rings = "B0R0G0R9R0B0G0B9G9" ;
	int countPoints = countPoints( rings) ;
	System.out.println(countPoints);	
}
}


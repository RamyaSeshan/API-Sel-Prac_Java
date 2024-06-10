package mandatoryHomeWork.Week14.Day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

/*  Time Complexity O[N]  ; Space Complexity O[N]
 * PSUEDO CODE 
 * 
 * declare a map with key character and value HashSet of character
 * Iretare thru the String , assign every odd char to rod variable and even char to ring var
 *   check if the Map has value for Key -- rod  and assign it to a Hashset , if no Value present , create a new HAshSet
 *   --- remaining , pls follow in the code -----
 *  
 * 
 */


public class RingsANDRods_LC_2103 {	
	  public int countPoints(String rings)	   // rings = "B0B6G0R6R0R6G9"	 
	  {			  
		  if (rings.length() == 2 ) return 0;
		  
		  Map<Character , HashSet<Character >> rod_Map =  new HashMap<Character , HashSet<Character >>() ;
		  HashSet<Character > rod_RingCnt = new HashSet<Character> () ;
		  
		  for (int i = 0; i < rings.length(); i = i+2) 
		   {
			char ring = rings.charAt(i) ;
			char rod = rings.charAt(i +1) ;
			
			  HashSet<Character> ringSet = rod_Map.getOrDefault(rod, new HashSet<Character> ()) ;
			  ringSet.add(ring) ;
			  
			  rod_Map.put(rod, ringSet) ;			  
			  if(ringSet.size() == 3 ) rod_RingCnt.add(rod) ;		 
			
		   }		  
		  
		  return rod_RingCnt.size();		  
	  }


@Test
public void Test1()
{
	String rings = "B0B6G0R6R0R6G9" ;
	int countPoints = countPoints( rings)	;
	System.out.println(countPoints);	
	
}

@Test
public void Test2()
{
	String rings = "B0B6G0R6R0R6G9B2B2G2R2R0R6G9" ;
	int countPoints = countPoints( rings)	;
	System.out.println(countPoints);	
}

@Test
public void Test3()
{
	String rings = "B0R0G0R9R0B0G0" ;
	int countPoints = countPoints( rings)	;
	System.out.println(countPoints);	
}	


@Test
public void Test4()
{
	String rings = "G4" ;
	int countPoints = countPoints( rings)	;
	System.out.println(countPoints);	
}	

}

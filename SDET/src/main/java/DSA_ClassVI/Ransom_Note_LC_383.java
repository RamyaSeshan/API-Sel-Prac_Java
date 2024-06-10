package DSA_ClassVI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class Ransom_Note_LC_383 { // Using int array
	
	public boolean canConstruct1(String ransomNote, String magazine) {
		
		if(magazine.length() < ransomNote.length()) return false  ;
		int[] A = new int[26];
		
		for (int i = 0; i < magazine.length(); i++) {			
			A[magazine.charAt(i) -'a'] ++;			
		}		
		
		for (int i = 0; i < ransomNote.length(); i++) {
			
			if( ! (A[ransomNote.charAt(i) -'a'] >0 ))
			{return false ;}				
			A[ransomNote.charAt(i) -'a'] --;	
		}
		return true;
	}

	public boolean canConstruct2(String ransomNote, String magazine) { // Using Map 
		if(magazine.length() < ransomNote.length()) return false  ;
		Map<Character, Integer > mapMag = new HashMap<Character, Integer >() ;
		
		for (int i = 0; i < magazine.length(); i++) {			
			mapMag.put(magazine.charAt(i), mapMag.getOrDefault(magazine.charAt(i), 0) +1) ;	
			
		}
			
		for (int i = 0; i < ransomNote.length(); i++) {
			mapMag.put(ransomNote.charAt(i), mapMag.getOrDefault(ransomNote.charAt(i), 0) -1) ;
			if(mapMag.get(ransomNote.charAt(i)) < 0  ||  mapMag.get(ransomNote.charAt(i)) == null )
				 {return false ; }
		}
		return true;			
	}
	

	public boolean canConstruct(String ransomNote, String magazine) { // Using concurrent Map 
		
		if(magazine.length() < ransomNote.length()) return false  ;
		
		ConcurrentHashMap<Character, Integer > mapMag = new ConcurrentHashMap<Character, Integer >() ;
		
		for (int i = 0 ; i < magazine.length(); i++ ){			
			mapMag.put(magazine.charAt(i), mapMag.getOrDefault(magazine.charAt(i), 0) +1) ;	
			if(i <  ransomNote.length() )
			 {mapMag.put(ransomNote.charAt(i), mapMag.getOrDefault(ransomNote.charAt(i), 0) -1) ; }
		}		
		
		/*for (int i = 0; i < ransomNote.length(); i++) {	
		if(mapMag.get(ransomNote.charAt(i)) < 0  ||  mapMag.get(ransomNote.charAt(i)) == null)
			 {return false ; }
	     }*/
		
		for(Map.Entry<Character, Integer > entryset :  mapMag.entrySet())
		{
			if ( entryset.getValue() < 0 ) return false ;
		}
		
		return true;			
	}
	

	@Test
	public void Test1()	{
		 String ransomNote = "a", magazine = "b" ;
		 boolean canConstruct = canConstruct( ransomNote,  magazine) ;
		 System.out.println(canConstruct);	 
	}
	
	
	@Test
	public void Test2()	{
		 String ransomNote = "aa", magazine = "ab" ;
		 boolean canConstruct = canConstruct( ransomNote,  magazine) ;
		 System.out.println(canConstruct);	 
	}
	
	@Test
	public void Test3()	{
		 String ransomNote = "aa", magazine = "aab" ;
		 boolean canConstruct = canConstruct( ransomNote,  magazine) ;
		 System.out.println(canConstruct);	 
	}
		
	
}
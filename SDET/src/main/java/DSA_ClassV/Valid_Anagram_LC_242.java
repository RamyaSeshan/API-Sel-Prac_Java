package DSA_ClassV;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


// https://leetcode.com/problems/valid-anagram/submissions/
public class Valid_Anagram_LC_242 {

public boolean isAnagram1(String s, String t) { //THis is usign 2 Map  , took 17 ms
	
	if(s.length() != t.length() ) return false; 
	
	Map<Character , Integer> mapA = new  HashMap<Character , Integer> ();  
	 Map<Character , Integer> mapB = new  HashMap<Character , Integer> ();
	 
	 for (int i = 0; i < s.length(); i++) { mapB.put(s.charAt(i), mapB.getOrDefault(s.charAt(i), 0) +1 ); }
	
	 for (int i = 0; i < t.length(); i++) { mapA.put(t.charAt(i), mapA.getOrDefault(t.charAt(i), 0) +1) ;  }
	
	 
	 if(mapA.equals(mapB)) return true;
	 else
	 return false;        
    }


public boolean isAnagram(String s, String t) // Using single but takes 19 ms 
   {
	if(s.length() != t.length() ) return false; 
	int i=0;
	Map<Character , Integer> mapA = new  HashMap<Character , Integer> (); 
	
	 while (i < s.length())
	 {	mapA.put(s.charAt(i), mapA.getOrDefault(s.charAt(i), 0) +1) ;
		 i++;
	 }
	 
	 for (int j = 0; j < t.length(); j++) {
		 
		 if(mapA.containsKey(t.charAt(j)))
		 {
			  if (mapA.get(t.charAt(j)) > 1) 
			  {
				  mapA.put(t.charAt(j),mapA.getOrDefault(t.charAt(j), 0) -1 ) ;
			  }else if (mapA.get(t.charAt(j)) == 1) 
			  {
				  mapA.remove(t.charAt(j)) ;
			  }
		 }else
		 {
			 mapA.put(t.charAt(j), mapA.getOrDefault(t.charAt(j), 0) +1) ;
		 }
		
	 }
	
	 if(mapA.isEmpty()) { return true; }
	 else return false;
   }

@Test
public void test1()
{
	String s = "anagram", t = "nagaram" ;
	boolean anagram = isAnagram( s,  t);
	System.out.println(anagram);	
}


@Test
public void test2()
{
	String s = "rat", t = "car" ;
	boolean anagram = isAnagram( s,  t);
	System.out.println(anagram);	
}


}

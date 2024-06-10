package DSA_18Nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

//https://leetcode.com/problems/uncommon-words-from-two-sentences/
 // Daily connect -- sep 29

public class Uncommon_Words_LC_884 {
	
	 public String[] uncommonFromSentences(String s1, String s2) {
	        
		 String[] A = s1.split(" "); 
		 String[] B = s2.split(" ");
		 
		 List<String> unCommonWords = new ArrayList<String>() ;
		 
		 Map<String , Integer> mapA = new  HashMap<String , Integer> ();  
		 Map<String , Integer> mapB = new  HashMap<String , Integer> ();
		 
		 for (int i = 0; i < B.length; i++)
		 { mapB.put(B[i], mapB.getOrDefault(B[i], 0) +1 );
		  
		 }
		
		 for (int i = 0; i < A.length; i++) { mapA.put(A[i], mapA.getOrDefault(A[i], 0) +1) ;  }
		 
         for(Map.Entry<String , Integer> entryA : mapA.entrySet())
         {
        	 if(entryA.getValue() == 1 && !mapB.containsKey(entryA.getKey()) )
        	 { unCommonWords.add(entryA.getKey()) ; }
         }
		
		for (Map.Entry<String , Integer> entryB : mapB.entrySet())
		{
			if(entryB.getValue()==1  && !mapA.containsKey(entryB.getKey()))
			{unCommonWords.add(entryB.getKey()) ;}
		}
		 
		String[] unCommonWordsResult = new String[unCommonWords.size()] ;
		unCommonWordsResult = unCommonWords.toArray(unCommonWordsResult);
		 
		return unCommonWordsResult;		 
	    }

	 
	 @Test
	 public void Test1()
	 {
		String s1 = "this apple is sweet"; String  s2 = "this apple is sour" ;
		String[] uncommonFromSentences = uncommonFromSentences( s1,  s2) ;
		for (String string : uncommonFromSentences) {
			System.out.println(string);
		   }	
	 }
	 
	 
	 @Test
	 public void Test2()
	 {
		String s1 = "apple apple"; String  s2 = "banana" ;
		String[] uncommonFromSentences = uncommonFromSentences( s1,  s2) ;
		for (String string : uncommonFromSentences) {
			System.out.println(string);
		   }	
	 }
}

package mandatoryHomeWork.Week14.Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.common.primitives.Chars;

// https://leetcode.com/problems/first-unique-character-in-a-string/ -- Nov 01

public class First_Unique_chat_LC_387{
	
	 public int firstUniqChar1(String s) {		 // takes 25ms  
		 Map<Character , Integer> map = new HashMap<Character , Integer>() ;
		 int indexOf ;int min =Integer.MAX_VALUE;
		 
		 char[] charArray = s.toCharArray() ;
		 for (char c : charArray)
		 {
			map.put(c, map.getOrDefault(c, 0) +1) ;
		  }
		 
		// System.out.println(map);
		 Arrays.toString(charArray) ;
		for (Map.Entry<Character , Integer> entry : map.entrySet()) 
		{
			if(entry.getValue() == 1)
			{
				  indexOf = Chars.indexOf(charArray, entry.getKey() ) ;
				//currMin = s.indexOf(entry.getKey()) ;
				min = Math.min(indexOf, min) ;	
				if(min == 0 ) return min;
			}
		}			
		if(min == Integer.MAX_VALUE ) return -1 ;
		else return min;	        
	    }

	 public int firstUniqChar(String s)  // Optimized -- took 3 ms 
	 {
		
		 int[] A = new int[26] ;
		 char[] charArray = s.toCharArray() ;
		 
		 for (char i : charArray) { A[i - 'a'] ++; }
		 
		 for (int i = 0; i < charArray.length; i++) {
			if( A[charArray[i] - 'a']  ==  1 ) return i;
		 }
	
		 return -1;		 
	 }
	 
@Test
public void test1()
{
	String s = "leetcode" ;
	int firstUniqChar = firstUniqChar( s) ;
	System.out.println(firstUniqChar);	
} 

@Test
public void test2()
{
	String s = "loveleetcode" ;
	int firstUniqChar = firstUniqChar( s) ;
	System.out.println(firstUniqChar);	
}

@Test
public void test3()
{
	String s = "aabb" ;
	int firstUniqChar = firstUniqChar( s) ;
	System.out.println(firstUniqChar);	
}

@Test
public void test4()
{
	String s = "aabbc" ;
	int firstUniqChar = firstUniqChar( s) ;
	System.out.println(firstUniqChar);	
}
}

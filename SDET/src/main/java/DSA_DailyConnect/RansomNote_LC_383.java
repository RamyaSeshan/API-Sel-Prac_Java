package DSA_DailyConnect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class RansomNote_LC_383 {
	
	//https://leetcode.com/problems/ransom-note/

	public boolean canConstruct(String ransomNote, String magazine) {

		Map<Character,Integer> ransom = new HashMap<Character,Integer>();
		Map<Character,Integer> mag = new HashMap<Character,Integer>();
		char[] ransomNoteArray = ransomNote.toCharArray();
		char[]magazineArray = magazine.toCharArray();
		char charAt ;
		
       if(ransomNote.length() > magazine.length()) { return false ;}
       
		for (int i = 0; i < ransomNoteArray.length; i++) {			

			if (ransom.keySet().contains(ransomNoteArray[i]))
			{
				ransom.put(ransomNoteArray[i], ransom.get(ransomNoteArray[i]) +1 );
			}
			else 
			{
				ransom.put(ransomNoteArray[i] ,1);
			}	
        
			//System.out.println(ransom.get(ransomNoteArray[i]));
		}


		for (int i = 0; i < magazineArray.length; i++) {			

			if (mag.keySet().contains(magazineArray[i]))
			{
				mag.put(magazineArray[i], mag.get(magazineArray[i]) +1 );
			}
			else 
			{
				mag.put(magazineArray[i] ,1);
			}	

			//System.out.println(mag.get(magazineArray[i]));
		}



		for (int i = 0; i < ransomNote.length (); i++) { //aa
			for (int j = 0; j <magazine.length(); j++) {
				
				if(ransomNote.charAt(i) == magazine.charAt(j))
				{
					 charAt= ransomNote.charAt(i);	
					if(ransom.get(charAt)  != mag.get(charAt))
					{
						return false;
					}
				}	
				if(ransomNote.charAt(i) != magazine.charAt(j) &&  i == ransomNote.length ()-1) {return false ;}
			}
		}

		return true;

	}

	
	public boolean canConstruct1(String ransomNote, String magazine)
	{	
		if(magazine.length()  < ransomNote.length() ) { return false ;}
		 
		char[] R = ransomNote.toCharArray();
		char[] M = magazine.toCharArray();
	    Arrays.sort(R);
	    Arrays.sort(M);

	    for (int i = 0; i < R.length; i++) {
			System.out.print(R[i]);
		}
	    
	    System.out.println("-------------");
	    
	    for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]);
		}
	    
	  
			for (int j = 0; j < R.length; j++) {			
				for (int i = j; i < M.length; i++) { //aa aab
					if(R[j] == M[i]) {break ;}
					else if (i == M.length-1 && R[j] != M[i] )
					return false;
				}				
			}
				
		return true;
	}

	
	public boolean canConstruct2(String ransomNote, String magazine)
	{
		int[] A = new int[26];
		int index;
		
		for (int i = 0; i < magazine.length(); i++) {		
			index = magazine.charAt(i)-'a';
			A[index] = A[index]+1;
			}
		for (int i = 0; i < ransomNote.length() ; i++) {
			
			if( ! (A[ransomNote.charAt(i)-'a' ] >0))
			{
				return false;
			}
			
			A[ransomNote.charAt(i)-'a' ] --;
		}
		
		return true;
		
	}
	
	@Test
	public void test10()
	{
		String ransomNote ="fihjjjjei";
		String magazine = "hjibagacbhadfaefdjaeaebgi";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 9---" + canConstruct);
	
	}
@Test
	public void chk()
	{
		String ransomNote ="aa";
		String magazine = "a";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 1 ---" + canConstruct);
	}

@Test
	public void test2()
	{
		String ransomNote ="aa";
		String magazine = "aa";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 2 ---" + canConstruct);
	}
	
@Test
	public void test3()
	{
		String ransomNote ="aba";
		String magazine = "aab";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 3 ---" + canConstruct);
	}
	
@Test
	public void test4()
	{
		String ransomNote ="a";
		String magazine = "b";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 4 ---" + canConstruct);
	}
	
@Test
	public void test5()
	{
		String ransomNote ="aa";
		String magazine = "ab";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 5 ---" + canConstruct);
	}
@Test
	public void test6()
	{
		String ransomNote ="aa";
		String magazine = "aab";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 6---" + canConstruct);
	}
	
@Test
	public void test7()
	{
		String ransomNote ="bg";
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 7---" + canConstruct);
	}
	
	@Test
	public void test8()
	{
		String ransomNote ="aa";
		String magazine = "ab";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 7---" + canConstruct);
	}

@Test
	public void test9()
	{
		String ransomNote ="fihjjjjei";
		String magazine = "hjibagacbhadfaefdjaeaebgi";				
		boolean canConstruct = canConstruct2( ransomNote,  magazine);
		System.out.println("test 9---" + canConstruct);
	}
}

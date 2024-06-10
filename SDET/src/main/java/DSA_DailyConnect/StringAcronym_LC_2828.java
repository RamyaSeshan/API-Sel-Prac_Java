package DSA_DailyConnect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringAcronym_LC_2828 {
	//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/


	/*
	 * Problem undersatnding - Yes
	 * 
	 * input -- String[] / list<String> words , String s output - boolean
	 * 
	 * Solution -- Brute force Alt Sol - NO	 * 
	 * 
	 * Test Data words = [ "India" , "China", "America" ] s = "ICA" output true
	 * words = [ "India" , "China", "America" ] s = "ica" output false words = [
	 * "India" , "India", "India" ] s = "III" output true words = [ "India" ,
	 * "India", "India" ] s = "II" output false
	 * 
	 * 
	 * PSUEDO CODE 
	 * 1.declare a StringBuilder
       2.iterate thru List of String 
        --> get the  first char and strore it in StringBuilder 
	 * 3.convert StringBuilder to String , say temp 
	 * 4.Check if temp.equals(s) , return true else false
	 */

		public boolean  isAcronym(List<String> words, String s)
		{		
			if(words.size() != s.length() || words.size() < s.length()) { return false ;}	
			
			for (int i = 0; i < words.size(); i++) {		
			if(s.charAt(i) !=words.get(i).charAt(0))
			{return false;}			
		}
			return true;			
		}
		
		@Test
		public void Test1()
		{
			//String[] w =  {"India" , "China", "America" };
			List<String> words =  new ArrayList<String>( Arrays.asList("India" , "China", "America" ) );
			boolean acronym = isAcronym( words, "ICA") ;
			System.out.println(acronym);			
		}
		
		@Test
		public void Test2()
		{	String[] w =  {"India" , "China", "America" };
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "ica") ;
			System.out.println(acronym);			
		}

		@Test
		public void Test3()
		{	String[] w =  {"India" , "India", "India" };
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "III") ;
			System.out.println(acronym);			
		}

		@Test
		public void Test4()
		{	String[] w =  {"India" , "India", "India" };
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "II") ;
			System.out.println(acronym);			
		}
		
		@Test
		public void Test5()
		{	String[] w =  {"alice","bob","charlie"};
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "abc") ;
			System.out.println(acronym);			
		}	
		
		@Test
		public void Test6()
		{	String[] w =  {"an","apple"};
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "a") ;
			System.out.println(acronym);			
		}	
		
		@Test
		public void Test7()
		{	String[] w =  {"never","gonna","give","up","on","you"};
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
			boolean acronym = isAcronym( words, "ngguoy") ;
			System.out.println(acronym);			
		}		
}

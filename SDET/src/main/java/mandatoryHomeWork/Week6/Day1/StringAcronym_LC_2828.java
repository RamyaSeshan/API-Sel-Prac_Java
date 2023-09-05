package mandatoryHomeWork.Week6.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringAcronym_LC_2828 {
	//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/


	/*
	 * 1.Problem undersatnding - Yes
	 * 
	 *2. input -- String[] / list<String> words , String s output - boolean
	 ** Test Data words = [ "India" , "China", "America" ] s = "ICA" output true
	 * words = [ "India" , "China", "America" ] s = "ica" output false words = [
	 * "India" , "India", "India" ] s = "III" output true words = [ "India" ,
	 * "India", "India" ] s = "II" output false
	 * 
	 * 3.Solution -- Brute force  4. Alt Sol - NO	 * 
	
	 * 
	 * 5.PSUEDO CODE 
	 * 1.declare a StringBuilder
       2.iterate thru List of String 
        --> get the  first char and strore it in StringBuilder 
	 * 3.convert StringBuilder to String , say temp 
	 * 4.Check if temp.equals(s) , return true else false
	 * 
	 * .Write the code on notepad
	 * 
6. Dry run the pseudo code with all test data from step #2 -- Yes

7.Write the code on notepad -- Yes

8. Dry run the code with all test data from step #2  -- Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --Yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --Yes
	 */

		public boolean  isAcronym(List<String> words, String s)
		{		
			if(words.size() != s.length() ) { return false ;}	
			
			for (int i = 0; i < words.size(); i++) {		
			if(s.charAt(i) !=words.get(i).charAt(0))
			{return false;}			
		}
			return true;			
		}
		
		@Test
		public void Test1()
		{
			String[] w =  {"India" , "China", "America" };
			List<String> words =  new ArrayList<String>(Arrays.asList(w));
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
		
		
}

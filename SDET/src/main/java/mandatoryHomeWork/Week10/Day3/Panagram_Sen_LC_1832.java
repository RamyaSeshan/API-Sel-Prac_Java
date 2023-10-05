package mandatoryHomeWork.Week10.Day3;

import org.junit.Test;

 // https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

/*
 * Psuedo code
 * add the charatxers of Stirng to an boolean array
 * iterate and check if boolean array has value false , then return flase 
 * finally return true 
 * 
 */
public class Panagram_Sen_LC_1832 {
	
public boolean checkIfPangram(String sentence) {
	
	boolean[] panagram = new boolean[26];
	
	for (char b : sentence.toCharArray()) 
	  {
		if (b != ' ')
		{panagram[b-'a'] = true;}
      }
	
	
	for (boolean b : panagram) {
		if(!b) {return false ;}
     	}
	
	return true;
        
    }


@Test
public void Test1()
{
	String sentence = "thequickbrownfoxjumpsoverthelazydog" ;
	boolean checkIfPangram = checkIfPangram( sentence) ;
	System.out.println(checkIfPangram);	
}

@Test
public void Test2()
{
	String sentence = "leetcode" ;
	boolean checkIfPangram = checkIfPangram( sentence) ;
	System.out.println(checkIfPangram);	
}
}

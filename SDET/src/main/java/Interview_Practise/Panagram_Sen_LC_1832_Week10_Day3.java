package Interview_Practise;

import org.junit.Test;

public class Panagram_Sen_LC_1832_Week10_Day3 
{
	@Test
	public void Test1()
	{
		String sentence = "thequickbrownfoxjumpsoverthelazydog" ;
		boolean checkIfPangram = checkIfPangram( sentence) ;
		System.out.println( " checkIfPangram test 1 " +checkIfPangram);	
	}


	@Test
	public void Test2()
	{
		String sentence = "leetcode" ;
		boolean checkIfPangram = checkIfPangram( sentence) ;
		System.out.println( " checkIfPangram test 2 " +checkIfPangram);	
	}

	public boolean checkIfPangram_1(String sentence) { // took  2 ms 

		int[] A = new int[26] ;

		for (int i = 0; i < sentence.length(); i++) 
		{
			A[ sentence.charAt(i)  - 'a'] ++;
		}

		for ( int i : A) {

			if ( i ==0 ) return false;
		}

		return true;
	}


	public boolean checkIfPangram(String sentence) { // takes 1 ms 

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
}


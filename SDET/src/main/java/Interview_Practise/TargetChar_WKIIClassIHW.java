package Interview_Practise;

import java.util.Arrays;

import org.junit.Test;

public class TargetChar_WKIIClassIHW 
{
	/*
	 * Given a sorted character array and a target character, 
find the next biggest character in the array. 

Example:
char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
Output -> h
*/


	@Test
	public void test1()
	{
		char[] A = {'a','h','d'} ; // a d h 
		char targetChar = TargetChar( A, 'e') ;
		System.out.println("test 1 ---- " + targetChar);
	}

	public char TargetChar(char[] a, char c) {
		
	     Arrays.sort(a);
		int i =0 ;
		while ( i < a.length )
		{
			if ( a[i] < c ) i++;
			else if ( a[i] >  c  ) return a[i];
		}
		
		return a[0];
	}

}

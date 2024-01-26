package Interview_Practise;

import org.junit.Test;

public class ReverseWordIII_LC_557_WK7_DAY3
{
	@Test
	public void test1()
	{
		String s = "Let's take LeetCode contest" ;
		String reverse = reverse(s) ;
		System.out.println(reverse);
	}
	
	@Test
	public void test2()
	{
		String s = "Mr Ding" ;
		String reverse = reverse(s) ;
		System.out.println(reverse);
	}

	public String reverse(String s) {
		
		int start =0 , end = 0 ;
		char[] charArray = s.toCharArray() ;
		char[] reverse ;
		
		for (int i = 0; i < charArray.length; i++)
		{
			if(charArray [i] == ' ') 
			{
		    reverse = reverse(start , i -1  ,charArray ) ;		  
		    charArray = reverse;
		    start = i+1 ;
			}
			else if (charArray [i] != ' '  &&  i == charArray.length -1 )
			{
				reverse = reverse(start ,  charArray.length -1 ,charArray ) ;
				charArray = reverse;
			}
		}		
		return String.valueOf(charArray) ;		
	}


	public char[] reverse(int start, int i, char[] charArray) 
	{
       char temp ;      
       while (start < i) 
       {
    	   temp = charArray[start] ;
    	   charArray[start] = charArray[i] ;
    	   charArray[i] = temp ;
    	   start ++ ; i -- ;
       }
       
		return charArray ;
	}
	
	
}

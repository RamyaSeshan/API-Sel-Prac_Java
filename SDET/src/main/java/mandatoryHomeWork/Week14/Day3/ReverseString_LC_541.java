package mandatoryHomeWork.Week14.Day3;

import org.junit.Test;

public class ReverseString_LC_541 {
	
	//  https://leetcode.com/problems/reverse-string-ii/
	
	
	
	public String reverseStr1(String s, int k) {
		
		StringBuffer sb = new StringBuffer();
		
		String str_k =null;
		String str_2k =null;
		StringBuffer reverse_str = null ;
		StringBuffer sb_str_2k = null;
		
		int i =0;
		int len = s.length();
		
		while (i < len)  // "abcdefg"
		{
			if(s.substring(i).length() < k)
			{
				str_k = s.substring(i);
			   reverse_str = new StringBuffer(str_k).reverse();
			
				sb.append(reverse_str) ;
				return sb.toString() ;
			}else if (s.substring(i).length() >= k &&  s.substring(i).length() < (2*k))
			{
				str_k = s.substring(i , k+i);
				str_2k = s.substring(k+i);
			  reverse_str = new StringBuffer(str_k).reverse();
			  sb_str_2k = new StringBuffer(str_2k);
				
				sb.append(reverse_str) ;
				sb.append( sb_str_2k) ;
				return sb.toString() ;
			} else if (s.substring(i).length() >= (2*k)) 
			{
				str_k = s.substring(i , k+i);
				str_2k = s.substring(k+i , 2*k);
			  reverse_str = new StringBuffer(str_k).reverse();
			  sb_str_2k = new StringBuffer(str_2k);
				
				sb.append(reverse_str) ;
				sb.append(sb_str_2k ) ;
				i = i+(2*k);				
			}
		
		}
		
		return sb.toString();
		
	}

	public String reverseStr(String s, int k) {	 // abcdef
		char[] charArray = s.toCharArray() ;
		int i =0 , j;
		
		while (i < charArray.length )
		{
			j = Math.min(i+k-1, charArray.length-1 ) ;
			reverse_input(charArray ,  i ,  j) ;
			i = i+ (2*k) ;			
		}
		
		return String.valueOf(charArray) ;
	}
	
	public void reverse_input(char[] charArray , int i , int j)
	{
		char temp ;
		while (i < j) 
		{
			temp = charArray[i];
			charArray[i] = charArray[j] ;
			charArray[j] = temp ;
			i++;
			j--;
		}
	}

	@Test
public void test1()
{
	String s = "abcdefg" ; int  k = 2 ;
	String reverseStr = reverseStr( s,  k) ;
	 System.out.println(reverseStr); 
	
}

@Test
public void test2()
{
	String s = "abc" ; int  k = 2 ;
	String reverseStr = reverseStr( s,  k) ;
	 System.out.println(reverseStr); 	
}

@Test
public void test3()
{
	String s = "abcd" ; int  k = 2 ;
	String reverseStr = reverseStr( s,  k) ;
	 System.out.println(reverseStr); 	
}


@Test
public void test4()
{
	String s = "abcd" ; int  k = 6;
	String reverseStr = reverseStr( s,  k) ;
	 System.out.println(reverseStr); 	
}

}

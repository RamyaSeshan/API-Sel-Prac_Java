package Interview_FreshWorks;

import org.junit.Test;

public class RepeatingChar 
{
	@Test
	public void test1()
	{
		String s = "2[a]3[bc]" ;
		String fundStr = fundStr(s) ;
		System.out.println(fundStr);		
	}

	public  String fundStr(String s) {
		
		char[] charArray = s.toCharArray() ;		
		int i =0 , temp = 0 , j = 2;
		StringBuffer sb1 = new StringBuffer();
		
		while (i < s.length()) 
		{		 
			if ( Character.isDigit( charArray[i]) )  
			{ 
			   temp = Integer.parseInt( charArray[i] +"") ;					 
			   i++ ;
			  System.out.println( "temp is "+temp);
			}
			else if( charArray[i] == '[') 
			{
				i = i + 1;
				StringBuffer sb = new StringBuffer();
				while ( charArray[i] != ']' )
				{
					sb.append(charArray[i]); 	i++;
				}				
				sb1.append(sb) ;
				System.out.println("--- Now Teamp is " + temp);
				
				if (temp > 1)
				{
					
					while ( j <= temp)  
					{ sb1.append(sb) ; j++; }
				}
				  j =2;
		          temp =0 ;
		          i++;
			}			
				
		}
		return sb1.toString();

		
	}
}

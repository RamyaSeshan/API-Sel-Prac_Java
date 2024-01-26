package Interview_Practise;

import org.junit.Test;

public class FaultyKeyboard_LC_2810 
{
	@Test
	public void test1()
	{
		//String s = "String" ;
		String s = "poiinter" ;
		String revFault = revFault(s) ;
		System.out.println(revFault);

	}

	public String revFault1(String s) 
	{		
		
		if( ! s.contains("i")  )  return s;

		while (s.contains("i"))
		{
			 System.out.println("s in while loop  is  " +s);
		 if(s.indexOf("i") == 0 ) 
			{
			s = reverse( s.substring(1) ) ;			
			}
		else if (s.indexOf("i") == s.length() -1 ) 
		{
			s= reverse( s.substring(0 , s.length() -1 ) ) ;			
		}else 
		{
			 String srt1 = reverse( s.substring(0 , s.indexOf("i") ) )  ;	
			 String srt2 = s.substring (s.indexOf("i") +1  )    ;	
			 s =  srt1 +  srt2 ;
			 System.out.println("s after conditionong is  " +s);			
		}

		}
		return s;
		

	}

	
	public String revFault(String s) 
	{
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'i')  sb.reverse() ;
			else sb.append(s.charAt(i) ) ;
		}		
		
		return sb.toString() ;
		
	}
	public String reverse(String substring) {
    
		  StringBuffer sb = new StringBuffer();
		  for (int i = substring.length() -1 ; i >=0  ; i--) 
		  {
			 sb = sb.append(substring.charAt(i)) ;
		  }
          return sb.toString() ;
	}




}

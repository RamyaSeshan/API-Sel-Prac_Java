package DSA_ClassI;

import org.junit.Test;

public class RevStr {
	
	public String strRev1(String s)
	{
	    if (s.length() ==1 ) { return s;}
		StringBuffer sb = new StringBuffer();
		
	  for (int i = s.length()-1; i >=0 ; i--) {
		sb = sb.append(s.charAt(i));
	   }
	  return sb.toString();
	}

	
	
	public String strRev(String s) // using 2 pointers 
	{
	    char[] charArray = s.toCharArray();
	    char temp =  ' ';
	    String res =" ";
		
	   for (int start =0 , end = s.length()-1; start <= end; start++ , end--)
	       {
		    temp= charArray[start];     
		   charArray[start] = charArray[end]; 
		   charArray[end] =temp;
		   }			
		return res.valueOf(charArray);
	}
	
	
	
	@Test
	public void Test2()
	{
		String s ="13Ramya42";
		 String strRev1 = strRev(s);
		 System.out.println(strRev1);
	}
	
	/*@Test
	public void Tes1()
	{
		String s ="Ramya";
		 String strRev1 = strRev1(s);
		 System.out.println(strRev1);
	}*/
}

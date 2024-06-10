package HackerRankAss;

import org.junit.Test;
 
 // problem is in a given string return the sub string whose lenght is even and its the larget even len in the given input
// return 00 if no even len string found
public class EvenLenStr {
	
	public String evenLenStr(String[] S)
	{
		 int length =0;
		 String res ="00";
		// StringBuffer  res = new StringBuffer ();
		if (S.length ==0 ) {return "00" ;}
		
	  for (int i = 0; i < S.length; i++) {
		  String[] split = S[i].split(" ");
		   for (int j = 0; j < split.length; j++) {
			   
			  if( split[j].length() %2 ==0)
			  {
				 if(split[j].length() > res.length())
				 {
					 res =split[j];
				 } else if (split[j].length() == res.length()) 
				 {
					 continue;
				 }
				  } 			      
		}
		
	}		
		
		return res;
		
	} 
	
	
	@Test
	public void Test1()
	{
		String[] S = {"Ramya","is","good","good","girl" };
		String evenLenStr = evenLenStr( S);
		System.out.println(evenLenStr);
				
		}
	
	@Test
	public void Test2()
	{
		String[] S = {"hey"};
		String evenLenStr = evenLenStr( S);
		System.out.println(evenLenStr);
				
		}
	
	@Test
	public void Test3()
	{
		String[] S = {""};
		String evenLenStr = evenLenStr( S);
		System.out.println(evenLenStr);				
		}
	
	@Test
	public void Test4()
	{
		String[] S = {"Ramya","is","good","veryGOOD","girl" };
		String evenLenStr = evenLenStr( S);
		System.out.println(evenLenStr);				
		}
	}


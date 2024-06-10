package HackerRankAss;

import org.junit.Test;
// This is Hakerrank -- assesement I - Problem 2
public class StrIsPalin { 
	
	public String chk(String[] S)	
	{	String[] val;
		int[] A = new int[26];
		int index;
		char charAt;
		Boolean flag;
		StringBuffer sb = new StringBuffer();		
		
		for (int i = 0; i < S.length; i++) {	
			val  = S[i].split(" ");
			
			for (int j = 0; j < val.length; j++) {
			
				  for (int k = 0; k < val[j].length(); k++) {					 
					    charAt = val[j].toLowerCase().charAt(k);					  
					    index =charAt-'a';						  
					    A[index] =A[index]+1;
				      }			
		    }
			
			 flag = isValid(A); 				
			 System.out.println("flag value returned from function is " +flag);
			 if(flag) { sb.append("1");}
			 else { sb.append("0");}
			 
	    }
		return sb.toString();
	}
	
	public boolean isValid(int[] A)
	{
		for (int i = 0; i < A.length; i++) {
			if(A[i] ==0  || A[i] >1 ) { return false ;}
			else continue ;
		   }		

		return true;	
	}
	
	
	@Test
	public void Tes1()
	{
		String[] S = {"abc defgh ijkl mnop qrst uvw xyz ",
				      "abc defgh ijkl mnop qrst uvw xyz a",
				      "def",
				      "ghijklmnop",
				      "qrstuvw",
				      "xyz",
				      " "};
	
		String chk = chk(S);
		System.out.println(chk);
	}

}

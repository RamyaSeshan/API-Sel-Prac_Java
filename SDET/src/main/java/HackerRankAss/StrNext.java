package HackerRankAss;

import org.junit.Test;

public class StrNext {
	
	public String  chkPlai(String S)
	{
		int[] A = new int[25];
		int index=0;
		StringBuffer sb = new StringBuffer();
		boolean flag =true;
		
	
		for (int i = 0; i < S.length(); i++) {
			char charAt = S.charAt(i);
			index =charAt-'a';
			A[index] = +1;
		}
		
		
		 for (int i : A) { System.out.print("-"+i); }
		 
		
		 flag = chk( A);
		 
		if(flag)
		{
			sb.append("1");
		} else {  sb.append("0");}
		
		return sb.toString();
	}
	
	public boolean chk(int[] A)
	{
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] >1 || A[i] ==0) { return false ; }			
		}	
		
		return true;
		
	}
	
	@Test
	public void test1()
	{
		String S ="abcd";
		String chkPlai = chkPlai(S);
		System.out.println(chkPlai);
	}

}

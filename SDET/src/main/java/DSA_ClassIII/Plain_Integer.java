package DSA_ClassIII;

import org.junit.Test;

public class Plain_Integer {
	
	public boolean isPalin(int n)
	{
		int remin =0 ; int quo =0 ;  int sum = 0 ;// 121   r =1 , q = 12     2  q=1 
		
		int temp = n;
		while (n > 0 )	
		{
			remin= n%10 ;
			sum = (sum*10) + remin  ;//  1  12
			n = n/10;	
		}
		
		if(temp == sum ) return true ; 
		else return false ;		
	}


	@Test
	public void Test1()
	{
		int n = 121;
		 Boolean palindrome = isPalin( n);
		 System.out.println(palindrome);
	}

	

	@Test
	public void Test2()
	{
		int n = 1211;
		 Boolean palindrome = isPalin( n);
		 System.out.println(palindrome);
	}

	
	
}

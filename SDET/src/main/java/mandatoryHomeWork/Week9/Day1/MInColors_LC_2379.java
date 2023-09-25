package mandatoryHomeWork.Week9.Day1;

import org.junit.Test;

//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/submissions/

public class MInColors_LC_2379 {
	
public int minimumRecolors(String blocks, int k) {  
	
	int minCounter =Integer.MAX_VALUE ,pointer =0 ,counter = 0 ; String substring =" ";
	
	while (pointer <= blocks.length() - k)
	{
		 substring = blocks.substring(pointer, pointer + k);
		 
		 for (int i = 0; i < substring.length(); i++) 
		 {			 
			 if(substring.charAt(i) == 'B') {continue ;}
			 else { counter++ ;}			
		 }
		 		
		 if (minCounter > counter ) { minCounter = counter ;}
		 counter = 0;
		 pointer ++ ;
	}	
	return minCounter;
    }


@Test
public void Test1()
{
	String blocks = "WBBWWBBWBW"; int  k = 7 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);
	
}

@Test
public void Test2()
{
	String blocks = "WBWBBBW"; int  k = 2 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

@Test
public void Test3()
{
	String blocks = "W"; int  k = 1 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

@Test
public void Test4()
{
	String blocks = "B"; int  k = 1 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
} 

@Test
public void Test5()
{
	String blocks = "WWWW"; int  k = 4 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

}

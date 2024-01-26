package Interview_Practise;

import org.junit.Test;

public class NoOfLinesToWrite_LC_806_WK7_Day2 
{

	@Test
	public void test1()
	{
		int[]  widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 };
		String s = "abcdefghijklmnopqrstuvwxyz" ;

		int[] cntLInes = numberOfLines(widths ,s ) ;
		for (int i : cntLInes) {
			System.out.print( i + " ---    ");
		  }		
	}

	@Test
	public void test2()
	{
		int[]  widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 };
		String s = "bbbcccdddaaa" ;

		int[] cntLInes = numberOfLines(widths ,s ) ;
		System.out.println( "cntLInes from test2  " );	
		for (int i : cntLInes) {
			System.out.print( i + " ---    ");
		  }	
	}



	public int[] cntLInes(int[] widths , String s) { // wrong understandng and wrong impl
		int rowWidth =0 , lineCount =0 ;

		for (int i = 0; i < s.length(); i++) 
		{
			if(rowWidth >= 100)
			{
				rowWidth =  widths[i] ;
				lineCount = lineCount + 1;
			}
			else if (rowWidth < 100)
			{rowWidth = rowWidth + widths[i] ; 	}			

		}


		if( rowWidth >= 100 ) return new int[] { lineCount  , rowWidth };
		else return new int[] { ++lineCount  , rowWidth } ;	   
	}
	
	
	 public int[] numberOfLines(int[] widths, String s)
	 {
		 int rowWidth =0 , lineCount =0 ;
		 
		 for (int i = 0; i < s.length(); i++) 
		 {
			 rowWidth = rowWidth + widths[s.charAt(i) - 'a' ] ;
			 if(rowWidth > 100)
			 {
				 lineCount = lineCount +1 ;
				 rowWidth =  widths[s.charAt(i) - 'a' ] ;				 
			 }
		 }
		 		 
		 return new int[] { ++lineCount , rowWidth };
		 
	 }
}

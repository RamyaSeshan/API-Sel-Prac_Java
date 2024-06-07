package Interview_Practise;

import org.junit.Test;

public class ChessBoard_WHV_LC_1812 
{
	@Test
	public void test1()
	{
		String coordinates = "a1" ;
		boolean squareIsWhite = squareIsWhite( coordinates) ;
		System.out.println(" a1 is --- "  + squareIsWhite) ;
	}


	@Test
	public void test2()
	{
		String coordinates = "h3" ;
		boolean squareIsWhite = squareIsWhite( coordinates) ;
		System.out.println(" h3 is --- "  + squareIsWhite) ;
	}
	
	@Test
	public void test3()
	{
		String coordinates = "c7" ;
		boolean squareIsWhite = squareIsWhite( coordinates) ;
		System.out.println(" c7 is --- "  + squareIsWhite) ;
	}
	

	public boolean  squareIsWhite(String coordinates) {

		char charc = coordinates.charAt(0) ;
		int parseInt = Integer.parseInt( coordinates.substring(1)) ;

		if( charc%2 !=0 &&  parseInt %2 == 0 ) return true;
		else if (  charc%2 !=0 &&  parseInt %2 != 0  ) return false;
		else if (  charc%2 ==0 &&  parseInt %2 != 0  ) return true;
		else if (  charc%2 ==0 &&  parseInt %2 == 0  ) return false;
		else return false;


	}
}

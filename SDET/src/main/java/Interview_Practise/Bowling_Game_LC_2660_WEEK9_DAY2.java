package Interview_Practise;

import java.util.Iterator;

import org.junit.Test;

public class Bowling_Game_LC_2660_WEEK9_DAY2 
{
	@Test
	public void test1()
	{
		int[] player1 = {4,10,7,9  } ,player2 = {6,5,2,3 } ;  // 14 + 14 + 18= 46   ; 21 
		int winner = isWinner( player1, player2) ;
		System.out.println( "  winneris " + winner);
	}

	@Test
	public void test2()
	{
		int[] player1 = {3,5,7,6 } ,player2 = {8,10,10,2 } ;  // 14 + 14 + 18= 46   ; 21 
		int winner = isWinner( player1, player2) ;
		System.out.println( "  winneris test 2 " + winner);
	}

	@Test
	public void test3()
	{
		int[] player1 = {2,3 } ,player2 = {4,1} ;  // 14 + 14 + 18= 46   ; 21 
		int winner = isWinner( player1, player2) ;
		System.out.println( "  winneris test 3 " + winner);
	}


	@Test
	public void Test4()
	{
		int[]  player1 = {3,5,7,6} ; int[] player2 = {8,10,10,2};
		int winner = isWinner( player1,  player2) ;
		System.out.println(  "  winneris test 4 " +winner);	 
	}


	@Test
	public void Test5()
	{
		int[]  player1 = {2} ; int[] player2 = {1};
		int winner = isWinner( player1,  player2) ;
		System.out.println(  " winner test 5  " +winner);	 
	}


	@Test
	public void Test6()
	{
		int[]  player1 = {2} ; int[] player2 = {3};
		int winner = isWinner( player1,  player2) ;
		System.out.println(  " winner test 6  " +winner);	 
	}


	@Test
	public void Test7()
	{
		int[]  player1 = {3,10} ; int[] player2 = {10,3};
		int winner = isWinner( player1,  player2) ;
		System.out.println("Results from Test7 -- " +winner);	 
	}


	 @Test
	 public void Test8()
	 { 
	 	int[]  player1 = {6,9,10,4,4} ; int[] player2 = {8,10,5,1,7}; // 6+9+10+8+8  =  43   , 8+10+10+2+7 == 37
	 	int winner = isWinner( player1,  player2) ;
	 	System.out.println(" TEST 8 IS " +winner);	 
	 }
	 
	 

	public int isWinner(int[] player1, int[] player2) {

		int p1Count = 0 ,  p2Count = 0 ;

		int i =0;

		while (i <= player1.length - 1 )
		{
			//System.out.println( " entry i " + i);
			if (  (i !=0 && player1[i -1 ] ==10 )   ||  (i !=0 && i!= 1 && player1[i -2] ==10 )  )  p1Count = p1Count + 2*player1[i] ;
			else p1Count = p1Count + player1[i] ;



			if (  (i !=0 && player2[i -1 ] ==10 )   ||  (i != 0 && i != 1 &&  player2[i -2] ==10 )  )  p2Count = p2Count + 2*player2[i] ;
			else p2Count = p2Count + player2[i] ;

			i ++;
		}

		//System.out.println( " p1Count    " + p1Count);
		//System.out.println( " p2Count    " + p2Count);

		if( p1Count >  p2Count ) return 1;
		else if ( p1Count < p2Count ) return 2 ;
		else if (( p1Count ==   p2Count ))  return 0;
		return -1;


	}
}


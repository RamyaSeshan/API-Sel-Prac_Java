package mandatoryHomeWork.Week9.Day2;

import org.junit.Test;
//https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/

public class Bowling_Game_LC_2660 {
	
	 public int isWinner(int[] player1, int[] player2) {
		
		 if (player1.length == 1) 
		 {
			 if(player1[0] > player2[0] ) { return 1;}
			 else if(player1[0]  < player2[0] ) { return 2;}
			 else return 0;
		 }
		 
		 int L1 =0  , L2 = 0 , sumP1 =0 ,sumP2=0  ;
		 for (int i = 0; i < player2.length; i++) 
		 {
			 L1 = i-1 ; L2 =i-2 ;  	
			
			 if (L1 == 0 )
			 {				
			   if (player1[L1]  ==10) { sumP1 = sumP1 + (2*player1[i]); }
				 else  sumP1 = sumP1 + player1[i] ;
			   
			   if (player2[L1]  ==10) {sumP2 = sumP2 + (2* player2[i] ) ;}			   
			     else sumP2 = sumP2 + player2[i] ;			 
			 }
			 else if (L1 > 0 && L2 >=0)
			 {
				 if ( player1[L1] == 10 ||  player1[L2] == 10 ) 
				 { sumP1 = sumP1 + (2*player1[i]); }
				 else  sumP1 = sumP1 + player1[i] ;
				 
				 if ( player2[L1] == 10 ||  player2[L2] == 10 ) {sumP2 = sumP2 + (2* player2[i] ) ;}	
				 else  sumP2 = sumP2 + player2[i] ;
			 
			 }else 
			 {				
				 sumP1 = sumP1 + player1[i] ; sumP2 = sumP2 + player2[i] ;	
			 }
			
			 L1 =L2 =0;			
		   }		 
		
		 if  (sumP1 >  sumP2 ) {return 1 ;}
		 else if (sumP1 < sumP2 ) {return 2 ;}
		 else return 0;
		
	    }

	 @Test
	 public void Test8()
	 { 
	 	int[]  player1 = {6,9,10,4,4} ; int[] player2 = {8,10,5,1,7}; // 6+9+10+8+8  =  43   , 8+10+10+2+7 == 37
	 	int winner = isWinner( player1,  player2) ;
	 	System.out.println(winner);	 
	 }
	 
	 @Test
	 public void Test1()
	 {
	    
		int[]  player1 = {4,10,7,9} ; int[] player2 = {6,5,2,3};
		int winner = isWinner( player1,  player2) ;
		System.out.println(winner);		 
	 } 
 
@Test
 public void Test2()
 {
	int[]  player1 = {3,5,7,6} ; int[] player2 = {3,5,7,6};
	int winner = isWinner( player1,  player2) ;
	System.out.println(winner);	 
 }

@Test
public void Test3()
{
	int[]  player1 = {3,5,7,6} ; int[] player2 = {8,10,10,2};
	int winner = isWinner( player1,  player2) ;
	System.out.println(winner);	 
}

@Test
public void Test4()
{
	int[]  player1 = {2,3} ; int[] player2 = {4,1};
	int winner = isWinner( player1,  player2) ;
	System.out.println(winner);	 
}

@Test
public void Test5()
{
	int[]  player1 = {2} ; int[] player2 = {1};
	int winner = isWinner( player1,  player2) ;
	System.out.println(winner);	 
}

@Test
public void Test6()
{
	int[]  player1 = {2} ; int[] player2 = {3};
	int winner = isWinner( player1,  player2) ;
	System.out.println(winner);	 
}

@Test
public void Test7()
{
	int[]  player1 = {2,10} ; int[] player2 = {10,3};
	int winner = isWinner( player1,  player2) ;
	System.out.println("Results from Test7 -- " +winner);	 
}


}

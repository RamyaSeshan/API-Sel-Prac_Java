package Interview_Practise;

import org.junit.Test;

public class StraightLIne_LC_1232
{

	@Test
	public void test1()
	{
		int[][] coordinates = {  {1,2},{2,3},{3,4},{4,5},{5,6},{6,7} } ;		
		boolean striaghtLine = isStriaghtLine(coordinates) ;
		System.out.println("   test1 striaghtLine   " +striaghtLine);		
	}

	@Test
	public void test2()
	{
		int[][] coordinates = {  {1,1},{2,2},{3,4},{4,5},{5,6},{7,7} } ;		
		boolean striaghtLine = isStriaghtLine(coordinates) ;
		System.out.println("   test 2 striaghtLine   " +striaghtLine);		
	}

	@Test
	public void test3()
	{
		int[][] coordinates = {  {1,1},{2,2},{3,3},{4,4},{5,5},{7,7} } ;		
		boolean striaghtLine = isStriaghtLine(coordinates) ;
		System.out.println("   test 3 striaghtLine   " +striaghtLine);		
	}

	@Test
	public void test4()
	{
		int[][] coordinates = {  {0,0},{0,1},{0,-1} } ;		
		boolean striaghtLine = isStriaghtLine(coordinates) ;
		System.out.println("   test 4 striaghtLine   " +striaghtLine);		
	}


	public boolean isStriaghtLine_1(int[][] coordinates)  // this will not work for all test data
	{ 

		int h_interval = coordinates[0][0] - coordinates[0][1] ;
		int v_interval = coordinates[0][1] - coordinates[1][0] ;

		for (int i = 0; i < coordinates.length -1 ; i++) 
		{
			if ( (coordinates[i][0]- coordinates[i][1] == h_interval ) && 
					( coordinates[i][1] - coordinates[i+1][0] ==v_interval)   ) continue;
			else return false;
		}
		return true;

	}

	public boolean isStriaghtLine_2(int[][] coordinates) // this will give div / zero error 
	{
		int gradient ;
		if((coordinates[1][0] ==0 &&  coordinates [0][0] ==0 ) )  gradient = (coordinates[1][1] - coordinates [0][1] ) ;
		else 
			gradient = (coordinates[1][1] - coordinates [0][1] ) / (coordinates[1][0] - coordinates [0][0] );
		System.out.println( " gradient is " +gradient);

		for (int i = 1; i < coordinates.length -1 ; i++) 
		{
			if(  (coordinates[i+1][0] - coordinates [i][0] )  == 0 )
			{
				if( (coordinates[i+1][1] - coordinates [i][1] ) != gradient) return false ;
			}
			else if ( (coordinates[i+1][1] - coordinates [i][1] ) / (coordinates[i+1][0] - coordinates [i][0] ) != gradient ) return false;
		}
		return true;		
	}


	public boolean isStriaghtLine(int[][] coordinates) 
	{
          int xDiff = coordinates[1][0] - coordinates [0][0];
          int yDiff = (coordinates[1][1] - coordinates [0][1] ) ;
          
          for (int i = 0; i < coordinates.length -1 ; i++) 
          {
			 if ( xDiff * ( coordinates[i+1][1] - coordinates [i][1] ) != yDiff * ( coordinates[i+1][0] - coordinates [i][0] ) ) return false ;
		  }
          
		return true;

	}

}

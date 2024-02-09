package Interview_Practise;

import org.junit.Test;

public class MInColors_LC_2379_WEEK9_DAY1   // took 0 ms 
{
	@Test
	public void test1()
	{
		String blocks = "WBBWWBBWBW" ;
		int k = 7 ;
		int minimumRecolors = minimumRecolors( blocks,  k) ;
		System.out.println(  "  minimumRecolors  is  " + minimumRecolors);
	}
	
	
	@Test
	public void test2()
	{
		String blocks = "WBWBBBW" ;
		int k = 2 ;
		int minimumRecolors = minimumRecolors( blocks,  k) ;
		System.out.println(  "  minimumRecolors test II  is  " + minimumRecolors);
	}
	
	
	@Test
	public void Test3()
	{
		String blocks = "W"; int  k = 1 ;
		int minimumRecolors = minimumRecolors( blocks,  k);
		System.out.println(" test 3 " +minimumRecolors);	
	}

	@Test
	public void Test4()
	{
		String blocks = "B"; int  k = 1 ;
		int minimumRecolors = minimumRecolors( blocks,  k);
		System.out.println("test 4 " +minimumRecolors);	
	} 

	@Test
	public void Test5()
	{
		String blocks = "WWWW"; int  k = 4 ;
		int minimumRecolors = minimumRecolors( blocks,  k);
		System.out.println("test 5 " +minimumRecolors);	
	}


	public int minimumRecolors(String blocks, int k)  //WBWBBBW
	{
        int count = 0 , min = Integer.MAX_VALUE  , i ;       
                
        char[] charArray = blocks.toCharArray() ;
        
        for ( i = 0; i < k; i++) 
        {
			if( charArray[i]  == 'W' ) count = count + 1; 
		}
        
        min = Math.min(min, count) ;
      
         i =0;
        
        while ( k <= charArray.length -1 )
        {
        	if( charArray[i]  == 'W' ) count = count -1 ; 
        	if( charArray[k]  == 'W' ) count = count + 1 ; 
        	min = Math.min(min, count) ;
        
        	i = i + 1 ;
        	k = k + 1 ; 
        }        	        
		return min; 
	}

	


}

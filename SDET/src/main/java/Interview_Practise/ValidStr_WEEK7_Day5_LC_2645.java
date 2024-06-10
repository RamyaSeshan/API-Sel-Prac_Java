package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ValidStr_WEEK7_Day5_LC_2645 
{

	/*@Test
	public void test1()
	{
		String word = "b" ;
		int addMinimum = addMinimum( word)  ;
		System.out.println("test I   " +addMinimum);
	}

	
	@Test
	public void test2()
	{
		String word = "aaa" ;
		int addMinimum = addMinimum( word)  ;
		System.out.println("test II  " +addMinimum);
	}
	 */
	
	@Test
	public void test3()
	{
		String word = "abc" ;
		int addMinimum = addMinimum( word)  ;
		System.out.println("test III  " +addMinimum);
	}

	@Test
	public void test4() // will not work for this tets data 
	{
		String word = "aaaabb" ;
		int addMinimum = addMinimum( word)  ;
		System.out.println("test IV  " +addMinimum);
	}
	
	public int addMinimum(String word) {

		Map<Character , Integer> map = new HashMap<Character , Integer>() ;
		int aCount , bCount ,cCount = 0 ,maxCount= 0 ;
		int total = 0 ;

		for (int i = 0; i < word.length(); i++) 
		{
			map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1) ;
		}

		
		if(map.get('a') != null ) aCount = map.get('a'); 
		else aCount =  0;

		if(map.get('b') != null ) bCount = map.get('b'); 
		else bCount =  0;

		if(map.get('c') != null ) cCount = map.get('c'); 
		else cCount =  0;

		
		if( aCount > bCount ||  aCount ==  bCount )
		{
			if( aCount > cCount ||   aCount == cCount )
			{
				maxCount = aCount ;
			}else maxCount = cCount ;			
		}
		else if (bCount > cCount ||  bCount == cCount)
		{
			maxCount = bCount ;
		} 
		else maxCount = cCount;
        
	

       if (aCount != maxCount)  total = total + ( maxCount - aCount ) ;
   
       if (bCount != maxCount)  total = total + ( maxCount - bCount );
   
       if (cCount != maxCount)  total = total + ( maxCount - cCount );
   
       
       
       return total;
	}
	
}

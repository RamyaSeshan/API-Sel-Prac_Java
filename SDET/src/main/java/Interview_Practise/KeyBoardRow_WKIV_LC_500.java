package Interview_Practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KeyBoardRow_WKIV_LC_500 {

	@Test
	public void test1()
	{
		String[] words = {"Hello","Alaska","Dad","Peace" };
		List<String> findWords = findWords( words) ;
		System.out.println( " findWords ----" +findWords);
	}
	
	@Test
	public void test2()
	{
		String[] words = {"omk" };
		List<String> findWords = findWords( words) ;
		System.out.println( " findWords ----" +findWords);
	}
	
	@Test
	public void test3()
	{
		String[] words = {"adsdf","sfd"};
		List<String> findWords = findWords( words) ;
		System.out.println( " findWords ----" +findWords);
	}
	

	public List<String> findWords(String[] words) 
	{
        String row1 ="qwertyuiop" ;
        String row2 = "asdfghjkl" ;
        String row3 = "zxcvbnm" ;
        List<String> list = new ArrayList< String>() ;	
        
        for (String word : words) 
        {
			String lowerCase = word.toLowerCase() ;        
			int i =1;		
							
			if ( row1.contains( lowerCase.charAt(0)+"" ) )
			{
				while ( i < word.length())
				{					
					if( ! row1.contains( lowerCase.charAt(i)+"" )  ) break;
					else if ( row1.contains( lowerCase.charAt(i)+"" )  && i ==  word.length() -1 )
					{
						list.add(word) ;
						break;
					}
					i++;
				}				
			}
			else if( row2.contains( lowerCase.charAt(0)+"" ) )
			{
				while ( i < word.length())
				{					
					if( ! row2.contains( lowerCase.charAt(i)+"" )  ) break;
					else if ( row2.contains( lowerCase.charAt(i)+"" )  && i ==  word.length() -1 )
					{
						list.add(word) ;
						break;
					}
					i++;
				}
			}
			else if( row3.contains( lowerCase.charAt(0)+"" ) )
			{
				while ( i < word.length())
				{					
					if( ! row3.contains( lowerCase.charAt(i)+"" )  ) break;
					else if ( row3.contains( lowerCase.charAt(i)+"" )  && i ==  word.length() -1 )
					{
						list.add(word) ;
						break;
					}
					i++;
				}
			}			
			
		}
        
         return list ;

	}

}

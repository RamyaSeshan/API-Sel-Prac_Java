package DSA_Addtional.Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class WordPattern {

 @Test
	public void test1()
	{
		String pattern ="abba" ;
		String s ="dog cat cat dog";
		 boolean wordPattern = wordPattern( pattern,  s) ;
		 System.out.println("test1  -- " +wordPattern);
	}
	
@Test
	public void test2()
	{
		String pattern ="abba" ;
		String s ="dog cat cat fish";
		 boolean wordPattern = wordPattern( pattern,  s) ;
		 System.out.println("test2  -- " +wordPattern);
	}
	
@Test
	public void test3()
	{
		String pattern ="aaaa" ;
		String s ="dog cat cat dog";
		 boolean wordPattern = wordPattern( pattern,  s) ;
		 System.out.println("test2  -- " +wordPattern);
	}
	
	  @Test
		public void test4()
		{
			String pattern ="abba" ;
			String s ="dog dog dog dog";
			 boolean wordPattern = wordPattern( pattern,  s) ;
			 System.out.println("test4  -- " +wordPattern);
		}
	  
	
	public boolean wordPattern(String pattern, String s) {
		
		
		String[] split = s.split("\\s") ;
		if(split.length != pattern.length()) return false;
		
		Map<Character , String> map = new HashMap<Character , String>() ;
		
		for (int i = 0; i < pattern.length(); i++) 
		{
			char charAt = pattern.charAt(i) ;
			if(map.containsKey(charAt))
			{			
			  if( ! map.get( charAt).equals(split[i])  ) return false;		
			}
			/*else if( map.containsValue(split[i]))
			{
				for (Entry<Character, String> entry : map.entrySet()) 
				{	
					if(entry.getValue().equals(split[i]))
					{
						Character key = entry.getKey();
						if ( ! key.equals(pattern.charAt(i))  ) return false;
					}
					
			    }
			}	*/		
			else 
			{
			     if( map.containsValue(split[i]) )  return false;	
				map.put( pattern.charAt(i) ,split[i] ) ;
			}				
		}
		
		return true;
		
	}
	

}

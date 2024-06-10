package Interview_Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

// TimeComplexity  O[N]    || SpaceComplexity O[N] + O[N] 

public class ConvertOccToCount
{
	@Test
	public void test1()
	{
		String s = "aaabbcccc" ;
		String cntOccurance = cntOccurance(s) ;
		System.out.println(cntOccurance);
	}

	public String cntOccurance(String s) {
		 Map<Character , Integer> mapA = new HashMap<Character , Integer>() ;
		 List<Object> list = new ArrayList<Object>() ;
		 StringBuffer sb = new StringBuffer() ;
		 
		 for (int i = 0; i < s.length(); i++) 
		 {
			mapA.put(s.charAt(i), mapA.getOrDefault(s.charAt(i), 0) + 1 ) ;
		 }
		 
		 System.out.println(mapA);
		 
		for (Map.Entry<Character , Integer> entry : mapA.entrySet()) 
		{
			//list.add(entry.getKey()) ;
			//list.add(entry.getValue() ) ;
			sb.append(entry.getKey())  ;
			sb.append(entry.getValue() ) ;
		}
		
		//return list;
		return sb.toString() ;

	}



}

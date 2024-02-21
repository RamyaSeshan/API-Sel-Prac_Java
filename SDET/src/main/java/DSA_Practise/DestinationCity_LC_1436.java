package DSA_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class DestinationCity_LC_1436 {
	
	/*
	 * Psuedo Code
	 *  take the input in a list of list 
	 *    iterate thru list and add list[0] as key and list[1] as value 
	 *  iterate thru map , chk if value NOT contains key , then return it 
	 *    
	 *
	 */

	
	@Test
	public void test1()
	{
		List<List<String>> paths = new ArrayList<List<String>>() ;
		List<String> city = new ArrayList<String>() ;
		city.add("London") ;
		city.add("New York") ;
		List<String> city1 = new ArrayList<String>() ;
		city1.add("New York") ;
		city1.add("Lima") ;
		List<String> city2 = new ArrayList<String>() ;
		city2.add("Lima") ;
		city2.add("Sao Paulo") ;
		paths.add(city) ; paths.add(city1) ; paths.add(city2) ; 
		 String destCity = destCity(  paths) ;
		 System.out.println(" destCity is ... " +destCity);
	}
	
	@Test
	 public void test2()
	 {
		 List<List<String>> paths = Arrays.asList(Arrays.asList("B","C"),
                Arrays.asList("D","B"),
                Arrays.asList("C","A"));
		 
		 String destCity = destCity( paths) ;
		 System.out.println(destCity);
				 
	 }
	
	 @Test
	 public void test3()
	 {
		 List<List<String>> paths = Arrays.asList(Arrays.asList("A","Z") );
		 
		 String destCity = destCity( paths) ;
		 System.out.println(destCity);
				 
	 }
	 
	 @Test
	 public void test4()
	 {
		 List<List<String>> paths = Arrays.asList(Arrays.asList("A","Z") , Arrays.asList("Z","C111"));
		 
		 String destCity = destCity( paths) ;
		 System.out.println(destCity);
				 
	 }
	 
	 public String destCity(List<List<String>> paths)  //Approach II 
	 {
		 Set<String> destn = new HashSet<String>();
			List<String> res = new ArrayList<String>();
			
			for (List<String> source : paths) 
			{
				if (!destn.contains(source.get(0)))
					destn.add(source.get(0));		
			}
			for (List<String> destination : paths) 
			{
				if (!destn.contains(destination.get(1)))
					res.add(destination.get(1));
			}
			return res.get(res.size() -1 );
	 }
	 
	
	 public String destCity1(List<List<String>> paths) {
		
		 
		 Map<String, Integer  > map = new HashMap<String, Integer>() ;	
	
		 
		 for (int i =0 ; i < paths.size() ; i++ ) 
		 {
			map.put(paths.get(i).get(1), map.getOrDefault(paths.get(i).get(1), 0) +1) ;
		 }
		
		 
		 for (int i =0 ; i < paths.size() ; i++ ) 
		 {
			map.put(paths.get(i).get(0), map.getOrDefault(paths.get(i).get(0), 0) - 1) ;
		 }
		
		
		 for (Map.Entry<String, Integer> entry : map.entrySet()) 
		 {
			 if (entry.getValue() == 1 ) return entry.getKey() ;
			
		 }
		 
		 
		  return null;
	        
	    }
}

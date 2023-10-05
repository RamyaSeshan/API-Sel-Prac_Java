package mandatoryHomeWork.Week10.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;


// https://leetcode.com/problems/destination-city/submissions/

/*
 *  Time Complexity O [ Nlog N ] ; Space Complexity - O[N ] 
 * Psuedo Code 
 *   1.Iterate thur list and get the dest [ list.get(1) ] and src  [list.get(0) ]
 *    -->   in a Map ,add string value asKey and dest occurance and values 
 *    --> in the same map , decremtn the src values 
 *  2.iterate thur  Map entry set
 *    -->if any of the entity has value 1 , return its key 
 *   
 */
public class Destination_city_LC_1436 {
	
	 public String destCity1(List<List<String>> paths) {
		 
		 Map<String ,Integer> values = new HashMap<String ,Integer>() ;
		 String temp = "" ;	
		
		 for (int i = 0; i < paths.size(); i++) 
		   {
			 temp =  paths.get(i).get(1) ;
			 values.put(temp, values.getOrDefault(temp, 0) +1) ;			
	     	}
		 
		 System.out.println(values);
		 System.out.println("--------------------------");
		 
		 for (int i = 0; i < paths.size(); i++) 
		   {
			 temp =  paths.get(i).get(0) ;			 
			 values.put(temp, values.getOrDefault(temp, 0) -1) ;		 
	     	}
		 
		 System.out.println(values);
		for(Map.Entry<String ,Integer> result : values.entrySet()) {
			
			if(result.getValue() == 1) { return result.getKey()  ; }
			
		   }
		 return null;
	        
	    }

 public String destCity2(List<List<String>> paths) {
		 
		 Map<String ,Integer> values = new HashMap<String ,Integer>() ;
		 StringBuffer src = new StringBuffer();
		 StringBuffer dest = new StringBuffer();
		 
		 
		 for (List<String> list : paths) {			 
			 
			 dest =  dest.append(list.get(1));
			 src =  src.append(list.get(0));
			 values.put(dest.toString(), values.getOrDefault(dest.toString(), 0) +1) ;
			 values.put(src.toString(), values.getOrDefault(src.toString(), 0) -1) ;
			 
			 dest.setLength(0);
			 src.setLength(0);
			
	     	}
		
		/* for (int i = 0; i < paths.size(); i++) 
		   {
			 dest =  dest.append(paths.get(i).get(1));
			 src =  src.append(paths.get(i).get(0));
			 values.put(dest.toString(), values.getOrDefault(dest.toString(), 0) +1) ;
			 values.put(src.toString(), values.getOrDefault(src.toString(), 0) -1) ;
			 
			 dest.setLength(0);
			 src.setLength(0);
	     	}*/
	
		 
		for(Map.Entry<String ,Integer> result : values.entrySet()) {
			
			if(result.getValue() == 1) { return result.getKey()  ; }
			
		   }
		 return null;
	        
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
		return res.iterator().next();
 }
	 
	 @Test
	 public void test1()
	 {
		 List<List<String>> paths = Arrays.asList(Arrays.asList("B","C"),
                 Arrays.asList("D","B"),
                 Arrays.asList("C","A"));
		 
		 String destCity = destCity( paths) ;
		 System.out.println(destCity);
				 
	 }
	 
	 @Test
	 public void test2()
	 {
		 List<List<String>> paths = Arrays.asList(Arrays.asList("London","New York"),
                 Arrays.asList("New York","Lima"),
                 Arrays.asList("Lima","Sao Paulo"));
		 
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
}

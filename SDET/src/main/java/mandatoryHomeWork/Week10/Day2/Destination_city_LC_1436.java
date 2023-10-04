package mandatoryHomeWork.Week10.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

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

 public String destCity(List<List<String>> paths) {
		 
		 Map<String ,Integer> values = new HashMap<String ,Integer>() ;
		 StringBuffer src = new StringBuffer();
		 StringBuffer dest = new StringBuffer();
		 
		
		 for (int i = 0; i < paths.size(); i++) 
		   {
			 dest =  dest.append(paths.get(i).get(1));
			 src =  src.append(paths.get(i).get(0));
			 values.put(dest.toString(), values.getOrDefault(dest.toString(), 0) +1) ;
			 values.put(src.toString(), values.getOrDefault(src.toString(), 0) -1) ;
			 
			 dest.setLength(0);
			 src.setLength(0);
	     	}
	
		 
		 System.out.println(values);
		for(Map.Entry<String ,Integer> result : values.entrySet()) {
			
			if(result.getValue() == 1) { return result.getKey()  ; }
			
		   }
		 return null;
	        
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

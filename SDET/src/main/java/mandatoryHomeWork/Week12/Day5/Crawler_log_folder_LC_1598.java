package mandatoryHomeWork.Week12.Day5;

import org.junit.Test;

public class Crawler_log_folder_LC_1598 {
	
	  // https://leetcode.com/problems/crawler-log-folder/
	 public int minOperations(String[] logs) { // took 1ms 
	        int count = 0  ;        
	      
	        for (int i = 0; i < logs.length; i++) {
	        	  String string = logs[i] ;
	        	  
	        	  if(string.equals("../")) { if (count ==0 ) continue  ; else count --; }
	        	  else if(string.equals("./")) {  continue ; }
	        	  else count ++; 	        	
			}
	        
	        return count ;
	    }
@Test
public void test1()
{	
	String[] logs = {"d1/","d2/","../","d21/","./" } ;
	System.out.println(minOperations(logs));
}

@Test
public void test2()
{	
	String[] logs = {"d1/","d2/","./","d3/","../","d31/" } ;
	System.out.println(minOperations(logs));
}

@Test
public void test3()
{	
	String[] logs = {"d1/","../","../","../" } ;
	System.out.println(minOperations(logs));
}
}

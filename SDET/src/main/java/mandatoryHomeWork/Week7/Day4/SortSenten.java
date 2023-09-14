package mandatoryHomeWork.Week7.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class SortSenten {
	 public String sortSentence(String s) {
		
		 String subStr =" " ;
		 int index ;
		 StringBuffer sb = new StringBuffer();
		 
		 String[] input  = s.split(" ");
		 String[] strArr = new String[input.length];
		 
	    for (int i = 0; i < input.length; i++) {
		    
		subStr= input[i].substring(0, input[i].length()-1);
		index = Integer.parseInt(input[i].charAt(input[i].length() -1)+"");
		strArr[index-1] = subStr;		
		   }
		 
		for (int i = 0; i < strArr.length; i++) {			
			if( i== strArr.length-1) { sb.append(strArr[i])  ; } 
			else 
			 { sb.append(strArr[i]) ; 
			   sb.append(' ');
			 } 				
		}
	 
		 return sb.toString();  
	    }

	 
@Test
public void Test1()
{	String s ="is2 sentence4 This1 a3";
    String sortSentence = sortSentence( s);
    System.out.println(sortSentence);	
}

@Test
public void Test2()
{	String s ="Myself2 Me1 I4 and3";
    String sortSentence = sortSentence( s);
    System.out.println(sortSentence);	
}
}

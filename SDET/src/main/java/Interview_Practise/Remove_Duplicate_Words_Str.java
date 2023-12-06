package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Remove_Duplicate_Words_Str {
	
  // Implement a method to remove duplicate words from a sentence efficiently.
	
@Test
public void test1()
{
	String str = " this is is test to check duplicate duplicate " ;
	String remove_Duplicate_Words_Str = remove_Duplicate_Words_Str(str) ;
	System.out.println(remove_Duplicate_Words_Str);
}

public String  remove_Duplicate_Words_Str(String str) {
	
	StringBuffer sb = new StringBuffer();
	
	Set<String> unique = new HashSet<String>() ;
	
	String[] split = str.split("\\s+") ;
	
	for (String word : split) 
	{  if (unique.add(word))	 { sb.append(word).append(" ")  ; }  }			
	
	return sb.toString().trim() ;
}

}

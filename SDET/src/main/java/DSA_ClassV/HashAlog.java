package DSA_ClassV;

import org.junit.Test;

public class HashAlog {
	
	
	public void findHashValue (String s)
	{
		int hashCode = s.hashCode() ;
		int result = hashCode >> 16 ;
		System.out.println(result);
	}
@Test
public void Test1()
{
	//findHashValue (String SizeOfTheArray) ;
}
}

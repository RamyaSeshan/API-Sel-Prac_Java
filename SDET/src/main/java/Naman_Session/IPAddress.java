package Naman_Session;

import org.junit.Test;

public class IPAddress { //

	/*Problem Statement 
	 * Given a valid IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Do Not Use the replaceAll()
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
	 */

	String output ="";
	public String Replace(String address)
	{
		for (int i = 0; i <address.length() ; i++) {
			if (address.charAt(i)== '.')
			{
				output = output+"[.]" ;
			} else 
			{ output = output+address.charAt(i) ; }
		}
	
		return output;
	}
@Test
public void Test1()
{
	String address = "1.1.1.1";
	 System.out.println(Replace( address));
}

}

package mandatoryHomeWork.Week6.Day3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DeCode {
	public String decodeMessage(String key, String message)

	{	
		int index ;
		int C;

		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();
		List<Character> set = new ArrayList<Character>();

		String newInput = key.replaceAll(" ", "");
		System.out.println(newInput);

		for (int i = 0; i < newInput.length(); i++) {
			if(set.contains(newInput.charAt(i))) { continue ;}
			else 
			{
				set.add(newInput.charAt(i));
			}
		}

		for (Character character : set) {
			sb.append(character);
		}

		String val = sb.toString();

		for (int j = 0; j < message.length(); j++) {

			if (message.charAt(j) != ' ')
			{
				if( val.contains(String.valueOf(message.charAt(j))))
				{		

					index = val.indexOf(message.charAt(j));					
					C =index+'a';					
					result = result.append((char)C);
				}	
			}else 
			{
				result = result.append(message.charAt(j));
			}

		}

		return result.toString();

	}

	
	
	
	@Test
	public void test1()
	{
		String  key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv" ;
		String decodeMessage = decodeMessage( key,  message);
		System.out.println(decodeMessage);
	}

	@Test
	public void test2()
	{
		String  key = "eljuxhpwnyrdgtqkviszcfmabo";
		String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb" ;
		String decodeMessage = decodeMessage( key,  message);
		System.out.println(decodeMessage);
	}

}

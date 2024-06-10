package mandatoryHomeWork.Week6.Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public String decodeMessage1(String key, String message)
	{
		Map <Integer, Character> map = new HashMap<Integer, Character>();
		int cnt =0;
		int index , C;
		StringBuffer result = new StringBuffer();
		
		for (Integer i = 0; i < key.length(); i++) {
			if (key.charAt(i) != ' ')
			{
				if(!map.containsValue(key.charAt(i)))
				{
					map.put(cnt, key.charAt(i));	
					cnt ++;	}
			}			
		}
	
		//System.out.println("The value in map is " +map);
		
		for (int j = 0; j < message.length(); j++) {
			if (message.charAt(j) != ' ')
			{
				for (int k = 0; k < map.size() ; k++) 
				{			
					if( map.get(k) == message.charAt(j))
						{		
							index = k;			
							C =index+'a';					
							result = result.append((char)C);
						}	
				 } 
			  }
		         else 
				 {
					//System.out.println("-"+message.charAt(j)+"-");
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
		String decodeMessage = decodeMessage1( key,  message);
		System.out.println(decodeMessage);
	}

	@Test
	public void test2()
	{
		String  key = "eljuxhpwnyrdgtqkviszcfmabo";
		String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb" ;
		String decodeMessage = decodeMessage1( key,  message);
		System.out.println(decodeMessage);
	}

}

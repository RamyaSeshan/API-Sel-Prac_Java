package DSA_DailyConnect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class chk {


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

	 public int numIdenticalPairs(int[] nums) {
	        int count =0;
	        for (int i=0 ; i < nums.length -1 ; i++)
	        {
	            for (int j= i+1 ; j < nums.length  ; j++ )
	            {
	                  if (nums[i] == nums[j])
	                  { count ++ ;}
	            }
	        }

	        return count ;
	    }
	
	public StringBuilder voidchkStr()
	{
		 StringBuilder sb = new StringBuilder();
		List<String> test = new ArrayList<String>();
        test.add("one");
        test.add("two");
        test.add("three");
       Iterator it = test.iterator();

       while(it.hasNext())
       {
       Object s=(String) it.next();   
       sb.append(s);
       sb.append(' ');
         }
       return sb;
	}
	
	public String strRev1(String s)
	{
	    if (s.length() ==1 ) { return s;}
		StringBuffer sb = new StringBuffer();
		
	  for (int i = s.length()-1; i >=0 ; i--) {
		sb = sb.append(s.charAt(i));
	   }
	  return sb.toString();
	}
	
	public String strRev(String s)
	{	 
	  int begin =0;
	  int last = s.length()-1;
	  String res = "";
	  char temp;
	  char[] charArr = new char[s.length()] ;
	  
	  while (begin < last)  //Ramya
	  {
		temp = s.charAt(begin);  //R a
		charArr[last]=s.charAt(begin);  //y
		charArr[begin] =s.charAt(last); //R so aymaR		
		begin ++; //1
		last --; //3 
	  }
	  String valueOf = res.valueOf(charArr) ;
  	  return valueOf;
	}
	
	
	
	/*@Test
	public void Test5()
	{
		String s = " This is Chennai ** Pattinam !!";
		String val = strRev(s);
		System.out.println(val);
	}
	
	@Test
	public void Test6()
	{	
		String s = "Ramya";
		String val = strRev(s);
		System.out.println(val);
		} */
	@Test
	public void Test6()
	{	
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		System.out.println(a+b);
	
		
		}
	
	@Test
	public void Test7()
	{		
		System.out.println(0%2);
	    String s = "abc";
	   int temp =0;
	    for (int i = 0; i < s.length(); i++) {
			temp += s.charAt(i);
		}  
	    System.out.println(temp);
		}
	
	/*@Test
	public void Test4()
	{
		StringBuilder voidchkStr = voidchkStr();
		System.out.println(voidchkStr);
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
	
	@Test
	public void test3()
	{
		String  key = "abcdegfh";
		key = key.substring(0,key.indexOf("e") );
		System.out.println(key);
		
	}*/
	
	
}

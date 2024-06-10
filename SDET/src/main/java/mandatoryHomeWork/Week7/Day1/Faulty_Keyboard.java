package mandatoryHomeWork.Week7.Day1;

import org.junit.Test;

public class Faulty_Keyboard {

	/*
	 * 	/*
	 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input String s , output String

2.Frame Test data (valid, invalid, complex and edge cases)
Input: s = "aeiou"
Output:  eaou

Input: s = "aioue"
Output: aoue

Input: s = "ramyai"
Output: aymar

Input: s = "iramya"
Output: ramya

Input: s = string
Output: rtsng

Input: s = poiinter
Output:  ponter

Input: s = poiintier
Output:  pontier  -->   tnoper

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)
Yes 
 //poiintier    "aeiou"  "aioue"
Declare StringBuffer A = new StringBuffer()
Declare StringBuffer B = new StringBuffer()
Declare a StringBuffer and pass the String S [ StringBuffer Sb = new StringBuffer(S) ]
return the same sb id it do not contains "i"if (!sb.contains("i")) { return sb.toSting() ; } 

iterate thru while loop till condition  sb.contains("i")  while (sb.contains("i") )
 --> if i is in the 0th index , make sb.subString(1)  | sb.index("i") ==0  return {sb.subString(1);} 
 --> if i is in the last index , make sb.subString(1)  | 
      sb.index("i") == sb.lenght()-1) , then reverse sb.subString(0,sb.lenght()-1) , make sb == return from rev(String sb)
      if(sb.index("i") == sb.lenght()-1)
     sb =  rev (sb.subString(0,sb.lenght()-1) )
--> else 
    A = rev(sb.subString(0,i) )  B = (sb.subString(i)    // po intier , 
    sb = A.append(b) // opintier , pontier  , tnoper


      public void rev(StringBuffer sb)
      StringBuffer Sb1 = new StringBuffer()
      for(int i = sb.lenght-1 ; i > =0 ; i--)
        { sb1.append(sb(i)) } 
      return sb1

6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
	 */


	public String finalString1(String s) { 
				
		if (!s.contains("i")) { return s ; } 
		
		 while (s.contains("i") )
		 {
			 if(s.indexOf("i") ==0 )
			 {
				 s= s.substring(1);
			 }
			 else if(s.indexOf("i") == s.length()-1 )
			 {
				 s= rev(s.substring(0,s.length()-1 ));
			 }else 
			 {
				 String str1 = rev(s.substring(0, s.indexOf("i") ) );			
				 String str2 = s.substring(s.indexOf("i")+1 );				
				 s= str1+str2 ;				
			 }
		 }

		return s;
	}
	
	public String rev(String S)
	{
		StringBuffer A = new StringBuffer() ;
		for (int i = S.length()-1; i >=0 ; i--) {
			A.append(S.charAt(i));
		}return A.toString();	
	}

	public String finalString(String s)
	{
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length() ; i++) {
			if(s.charAt(i) == 'i') sb.reverse() ;
			else sb.append(s.charAt(i)) ;
		}
		
		return sb.toString();
	}

@Test
public void Test1()
{
	String s = "aeiou";
	String finalString = finalString( s);
	System.out.println("test 1 is --> "+finalString);	
}

@Test
public void Test2()
{
	String s = "aioue";
	String finalString = finalString( s);
	System.out.println("test 2 is --> "+ finalString);	
}

@Test
public void Test3()
{
	String s = "ramyai";
	String finalString = finalString( s);
	System.out.println("test 3 is --> "+ finalString);	
}

@Test
public void Test4()
{
	String s = "iramya";
	String finalString = finalString( s);
	System.out.println("test 4 is --> "+ finalString);	
}

@Test
public void Test5()
{
	String s = "string";
	String finalString = finalString( s);
	System.out.println("test 5 is --> "+ finalString);	
}

@Test
public void Test6()
{
	String s = "poiinter";
	String finalString = finalString( s);
	System.out.println("test 6 is --> "+ finalString);	
}

@Test
public void Test7()
{
	String s = "poiintier";  
	String finalString = finalString( s);
	System.out.println("test 7 is --> "+ finalString);	
}

}

package DSA_DailyConnect;

import org.junit.Test;

public class StringRev_LC_541 {
	/*
1.Understanding the problem to detailed level (clarity on input and output, constraints) --Yes
input string s , int k | output string

2.Frame Test data (valid, invalid, complex and edge cases)
s="abcdefghi "  k=3 output : "cbadefihh"
s="abcdefgh "  k=3 output : "cbadefigh"
s="abcdefghabcdefghi  "  k=4 output : "dcbaefhgdcbaefghi"


3.Do you know the Solution? -- Yes

4.Do you have any alternate approaches? (Thing of alternate approaches)  -- NO

5. Derive Pseudo code in paper (for the best chosen approach) -- Yes

6. Dry run the pseudo code with all test data from step #2 -- Yes

7.Write the code on notepad

8. Dry run the code with all test data from step #2

9. Write code on IDE (remember to add comments and practice coding standards)

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE

11. Check for any gaps of code optimization (if not optimized already in Step #9)

	 */
	public static String reverseStr(String s, int k) {  

		StringBuffer sb1= new StringBuffer();
		StringBuffer val= new StringBuffer();
		String sub ="";
		String sub1 ="";
		String sub2 ="";

		for (int i = 0; i < s.length(); i = i+(2*k)) { 

			if(s.substring(i).length() <=k )
			{
				sub = s.substring(i);
				for (int j = s.substring(i).length() -1; j >=0; j--) {
					val = val.append(sub.charAt(j));					
				}
				return val.toString();
			} 
			else if(s.substring(i,i+k).length() == k  && s.substring(i).length() < (2*k)) //"abcdef";
			{
				sub = s.substring(i);
				sub1 =sub.substring(0, k);								
				sub2 = sub.substring(k);			
				for (int j =  sub1.length()-1 ; j>=0; j--) {
					sb1= sb1.append(sub1.charAt(j)) ;					
				}
				val.append(sb1).append(sub2);
				return val.toString();

			}
			else if(s.substring(i,i+k).length() == k  && s.substring(i).length() >= 2*k) //" "abcdef";";
			{
				sub = s.substring(i, i+(2*k));
				sub1 = sub.substring(0,k);
				sub2 = sub.substring(k);
				for (int j =  sub1.length()-1 ; j>=0; j--) {
					sb1= sb1.append(sub1.charAt(j)) ;					
				}

				val.append(sb1).append(sub2);
				sb1=sb1.delete(0, sb1.length());
			}


		}  

		return val.toString();

	}

	@Test
	public void test11()
	{
		String s = "abcdefg";
		int k = 1;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println("K=1 val  is ---"+reverseStr);
	}

	@Test
	public void test1()
	{
		String s = "a";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}

	@Test
	public void test2()
	{
		String s = "ab";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}


	@Test
	public void test3()
	{
		String s = "abc";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}

@Test
	public void test4()
	{
		String s = "abcd";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}

@Test
	public void test5()
	{
		String s = "abcdef";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println("Test 5 ia "+reverseStr);
	}

@Test
	public void test6()
	{
		String s = "abcdefgh";
		int k = 2;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}

	@Test
	public void test7()
	{
		String s = "abcdefgh";
		int k = 3;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println(reverseStr);
	}

	@Test
	public void test8()
	{
		String s = "abcdefgh";
		int k = 4;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println("Test 8 is "+ reverseStr);
	}

	@Test
	public void test9()
	{
		String s = "abcdefgh";
		int k = 5;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println("test 9 ans is "+reverseStr);
	}

	@Test
	public void test10()
	{
		String s = "abcdefg";
		int k = 8;
		String reverseStr = reverseStr( s,  k) ;
		System.out.println("test 10 ans  is ---"+reverseStr);
	}


}

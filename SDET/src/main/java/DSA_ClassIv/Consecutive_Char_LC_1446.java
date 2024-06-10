package DSA_ClassIv;

import org.junit.Test;

//https://leetcode.com/problems/consecutive-characters/description/

/*
 * PSUEDO Code 
 * 
 * 1.declare int left =0 , right =1 , maxSize= -1 
 *2. iterate till right less than equal input string  lenght 
 *3. check if character at  left postion equals right position 
 *   --> then check if right less than equal string lenght -1 
 *      --> increment right
 *  
 *  check if  character at  left postion NOT equals right position 
 *   --> obtain the max win size 
 *   --> set left = right and incement right
 * 
 * finally return maxsize
 * 
 * 
 * 
 */

public class Consecutive_Char_LC_1446 {
	
    public int maxPower(String s) { // leetcode
	
	 int left =0 , right = 1, maxSize = -1  ,tempSize =0;
	 
	 while (right < s.length()) {
		 
		 if (s.charAt(left) == s.charAt(right))
		 {
			 if (right != s.length()) { right ++ ;} 
		 }
		 else if (right != s.length())
		 {
			 tempSize = right - left ;
			 if(maxSize < tempSize) { maxSize = tempSize ;}
			 left = right ; 
			 if (right != s.length()) { right ++ ;} 
		 }		 
		 
	 }
	 tempSize = right - left ;
	 if(maxSize < tempSize) { maxSize = tempSize ;}
		
	return maxSize;
        
    }

    
    @Test
    public void test1()
    {
    	String s = "leetcode";
    	 int maxPower = maxPower( s) ;
    	 System.out.println(maxPower);    	
    }
    
    @Test
    public void test2()
    {
    	String s = "abbcccddddeeeeedcba";
    	 int maxPower = maxPower( s) ;
    	 System.out.println(maxPower);    	
    }
}

package DSA_DailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class JewelsANDStones {
	
	
	//https://leetcode.com/problems/jewels-and-stones/
	
	/*
	 * Problem undersatnding - Yes
	 * 
	 * input -- String jewel , String stone  ;  output - int cnt 
	 * 
	 * Solution -- Brute force Alt Sol - NO	 * 
	 * 
	 * TestData :I
	 * jewel  = "ASefg"   stone="ASefg"
	 * jewel  = "ASefg"   stone="AS"
	 * jewel  = "ASefg"   stone="abc"
	 * jewel  = "ASefg"   stone="ASefgASefg"
	 *  jewel  = "ASefg"   stone="ASefgaaaA"
	 * 
	 * PSUEDO CODE:
	 * 1.Declare a int var and intialize it , say cnt =0
	 * 2.if stone.lenght()==0 return cnt 
	 * 3.Iterate thru for loop till i < stone.lenght()
	 *  --> Iterate thru for loop till j < jewel.lenght()
	 *      --> if (stone.charAt(i) == jewel.charAT(j))
	 *          --> {cnt = cnt +1 ; break ;} 
	 * 
	 * 4.return cnt 	
	 * 
	 *  //O[N] + O[N]
	 */

	
	 public int numJewelsInStones(String jewels, String stones) {
		 int cnt=0;
		  if(stones.length()==0 ) return cnt;
		  
		  for (int i = 0; i < stones.length(); i++) {  
			   for (int j = 0; j < jewels.length(); j++) {
				   if(stones.charAt(i) == jewels.charAt(j))
				   {cnt = cnt+1; break; }					   
			}			
		}		  		  
		return cnt;
	        
	    }
	 
	 
	@Test
	public void Test1()
	{
		String jewels  = "ASefg";   String stones="ASefg";
		int numJewelsInStones = numJewelsInStones( jewels,  stones);
		System.out.println(numJewelsInStones);
		Assert.assertEquals(5, numJewelsInStones( jewels,  stones));		
	}
	 
	@Test
	public void Test2()
	{
		String jewels  = "ASefg";   String stones="AS";
		int numJewelsInStones = numJewelsInStones( jewels,  stones);
		System.out.println(numJewelsInStones);
		Assert.assertEquals(2, numJewelsInStones( jewels,  stones));		
	} 
	
	@Test
	public void Test3()
	{
		String jewels  = "ASefg";   String stones="abc";
		int numJewelsInStones = numJewelsInStones( jewels,  stones);
		System.out.println(numJewelsInStones);
		Assert.assertEquals(0, numJewelsInStones( jewels,  stones));		
	} 
	
	@Test
	public void Test4()
	{
		String jewels  = "ASefg";   String stones="ASefgASefg";
		int numJewelsInStones = numJewelsInStones( jewels,  stones);
		System.out.println(numJewelsInStones);
		Assert.assertEquals(10, numJewelsInStones( jewels,  stones));		
	} 
	
	@Test
	public void Test5()
	{
		String jewels  = "ASefg";   String stones="ASefgaaaA";
		int numJewelsInStones = numJewelsInStones( jewels,  stones);
		System.out.println(numJewelsInStones);
		Assert.assertEquals(6, numJewelsInStones( jewels,  stones));		
	} 
	 
}

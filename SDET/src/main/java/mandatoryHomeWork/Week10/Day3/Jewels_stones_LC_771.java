package mandatoryHomeWork.Week10.Day3;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Jewels_stones_LC_771 {
	
public int numJewelsInStones1(String jewels, String stones) {
        
	int count =0 ; 
	
	Set<Character> setStone = new HashSet<Character>();
	
     for (int i = 0; i < stones.length(); i++) {    	 
    	 setStone.add(stones.charAt(i));
         }
	
     for (int i = 0; i < jewels.length(); i++) {    	 
    	 if(setStone.contains(jewels.charAt(i))) count++;   		 
	     }
     
	return count;
    }
public int numJewelsInStones(String jewels, String stones) 
{
	
	int count =0 ; 
	Set<Character> setJewel = new HashSet<Character>();
	
	for (int i = 0; i < jewels.length(); i++) {
		setJewel.add(jewels.charAt(i)) ;
	   }
	
	for (int i = 0; i < stones.length(); i++) {
		if(setJewel.contains(stones.charAt(i))) count ++;
	   }
	
	return count ;
	
   }

@Test
public void Test1()
{
	String jewels = "aA",  stones = "aAAbbbb" ;	
	int numJewelsInStones = numJewelsInStones( jewels,  stones);
	System.out.println(numJewelsInStones);	
}

@Test
public void Test2()
{
	String jewels = "z",  stones = "ZZ" ;	
	int numJewelsInStones = numJewelsInStones( jewels,  stones);
	System.out.println(numJewelsInStones);	
}
}

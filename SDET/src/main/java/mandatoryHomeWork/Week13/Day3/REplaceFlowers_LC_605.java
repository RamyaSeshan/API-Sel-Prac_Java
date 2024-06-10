package mandatoryHomeWork.Week13.Day3;

import org.junit.Test;

public class REplaceFlowers_LC_605 {
	
	// https://leetcode.com/problems/can-place-flowers/description/
	
	/*
	 * Psuedo Code 
	 * iterate in while loop till index =1 less than array.lenght -1 
	 *  --> if flowerbed [i] ==0 , check if flowerbed [i-1] !==1 , then check i+1 < len flowerbed [i+1] !=1 , then reduce n by 1
	 *  finally return true if n==0 ; 
	 * 
	 */

	
	 public boolean canPlaceFlowers(int[] flowerbed, int n) { // takes 1ms 
		if(flowerbed .length ==1 && n==1 && flowerbed[0] == 0)  return true ;	
		if( n==0 )  return true ;	
		 
		 int len  = flowerbed.length - 1;  // 0,0,1,0,0
		 int index =0;
		 
		 while (index <= len) {
			
			 if(flowerbed [index] == 0)
			 {
				 if (index ==0 || flowerbed [index -1 ] ==0)
					 if(index ==len || index+1 <= len && flowerbed [index+1] ==0) 
					 { flowerbed [index] = 1;
						 n--; 
						 if (n ==0 ) return true ;} 
			 }
			 index ++;
		 }		
		 return n==0;	        
	    }
	 
	 
	 @Test
	 public void Test7()
	 {
	 	int[] flowerbed = {0,0,0,0,0,1,0,0} ; int n = 0;   // 1,0,1,0,1,0,0
	 	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	 	System.out.println("Test 7 is    " +canPlaceFlowers);	
	 }	
	 
	 @Test
	 public void Test6()
	 {
	 	int[] flowerbed = {0,0,1,0,0} ; int n = 1;   // 1,0,1,0,1,0,0
	 	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	 	System.out.println("Test 6 is    " +canPlaceFlowers);	
	 }
	 
	 
	 @Test
	 public void Test5()
	 {
	 	int[] flowerbed = {1,0,0,0,1,0,0} ; int n = 2;   // 1,0,1,0,1,0,0
	 	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	 	System.out.println("Test 5 is    " +canPlaceFlowers);	
	 }

	 
@Test
public void Test1()
{
	int[] flowerbed = {1,0,0,0,1} ; int n = 1 ;
	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	System.out.println(canPlaceFlowers);	
}

@Test
public void Test2()
{
	int[] flowerbed = {1,0,0,0,1} ; int n = 2;
	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	System.out.println(canPlaceFlowers);	
}

@Test
public void Test3()
{
	int[] flowerbed = {1,0,0,0,0,1} ; int n = 2;  
	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	System.out.println(canPlaceFlowers);	
}


@Test
public void Test4()
{
	int[] flowerbed = {0,0,1,0,1} ; int n = 1;  
	boolean canPlaceFlowers = canPlaceFlowers( flowerbed,  n );
	System.out.println(canPlaceFlowers);	
}






}

package DSA_DailyConnect;

import org.junit.Test;

public class LeetCodeBank_LC_1716 {
	
	// https://leetcode.com/problems/calculate-money-in-leetcode-bank/?envType=daily-question&envId=2023-12-06
	
	/*
	 * Psuedo Code  Time Complexity O[N] ; Space complexity -- O[1]
	 * 
	 *  have a start var int start ==1 , sum = start 
	 *  
	 *  iterate in for loop where i = 2, i < = n , i++
	 *  	   
	 *    sum = sum + i 
	 *    if (i == n ) break 
	 *    else if (i = i%7 ) start = start +1 
	 *    
	 *  retrun sum 
	 * 
	 */
	
	
	/*@Test
public void test1()
{
	int n =4;
	int totalMoney = totalMoney( n) ;
	System.out.println(totalMoney);
}

@Test
public void test2()
{
	int n =10;
	int totalMoney = totalMoney( n) ;
	System.out.println("This is from test 2 " +totalMoney);
} */

@Test
public void test3()
{
	int n =20;
	int totalMoney = totalMoney( n) ;
	System.out.println("This is from test 2 " +totalMoney);
} 

public int totalMoney(int n) { // took 1ms
	
	int intial = 1 , start = intial  , sum = 0 ; // 1+ 2+3 +4 
	
	for (int i = 0; i <n; i++) 
	{
		if (i != 0 &&  i %7 == 0 ) { intial = intial+1 ;start = intial ; sum = sum +start ;}
		else  {  sum = sum +start ;}  
		//System.out.println("Value of i" + i );
		//System.out.println("Value of sum " + sum );
		start ++;			
	}
	return sum ;
        
    }

}

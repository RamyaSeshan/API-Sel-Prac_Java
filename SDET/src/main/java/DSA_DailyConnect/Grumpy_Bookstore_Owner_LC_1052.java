package DSA_DailyConnect;

import java.util.Arrays;

import org.junit.Test;

 // https://leetcode.com/problems/grumpy-bookstore-owner/submissions/1061324185/
/*  DSA Daily connect -- 27 Sep 2023 
 * 
==================
PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] customers, int[] grumpy, int minutes

2.Frame Test data (valid, invalid, complex and edge cases)

Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3

Input: customers = [1], grumpy = [0], minutes = 1
Output: 1



3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)    

// Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3

int tempSum =0  , maxValue = Integer.Min , startindex , endIndex , result
1.Check len of customers , if its 1 , return customers[0]
2.Iterate thru for loop from i=0 , i <= customers.len -minutes  ; i++
    a.index = i
    b.-->Iterate thur while loop while index <  i+minutes 
         tempSum = tempSum + customers[index ]
      --> maxValue < tempSum , then startindex =i , endIndex = i+minutes -1
      --> set tempSum to zero
      
3.change grumpy[startindex] = 1  and grumpy[endIndex] = 1 
4.iterate thru for loop till i less than customers.len
    --> check if grumpy[i] == 1 , then result = result + customers[i]
5.return result



7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

=============

 */
public class Grumpy_Bookstore_Owner_LC_1052 {
	
	 public int maxSatisfied1(int[] customers, int[] grumpy, int minutes) {
	        int result = 0 ;
	        int tempSum =0 , maxValue =Integer.MIN_VALUE , startindex = 0 , endIndex = 0 , index ;
	        
	        if(customers.length ==1 ) return customers[0];
	        
	        for (int i = 0; i <= customers.length - minutes; i++) 
	        {
	        	index = i;	        	
	        	while (index < i + minutes )
	        	   {
	        		tempSum = tempSum + customers[index] ; 	        		
	        		index++;
	        	 	}	        
	        	if(maxValue < tempSum) { startindex =i ; endIndex = i+ minutes-1;}	        		
	        	tempSum =0;	        	
			}	        
	     
	        for (int j = startindex; j <= endIndex ; j++) { grumpy[j] =0 ; }				   
	        
	        for (int i = 0; i < customers.length; i++) 
	        {	        	
	        	if(grumpy[i] == 0)	        	
	        	{ result = result + customers [i] ;	}				
			}
	        
	        return result ; 
	    }

	 public int maxSatisfied2(int[] customers, int[] grumpy, int minutes) {
		 if(customers.length ==1 ) return customers[0];
		 
		 int result = 0 , sum  =0 ;  int temp = 0 ;
		 int  P1 =0 , P2 ;	

		for (int i = 0; i < customers.length; i++) 
		  {
			if(grumpy[i] == 0 )
				sum = sum + customers[i];
		   } 	
		 
		for (int i = 0; i <= customers.length - minutes ; i++) 
		{
			P1 =i ; P2 = P1+minutes -1  ;
			temp =sum;
			while (P1 <= P2 )
			{			
				if(grumpy[P1] == 1)
				{temp = temp + customers[P1] ; 		
				}
				P1++;
			}		
			result =Math.max(result, temp) ;
		}	
		 return result; 
	 }
	 
	
	 /*
	  * Psuedo Code 
	  * iterate thru the for lopp till customers lenght and sum up all customers whose grumpy is 0 , mark i as satisfiedSum
	  * iterate thur while loop from pointer =0 to less than minutes 
	  *    if grumpy is 1 , add it to intervalSum
	  * iterate thur while loop till pointer less than customers lenght
	  *   find max value btn intervalSum and satisfiedSum
	  *   if grumpy at pointer position is 1 , add to intervalSum
	  *   if grumpy at [pointer - minutes ] position is 1 , sub from intervalSum
	  *   
	  *   finaly fins the max of intervalSum, max
	  *   return satisfiedSum + max
	  */
	 public int maxSatisfied(int[] customers, int[] grumpy, int minutes)
	 {
		 
		 if(customers.length ==1 ) return customers[0];		 
		 int  satisfiedSum =0 , pointer =0 , intervalSum =0 , max = Integer.MIN_VALUE;
		 
		 for (int i = 0; i < customers.length; i++) 
		  {
			if(grumpy[i] == 0 ) {satisfiedSum = satisfiedSum + customers[i]; }
		  }	 
	
		 while (pointer < minutes)
			 {
			 if ( grumpy[pointer] ==1 )	
			   { intervalSum  += customers[pointer] ;}
			   pointer++;
			   }		
	
		 while (pointer < customers.length )
		 {
			 max = Math.max(intervalSum, max) ; 
			 if ( grumpy[pointer] ==1 )	 { intervalSum += customers[pointer]; } 
			 if ( grumpy[pointer - minutes] ==1)	{intervalSum = intervalSum - customers[pointer -minutes] ;}
			 pointer ++;			 
		 }	
		 max = Math.max(intervalSum, max) ;
		 return satisfiedSum +max; 
	 }
	  

	 
@Test
public void Test1()
{
	int[] customers = {1,0,1,2,1,1,7,5 }, grumpy = {0,1,0,1,0,1,0,1} ;
	int minutes = 3 ;
	int maxSatisfied = maxSatisfied(customers,  grumpy,  minutes) ;
	System.out.println(maxSatisfied);	
}

@Test
public void Test2()
{
	int[] customers = {1}, grumpy = {0} ;
	int minutes = 1 ;
	int maxSatisfied = maxSatisfied(customers,  grumpy,  minutes) ;
	System.out.println(maxSatisfied);	
} 

@Test
public void Test3()
{
	int[] customers = {3,7}, grumpy = {0,0} ;
	int minutes = 2 ;
	int maxSatisfied = maxSatisfied(customers,  grumpy,  minutes) ;
	System.out.println(maxSatisfied);	
}

@Test
public void Test4()
{
	int[] customers = {4,10,10}, grumpy = {1,1,0} ;
	int minutes = 2 ;
	int maxSatisfied = maxSatisfied(customers,  grumpy,  minutes) ;
	System.out.println(maxSatisfied);	
} 

}

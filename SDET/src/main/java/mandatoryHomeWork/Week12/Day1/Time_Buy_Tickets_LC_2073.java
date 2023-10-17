package mandatoryHomeWork.Week12.Day1;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

// https://leetcode.com/problems/time-needed-to-buy-tickets/  took 11 ms

// Time Complexity O[2N]  ; Space Complexity -- O[N]

/*
 * Psuedo Code
 * a.Iterate thur Tickets and add all values to a Queue 
 * b.Now, Iterate till size of queue > 0
 *    b.1 inside while loop , iterate in for loop till less than Queue size 
 *     --> poll the element from queue
 *     --> decrement the ele value by 1 
 *     --> check if the value of ele is >=0 , in such case increment the second by 1
 *     --> check if value ==0 and the iterator index ==k , if so , return the second . Othewise add the element to Queue
 *     
 */
public class Time_Buy_Tickets_LC_2073 {
	
	 public int timeRequiredToBuy(int[] tickets, int k) {
		
		 Queue<Integer>  queue = new LinkedList<Integer>() ; 
		 int timeCount = 0  , value ;
		 
		 for (int i = 0; i < tickets.length; i++) {			 
			 queue.add(tickets[i]) ;
		  }
		 
		 while (queue.size() > 0)
		 {			 
			 for (int i = 0; i < queue.size(); i++) 
			 { 
				 value = queue.poll() ;
				 value -- ;
				 
				 if(value >= 0 ) { timeCount ++ ;}
				 if(value == 0 && i==k)
				 {
					 return timeCount ;
				 }else 
				 {
					 queue.add(value) ;
				 }				
			 }			
		 }		 
		 return timeCount;	        
	    }

	 
@Test
public void Test1()
{
	//int[] tickets = {5,1,1,1} ; int k = 0 ;
	int[] tickets = {2,3,2} ; int k = 2 ;
	int timeRequiredToBuy = timeRequiredToBuy(tickets,  k) ;
	System.out.println(timeRequiredToBuy);	
	
}

@Test
public void Test2()
{
     int[] tickets = {5,1,1,1} ; int k = 0 ;	
	int timeRequiredToBuy = timeRequiredToBuy(tickets,  k) ;
	System.out.println(timeRequiredToBuy);	
	
}

}

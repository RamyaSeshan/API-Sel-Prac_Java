package mandatoryHomeWork.Week13.Day1;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

public class Sort_List_LC_148 {
	
	// Note : Inserion sort if O[N2] and merge sort for  is O[nlogN]
	/*
	 * Mergr sort 
	 * 1. divie inot 2
	 * sort first half and second half
	 * merge both sorted list 
	 */
			
	/*
	 * Please find the homework for tomorrow 23/10/2023. 
     https://leetcode.com/problems/sort-list/
	 */
	
	    public ListNode sortList(ListNode head) {
			
	    	ListNode curr = head ;
	    	ListNode it = curr.next ;	    			
	    	ListNode prev =curr ;
	    	ListNode dummy = new  ListNode(Integer.MIN_VALUE) ;	    	
	    	dummy.next = head ;
	    	//ListNode p1 ,p2 = null;
	    	
	    	while (curr != null)   // 4,2,1,3
	    	{	    	
	    	 while (it != null )
	    		{
	    		 if(curr.val <= it.val)  {  prev = it ; it = it.next ;  } 
	    	     else if (curr.val > it.val) 
	    	     {
	    	    	 if (curr == head )
	    	    	 {  curr.next = it.next  ; it.next = curr ; dummy.next =it ; curr =it ; it = curr.next.next ;  prev = curr.next  ;
	    	    	
	    	    	 }
	    	    	 else
	    	    	 { prev.next = curr ;curr.next = it.next ;dummy.next = it ; it.next = dummy.next.next;   }
	    	    }	    	
	    	} 
	    	 System.out.println("Current value is ..... " +curr.val);	
	    	 System.out.println("It value is ..... " +it.val);
	    	 
	    	 curr = curr.next ;
	    	 it = curr.next ;
	    	 dummy = dummy.next ;
	    	}
	    	return head;	        
	    }
	    		
	    
	    
		 @Test
		 public void test1(){
		     ListNode head= new SinglyLinkedList().add(new int[]{4,2,0}); // 1,1,2,3,4  
		  ListNode sortList = sortList( head) ;   
		      String a = new SinglyLinkedList().print(sortList);
		      System.out.println(a);	   
		       // Assert.assertEquals("[4,3,2,1,]", a);
		 }
		 
}
	


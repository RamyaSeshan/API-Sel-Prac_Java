package mandatoryHomeWork.Week13.Day4;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

public class Insertion_Sort_List_LC_147 {
	
	  // https://leetcode.com/problems/insertion-sort-list/
	
	/*
	 * Psuedo code 
	 * 
	 * declare ListNode temp , dummynode [ whic has val if of int.Min ] , dummynode.next = head ,toInsert , itInsert , currNode = head 
	 * 
	 * check if head =null or head.next ==null , then return head 
	 * 
	 * iterate thur while loop where currNode != null and currNode.next !=null
	 * 
	 *    --> if currNode.next.val < = currNode.val , then currNode = currNode.next
	 *    -- else 
	 *      --> toInsert = currNode.next  , itInsert = dummynode.next
	 *      Iterate thur while with condition (itInsert != toInsert)
	 *         -- if ( itInsert.val < = toInsert .val ) the itInsert = itInsert.next
	 *         else 
	 *           -- > currNode.next=  toInsert.next
	 *                temp =  itInsert
	 *                itInsert = toInsert
	 *                
	 */

	 public ListNode insertionSortList(ListNode head) {
		
		 if(head == null || head.next == null ) return head ;
		 
		 ListNode currNode = head ;	 
	    ListNode dummyNode = new ListNode(Integer.MIN_VALUE) ;
		 dummyNode.next = head ; 
		 ListNode preNode ;
		 ListNode toInsert;
		 
		 while (currNode != null && currNode.next !=null )
		 {
			 if(currNode.val <= currNode.next.val )
			  {
				  currNode = currNode.next ;
			  }
			  else 
			  {			  
				   preNode = dummyNode;
				   toInsert = currNode.next;
				  
				 while (preNode.next.val < toInsert.val) 
				 {
					 preNode= preNode.next ;
				 }
				 currNode.next = toInsert.next ;
				 toInsert.next =  preNode.next;
				 preNode.next = toInsert ;			 
			  }
		 }
				
		 return dummyNode.next;	
}
	 
	 @Test
	 public void test1(){
	     ListNode head= new SinglyLinkedList().add(new int[]{4,2,1,3}); // 1,1,2,3,4  
	  ListNode insertionSortList = insertionSortList( head) ;   
	      String a = new SinglyLinkedList().print(insertionSortList);
	      System.out.println(a);	   
	       // Assert.assertEquals("[4,3,2,1,]", a);
	 }
	 
	 @Test
	 public void test2(){
	     ListNode head= new SinglyLinkedList().add(new int[]{-1,5,3,4,0}); // 1,1,2,3,4  
	  ListNode insertionSortList = insertionSortList( head) ;   
	      String a = new SinglyLinkedList().print(insertionSortList);
	      System.out.println(a);	   
	       // Assert.assertEquals("[4,3,2,1,]", a);
	 }	 
	 
}

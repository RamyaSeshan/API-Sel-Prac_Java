package mandatoryHomeWork.Week12.Day3;

import java.util.Iterator;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

public class ReOrderList_LC_143 {

	// https://leetcode.com/problems/reorder-list/
	
	/*
	 * Psuedo Code 
	 * 
	 *  
	 * 
	 */
	
	
public ListNode reorderList(ListNode head) {
	
	ListNode currentNode , tail =null ;
	ListNode tempNode;
	ListNode tempTail;
	int index =0 , currentIndex =0;
	
	currentNode = head ;	
	
	while (currentNode != null)
	{
		tail = currentNode ;
		currentNode= currentNode.next;
		index ++;	}
	System.out.println("index is  " +index );	
	System.out.println("tail val   " +tail.val );
	
	
	currentNode = head ;
	System.out.println("currentNode val   " +currentNode.val );	
	
	while ( currentIndex != index - 1 )
	{
		tempNode = currentNode.next ;
		tempTail =tail;
	   tail.previous = tail;
		currentNode.next =tempTail ;
		tempTail.next = tempNode;
		tempNode = currentNode;
		currentIndex = currentIndex +2;
		//System.out.println(currentIndex);
	}
	return head;    	
	
   }



@Test
public void test1(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,2,3,4,5}); // 1,1,2,3,4  
    ListNode reorderList = reorderList(head) ;
   
 String a = new SinglyLinkedList().print(reorderList);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}





}

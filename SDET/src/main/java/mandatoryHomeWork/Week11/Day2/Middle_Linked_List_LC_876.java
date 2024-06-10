package mandatoryHomeWork.Week11.Day2;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

//https://leetcode.com/problems/middle-of-the-linked-list/

 /*
  * Psueod Code 
  * intialize currentIndex ==0 
  * if list size is 1 , return list 
  * divide  the size of given list  by 2 , take it as index 
  * iterate in while loop till currentIndex!= index 
  *   --> head = head.next  and increment currentIndex
  * return head 
  * 
  * 
  */

public class Middle_Linked_List_LC_876 {
	
	
public ListNode middleNode(ListNode head) {
	
	  int index =0 , size ,middleIndex , currentIndex =0 ;
	  ListNode currentNode = head ; 
	  while (currentNode != null )
	  {
		  currentNode = currentNode.next ;
		  index ++;
	  }
	
	  size = index ;	
	  middleIndex = size/2 ;
	
	 while (currentIndex != middleIndex)
	 {
		 head = head.next ;
		 currentIndex++ ;		 
	 }	
	return head;
        
    }

@Test
public void test1(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,2,3,4,5}); // 1,1,2,3,4
  
 ListNode middleNode = middleNode( head) ;
   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}

@Test
public void test2(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,2,3,4,5,6}); // 1,1,2,3,4
  
 ListNode middleNode = middleNode( head) ;
   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}
}

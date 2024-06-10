package DSA_LinkedList;

import org.junit.Test;

//https://leetcode.com/problems/remove-linked-list-elements/ 
/*
 * PSUEDO CODE
 * currentNode = head , previousNode = null;
 * 
 * while (currentNode != null )
 * {
 *   if (currentNode.val != val )
 *   
 *   previousNode = currentNode;
 *   currentNode = currentNode.next ;
 *   
 *   else  
 *   {
 *    if (currentNode == head )  { head = head.next   ;}
 *    else if (currentNode == tail ) 
 *    {  tail = previousNode  ; 
 *       previousNode.next = null;    
 *    }else 
 *    {
 *       previousNode.next  =  currentNode.next;   
 *       currentNode = currentNode.next;
 *     } 
 *      size --;
 * }
 * 
 * }
 * 
 */

public class Remove_Linked_List_LC_203 {

		 public ListNode removeElements(ListNode head, int val) {
		
			 ListNode currentNode = head , previousNode = null;
			 while (currentNode != null )
				  {
				  if (currentNode.val != val ) 	{ previousNode = currentNode;currentNode = currentNode.next ; }
				  
			      else  
				   {
				    if (currentNode == head )  { head = head.next   ;}
				    else if (currentNode.next == null ) 
				    {  currentNode = previousNode  ; 
				        previousNode.next = null;    
			        }else 
				  	previousNode.next  =  currentNode.next;   
			        currentNode = currentNode.next;
			     } 		       
			     }	
		 return head;	        
	    }

		 
@Test
		    public void test1(){
		        ListNode head = new SinglyLinkedList().add(new int[]{1,2,6,3,4,5,6});
		        int val = 6;
		         ListNode removeElements = removeElements( head,  val);
		       
		         String a = new SinglyLinkedList().print(removeElements);
		         System.out.println(a);	   
		          // Assert.assertEquals("[4,3,2,1,]", a);
		    }

@Test
public void test2(){
    ListNode head = new SinglyLinkedList().add(new int[]{});
    int val = 1;
     ListNode removeElements = removeElements( head,  val);
   
     String a = new SinglyLinkedList().print(removeElements);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}

@Test
public void test3(){
    ListNode head = new SinglyLinkedList().add(new int[]{7,7,7,7});
    int val = 7;
     ListNode removeElements = removeElements( head,  val);
   
     String a = new SinglyLinkedList().print(removeElements);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}


   }



package mandatoryHomeWork.Week11.Day4;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

public class Intersection_2_LInkedList_LC_160 {
	
	//https://leetcode.com/problems/intersection-of-two-linked-lists/
	
	/*
	 * PSUEDO COde
	 * declare 2 node tempA == headA , tempB == headB
	 * find the size of both the list 
	 * take the abs diffrence of both the linked List size
	 * check if size of List A > size of List B 
	 *   -- > then , while diff >0 , move LIstA temp head Node and mark it as currentNode , decrement diff 
	 *   --> otherwise while diff >0 , move LIstB temp head Node and mark it as currentNode , decrement diff 
	 * now iterate till tempA!=null and tempb !=null
	 *    --> check if tempA = tempB  , return temp A
	 *    -- > else tempA =tempA.next  , tempA = tempB.next 
	 *  if tempA = null , return null OR if tempB =null , return null
	 */
	
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {		
		 ListNode tempA = headA;
		 ListNode tempB = headB;		 
		 int SizeA = 0 , sizeB = 0 , variance ;
		 
		 while (tempA != null) 
		 {
			 tempA = tempA.next ;
			 SizeA ++;
		 }
		 System.out.println("SizeA is   "+ SizeA);
		 
		 while (tempB != null) 
		 {
			 tempB=  tempB.next ;
			 sizeB ++;
		 }
		 
		 System.out.println("SizeB is   "+ sizeB);
		 
		 variance = Math.abs(SizeA - sizeB) ; //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
		 System.out.println("variance is   "+ variance);
		 
		  tempA = headA;
		  tempB = headB;
		 
		 if(SizeA > sizeB)
		 {
			 while(variance > 0)
			 {	 tempA = tempA.next ; variance --;  }	 
		 }
		 else 
		 {
			 while(variance > 0)
			 {	 tempB = tempB.next ; variance --;  }
		 }
		 
		 System.out.println("tempA value is   "+ tempA.val);
		 System.out.println("tempB value  is   "+ tempB.val);
		 System.out.println("tempA address is   "+ tempA);
		 System.out.println("tempB address  is   "+ tempB);
		 
		 while (tempA != tempB)
		 {
			 tempA = tempA.next ; 
			 tempB = tempB.next ;
			 
			 if (tempB == null ||  tempA == null  ) return null;
			 
		 }
		 return headA;	        
	    }
	 
	 
@Test
public void Test1()
{
	 ListNode headA= new SinglyLinkedList().add(new int[]{4,1,8,4,5}); 
	 ListNode headB= new SinglyLinkedList().add(new int[]{5,6,1,8,4,5}); 
	 ListNode reorderList = getIntersectionNode(headA ,headB) ;
	    System.out.println(reorderList);
	   
	 String a = new SinglyLinkedList().print(reorderList);
	     System.out.println(a);	   
	      // Assert.assertEquals("[4,3,2,1,]", a);
}
	 

}

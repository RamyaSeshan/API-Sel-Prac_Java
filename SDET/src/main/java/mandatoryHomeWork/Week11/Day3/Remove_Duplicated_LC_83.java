package mandatoryHomeWork.Week11.Day3;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

public class Remove_Duplicated_LC_83 {
	
	 // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	// Time Complexity -- O[N] , Space Complexity -- O[N]
	
public ListNode deleteDuplicates(ListNode head) {
	 
	if(head == null || head.next == null ) return head ;
	ListNode currentNode = head ;
	
	while(currentNode != null && currentNode.next != null)  // 1,1,2,3
	{
		if (currentNode.val == currentNode.next.val)
		{
			currentNode.next = currentNode.next.next ;
			//currentNode = currentNode.next  ;	
			//System.out.println(currentNode.val);
		}
		else 
		{
			currentNode = currentNode.next  ;
		}
	}	
	return head;        
    }


@Test
public void test1(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,1,2,3}); // 1,1,2,3,4  
 ListNode middleNode = deleteDuplicates( head) ;   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}


@Test
public void test2(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,1,2}); // 1,1,2,3,4  
 ListNode middleNode = deleteDuplicates( head) ;   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}

@Test
public void test3(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,1,2,3,3}); // 1,1,2,3,4  
 ListNode middleNode = deleteDuplicates( head) ;   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}

@Test
public void test4(){
    ListNode head= new SinglyLinkedList().add(new int[]{1,1,1}); // 1,1,2,3,4  
 ListNode middleNode = deleteDuplicates( head) ;   
     String a = new SinglyLinkedList().print(middleNode);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}



}

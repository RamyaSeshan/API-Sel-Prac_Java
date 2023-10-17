package mandatoryHomeWork.Week11.Day2;

import org.junit.Test;

import mandatoryHomeWork.Week11.Day1.ListNode;
import mandatoryHomeWork.Week11.Day1.SinglyLinkedList;

// https://leetcode.com/problems/merge-two-sorted-lists/

/*
 * Psuedo code 
 * 
 * create a currentNode , assign to null currentNode == null
 * iterate till list1 and list 2 not equal to NULL
 *   check if list1.val <= list2.val then , currentNode = list1 , list1 = list1.next 
 *   otherwise  currentNode = list2 , list2 = list2.next 
 *check if  list1 == null ,then currentNode = list2  , list2 = list2.next 
 *otherwise check if list2 == null  then currentNode = list1  , list1 = list1.next 
 * 
 */


	
public class Merge_Sorted_List_LC_21 {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	
	ListNode head = new ListNode(0);
	ListNode currentNode = head ;
	
	while (list1 != null &&  list2!=null)
	{
		if (list1.val <= list2.val)
		{
			currentNode.next= list1;
			list1 = list1.next ;
		}else 
		{
			currentNode.next= list2;
			list2 = list2.next ;}
		
		currentNode = currentNode.next ;
	}
	
	if(list1 != null) 
	{
		currentNode.next= list1;
		}
	
	if(list2 != null) 
	{
		currentNode.next= list2;
	}
		
	return head.next;
        
    }


@Test
public void test1(){
    ListNode list1 = new SinglyLinkedList().add(new int[]{1,2,4}); // 1,1,2,3,4
    ListNode list2 = new SinglyLinkedList().add(new int[]{1,3,4});
  
    ListNode mergeTwoLists = mergeTwoLists( list1,  list2) ;
   
     String a = new SinglyLinkedList().print(mergeTwoLists);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}


@Test
public void test2(){
    ListNode list1 = new SinglyLinkedList().add(new int[]{}); // 1,1,2,3,4
    ListNode list2 = new SinglyLinkedList().add(new int[]{});
  
    ListNode mergeTwoLists = mergeTwoLists( list1,  list2) ;
   
     String a = new SinglyLinkedList().print(mergeTwoLists);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}


@Test
public void test3(){
    ListNode list1 = new SinglyLinkedList().add(new int[]{}); // 1,1,2,3,4
    ListNode list2 = new SinglyLinkedList().add(new int[]{0});
  
    ListNode mergeTwoLists = mergeTwoLists( list1,  list2) ;
   
     String a = new SinglyLinkedList().print(mergeTwoLists);
     System.out.println(a);	   
      // Assert.assertEquals("[4,3,2,1,]", a);
}
}

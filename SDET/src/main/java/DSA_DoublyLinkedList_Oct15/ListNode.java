package DSA_DoublyLinkedList_Oct15;

public class ListNode {
	
	int val;
	ListNode previous;
	ListNode next ;
	
	
	public ListNode(int val)
	{
		this.val = val ;
		this.next = null ;
		this .previous = null ;
	}

	
	public ListNode(int val ,ListNode next , ListNode previous)
	{
		this.val = val ;
		this.next = next ;
		this .previous = previous ;
	}


	
	
	
	
}

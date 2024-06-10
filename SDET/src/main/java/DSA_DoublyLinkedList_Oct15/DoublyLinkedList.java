package DSA_DoublyLinkedList_Oct15;

public class DoublyLinkedList {
	
	ListNode head , tail ;
	private int size ;
	
	public void addLast(int value)
	{
		/*if (head == null )
		{
			head = tail = new ListNode(value);
		}else */
		
			 ListNode currentNode = tail ;
			while (currentNode!= null )
			{
			tail.next =  new ListNode(value) ;
			tail = tail.next ;
			tail.previous = currentNode ;
			}
					
		size ++ ; 
	}
	
	
public void addFirst(int value )	
{

	if (head == null )
	{
		head = tail = new ListNode(value);
	}else 
	{
		 ListNode currentNode = head ;
		 
		 head.previous = new ListNode(value);
		 head =  head.previous ;
		 head.next = currentNode ;		 
	}
	
	size ++ ;	
}



public void removeFirst()
{
	ListNode currentNode = head ;
	while (head != null)
	{
	   head = head.next ;	
	   head.previous = null ;
	}		
	size --;
}


public void removeLast()
{
	ListNode currentNode = tail ;
	while (tail != null)
	{
	   tail = tail.previous ;
	   tail.next = null ;
	}		
	size --;
}



}

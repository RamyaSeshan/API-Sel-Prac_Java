package DSA_LinkedList_Practise;

import org.junit.Test;

public class SinglyLinkedList {
	
	ListNode head , tail;
	private int size;
	
	public void add(int value)
	{
		/*
		 * if head == null , then head = tail = new  ListNode(val)
		 * else 
		 * tail.next = new  ListNode(val)
		 * tail = tail.next
		 */
		if(head == null) { head = tail = new ListNode(value); } 
		else 
		{
		tail.next = new ListNode(value);
		tail = tail.next ;
		}
		size ++;
	}
	
   public void add_P(int value)
   {
	   if (head == null)
	   {
		   head = tail = new ListNode(value);
	   }else 
	   {
		   tail.next = new ListNode(value) ;
		   tail = tail.next;
	   }
	  size ++;   
   }

	public ListNode add(int[] value)
	{
		for (int i : value) { add(i) ;	}				
		return head;
	}
	
   public ListNode add_prac(int[] A)
   {
	   for (int i : A) { add(i); }
	  return head;
   }

	
public void addAll(SinglyLinkedList list , int index )
{
	if (index > size) throw new IndexOutOfBoundsException() ;
	else if (index == size ) 	{ tail.next = list.head ; 	}
	else if (index ==0 )
	{
		list.tail= head ;  // list.tail.next = head 
		head = list.head;
	}else 
	{
		int currentIndex = 0;
		ListNode currentNode = head ;
		
		while(++currentIndex != index)
		{	currentNode  = currentNode.next ; }
		
		 list.tail.next = currentNode.next;
		currentNode.next = list.head ;
	}
	
	size += list.size ;
}


public void addAll_p(SinglyLinkedList list , int index )
{
	if(index > size )  throw new IndexOutOfBoundsException();
	else if (index == size ) { tail.next = list.head ;   }
	else if (index ==0 )  
	{ list.tail = head ;
	  head = list.head ;
	} else 
	{
		ListNode currentNode = head ;
		int currentIndex = 0;
		
		while ( currentNode != null)
		{
			if( currentIndex++ == index) 
			{ list.head= currentNode  ; 
			currentNode= list.tail ;
			}			
			currentNode   = currentNode.next     ;			
		} 
		
	}
	 size += list.size ;
}
	  

	
public String print(ListNode node)
{
	StringBuffer sb = new StringBuffer("[") ;	
	while (node != null)
	{	sb.append(node.val).append(",") ;
		node = node.next;	}

	sb.append(']') ;
	return sb.toString();	
}

public int size() { return size ;}


public void remove(int index) 
{
	if(index > size) return ;
	if (index ==0 ) head = head.next;
	else
	{
		int currentIndex = 0;
		ListNode previousNode = head , currentNode = head ;
		
		while (currentNode != null)
		{
			if( currentIndex ++ == index) 
			{previousNode.next = currentNode.next; }			
			previousNode.next = currentNode ;
			currentNode = currentNode.next ;
		}	
    }
	
	size --;
}


public void remove_P(int index) 
{
	if ( index > size  ) return ;
	else if (index ==0 ) { head = head.next ;}
	else 
	{
		int currentIndex = 0;
		ListNode previousNode = head , currentNode = head ;
		
		while (currentNode != null)
		{
		if (++currentIndex != index ) { previousNode.next = currentNode ; currentNode = currentNode.next; }
		else 
		{
			previousNode.next = currentNode.next;
		}
		
	  }
	  }
   
}

@Test
public void Test1()
{
	SinglyLinkedList obj = new SinglyLinkedList();
	obj.add(20) ;
	ListNode add = obj.add(new int[] {1,2,3,4,5 }) ;
	
}

}

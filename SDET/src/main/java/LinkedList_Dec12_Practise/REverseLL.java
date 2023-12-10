package LinkedList_Dec12_Practise;

import org.junit.Test;

public class REverseLL {
		
	
	public Node addNode( int data )
	{return new Node(data) ;   }
	
	public void print(Node node)
	{	while (node != null)
		{	System.out.println(node.data);
			node = node.next ;	}
	}

	public int findFirstDuplicate(Node node )
	{
		Node head = node;
		
		while (head.next != null) 
		{
		 if (head.data == head.next.data) { return head.data ;}
		 head = head.next ;
		}
		
		return -1;		
	}
	
	
	public void removeFirstDuplicate(Node node )
	{
		Node head = node;
		
		while (head.next != null) 
		{
		 if (head.data == head.next.data) { head.next = head.next.next ;}
		 else  head = head.next ;
		}
		
		//return -1;		
	}
	
	
	
	
	
/*@Test
public void testAdd() {	
	Node head ;
    head = addNode(8) ;
   head.next = addNode(12) ;
   head.next.next = addNode(4) ;
   head.next.next.next= addNode(7) ;  
    print(head);
   }	

@Test
public void testDuplicate() {	
	Node head ;
    head = addNode(8) ;
   head.next = addNode(8) ;
   head.next.next = addNode(12) ;
   head.next.next.next= addNode(7) ;  
   int findFirstDuplicate = findFirstDuplicate(head ) ;
   System.out.println(findFirstDuplicate);
   } */

@Test
public void testRemoveDuplicate() {	
	Node head ;
    head = addNode(8) ;
   head.next = addNode(9) ;
   head.next.next = addNode(12) ;
   head.next.next.next= addNode(12) ;  
   int findFirstDuplicate = findFirstDuplicate(head ) ;
   removeFirstDuplicate( head ) ;
   print(head);
   }

	public class Node
	{
		public Node next ;
		public Node prev ;
		public int data ;
		public Node head  ;
		
		Node (int key)
		{
			this.data = key ;
			next = null ;
		}	
	
	}
	
	
}

package LinkedList_Dec12_Practise;

import org.junit.Test;

public class MiddleOfNode {

	class Node{

		Node prev;
		int data;
		Node next ;

		Node(int key)
		{ this.data = key ; 	}	

		Node()
		{ 	}	

	}

	public Node addNode(int data)
	{	  return new Node(data) ; }


	public void print(Node node)
	{	while   (node !=null) 
	{ System.out.println(node.data);
	node = node.next ;} }



	public int miidleNode(Node node)
	{
		Node head = node; if(head.next == null ) return head.data ;
		Node slow = head ; Node fast  = head ;

		while (fast !=null && fast.next != null )
		{
			slow = slow.next  ;
			fast = fast.next.next ;		
		}	
		//System.out.println(slow.data);
		return slow.data;
	}

	public Node mergeNode(Node odd , Node even)
	{
		Node headL = odd ;
		Node headR = even ;
		Node headM = new Node() ;
		Node merge = headM ;	

		while (headL != null && headR!=null) 
		{
			if(headL.data < headR.data)
			{   merge.next = headL ;
				headL = headL.next ;
			}else if(headL.data > headR.data)
			{
				merge.next = headR ;
				headR = headR.next ;
			}
			 merge = merge.next ;
		}
		
		if(headR!=null) { merge.next = headR ;}
		else  { merge.next = headL ; }

		return headM.next ;
	}

	@Test
	public void test1()
	{
		Node headL = addNode(1) ;
		headL.next = addNode(3) ;
		headL.next.next = addNode(5) ;
		//headL.next.next.next = addNode(7) ;
		//print(headL) ;	


		Node headR = addNode(2) ;
		headR.next = addNode(4) ;
		headR.next.next = addNode(6) ;
		headR.next.next.next = addNode(8) ;
		//print(headR) ;

		Node mergeNode = mergeNode(headL, headR ) ;
		print(mergeNode)  ;


	} 

	/*@Test
public void test1()
{
	Node head = addNode(10) ;
	head.next = addNode(20) ;
	head.next.next = addNode(30) ;
	head.next.next.next = addNode(40) ;
	print(head) ;	
} 


@Test
public void test2()
{
	Node head = addNode(100) ;
	head.next = addNode(200) ;
	head.next.next = addNode(300) ;
	head.next.next.next = addNode(400) ;
	head.next.next.next = addNode(500) ;
	//print(head) ; 
	int miidleNode = miidleNode(head );
  System.out.println(miidleNode);
}*/

}

package mandatoryHomeWork.Week11.Day2;

public class ListNode {
	
	 ListNode next;
	    int val;

	    ListNode() { }        
	    
	    
	    public ListNode(int value) {
	        this.val = value;
	        next = null;
	    }

	    //14 ,null
	    //20, node4
	    ListNode(int value, ListNode next) {
	        this.val = value;
	        this.next = next;
	    }

}

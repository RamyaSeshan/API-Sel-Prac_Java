package mandatoryHomeWork.Week11.Day1;

public class ListNode {
	
	 public ListNode next;
	    public int val;
		public ListNode previous;

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

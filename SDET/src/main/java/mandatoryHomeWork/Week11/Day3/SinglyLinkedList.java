	package mandatoryHomeWork.Week11.Day3;

public class SinglyLinkedList {


    ListNode head , tail;
    private int size = 0 ;

    /*

    11,43,28,11,90

    11 -> 43

    step1 : h & t -> 11
    step2:  11.next = 43 = tail
    step3:  43.next = 28 = tail   => head -> 11, tail -> 28



       11,43,28,11,90

       head -> 11
       tail -> 90
       size -> 5


       1. index = 0         => head = head.next  => 43
       2. index > size  (12)=> nothing will happen
       3. index < size  (2) => {
            expected o/p -> 11,43,11,90
            1. temp variable for index (currentIndex)
            2. variable for previous node
            3. loop till index == currentIndex    => previousNode => 43, currentNode => 28
                previousNode .next = currentNode.next; ( 43.next == 28.next)
       }
     */

    public void add(int value){
        if(head == null)  // we are trying to add the first element
            head = tail = new ListNode(value);
        else{
//          tail = tail.next = new Node(value);
            tail.next = new ListNode(value);  // 11 -> 43
            tail = tail.next;
        }
        size++;
    }

    public ListNode add(int[] value){
        for(int each : value) add(each);
        return head;
    }

    public void addAll(SinglyLinkedList list, int index){
        if(index > size) throw new IndexOutOfBoundsException();
        else if(index == size) tail.next = list.head;
        else if(index == 0){
            list.tail = head;
            head = list.head;
        }else {
            int currentIndex = 0;
            ListNode currentNode = head;

            while (++currentIndex != index)
                currentNode = currentNode.next;

            list.tail.next = currentNode.next;
            currentNode.next = list.head;
        }
        size += list.size;
    }

    public String print(ListNode node){
        StringBuffer buff = new StringBuffer("[");
        while(node != null){
            buff.append(node.val).append(",");
            node = node.next;
        }

        return buff.append(']').toString();
    }


    public int size(){
        return size;
    }

    public void remove(int index){
        if(size <= index) return;
        else if(index ==0) head = head.next;
        else {
            int currentIndex = 0;
            ListNode currentNode = head, previousNode = head;
            while (currentNode != null) {
                if (currentIndex++ == index){
                    previousNode.next = currentNode.next;
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        size--;
    }


    /*
    1. A temp node for the traversal, and previousNode as well
    2. iterate over the list
        if value matches, previousNode.next will be the currentNode.next
        else previousNode = currentNode & currentNode = currentNode.next
        Input  - 1,3,5,3,1
        Output - 1,5,1
     */
    public void removeAll(int value){
        ListNode currentNode = head, previousNode = null;

        while(currentNode != null){
            if(currentNode.val == value){
                if(previousNode == null) head = head.next;
                else if(currentNode.next == null) {
                    tail = previousNode;
                    previousNode.next = null;
                }
                else previousNode.next = currentNode.next;
                currentNode = currentNode.next;
                size--;
            }else{
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }

    }


    /*
       To insert a node to the list
       1. If the insert index is 0, add the new node to the head
       2. if the insert index is size, means add this as tail(last node)
       3. if in the middle, loop till the insert index, and also store its previous index as well
            after the loop, create a new node for the index, as
            previousNode.next as newly created node and set currentNode as the new node's next node
            PreviousNode -> CurrentNode
            PreviousNode -> NewlyCreatedNode -> CurrentNode
      */
    public void insert(int index, int value){
        if( index > size) throw new IndexOutOfBoundsException();
        else if(index == 0) head = new ListNode(value, head);
        else if(index == size) add(value);
        else{
            int currentIndex = 0;
            ListNode currentNode = head, previousNode = null;
            while(currentIndex != index){
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
            previousNode.next = new ListNode(value, currentNode);
        }
        size++;
    }


    /*
    1. loop through the list and collect the index if the value of the node and the expected value matches
    2. index will be replaced, if the multiple occurrence of the given value
     */
    public int lastIndexOf(int value){
        int index = -1, currentIndex = 0;
        ListNode currentNode = head;

        while (currentNode != null){
            if(currentNode.val == value) index = currentIndex;
            currentNode = currentNode.next;
            currentIndex++;
        }
        return index;
    }

    /*
    Loop the given node and create a new list from the same(same like add method, instead of adding to head and tail, we do with temp variables)
     */
    public ListNode clone(ListNode node){
        ListNode currentHead = null, currentTail = null;

        while(node != null){
            if(currentHead == null) currentHead = currentTail = new ListNode(node.val);
            else{
                currentTail.next = new ListNode(node.val);
                currentTail = currentTail.next;
            }
            node = node.next;
        }
        return currentHead;
    }

}

package GET2018.com.metacube.DSA.Assignment2.Part1;

public class LinkList<E>
{

    private LinkedListNode<E> head;
   
    public LinkList() {
    	head = null;
	}
    
    /**
     * Insert at the front of the list
     * @param node
     */
    public void insertAtFront(LinkedListNode<E> node) {    	
        node.setNext(head);
        head = node;
    }

    /**
     * Remove from the front of the list
     * @return node's value
     */
    public E removeFromFront(){
    	E value = head.getValue();
        if(head.getNext()!=null)
        {        	
        	head = head.getNext();
        } else {
        	head = null;
        }
        return value;
    }
    
    /**
     * Add to last of the list
     * @param node
     */
    public void addToLast(LinkedListNode<E> node){
    	
    	LinkedListNode<E> tempNode = head;
    	if(head == null) {
    		node.setNext(null);
    		head = node;
    	} else {
    		while(tempNode.getNext()!=null) {        	
            	tempNode = tempNode.getNext();
            }
    		tempNode.setNext(node);
    	}

    }
    
    /**
     * Remove from the last of the list
     * @return node's value
     */
    public E removeFromLast(){
    	
    	LinkedListNode<E> tempNode = head;
    	LinkedListNode<E> prevNode = tempNode;
    	
        while(tempNode.getNext()!=null)
        {        
        	prevNode = tempNode;
        	tempNode = tempNode.getNext();
        }
        
        prevNode.setNext(null);
        
    	return tempNode.getValue();
        
    }
    
    /**
     * @return value of node pointed by head.
     */
    public E showFront() {
    	return head.getValue();
    }
    
}

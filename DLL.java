public class DLL {
    Node head; // head of list
 
    /* Doubly Linked list Node*/
    class Node {
        int val;
        Node prev;
        Node next;
 
        Node(int d) { val = d; }
    }
 
    // Adding a node at the front of the list
    public void push(int val)
    {
        /* 1. allocate node
        * 2. put in the data */
        Node new_Node = new Node(val);
 
        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;
 
        if (head != null) 
            head.prev = new_Node;
            head = new_Node;
    }
    
    public void insertlast(int val) {
    	Node node = new Node(val);
    	Node last = head;
    	node.next = null;
    	
    	if (head == null) {
    		node.prev = null;
    		head = node;
    		return;
    	}
    	while(last.next != null) {
    		last = last.next;
    		
    	}
    	
    	last.next = node;
    	node.prev = last;
    	
    }
    
   
    
    public void printlist()
    {
        Node node = head;
//        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.val + " ");
            
            node = node.next;
        }
        System.out.println();

    }
 
    public static void main(String[] args)
    {

        DLL dll = new DLL();
      
        dll.push(7);
        dll.push(1);
        System.out.println("Created DLL is: ");
        dll.insertlast(99);
        dll.printlist();
       
    }
}
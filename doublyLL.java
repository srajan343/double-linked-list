import java.util.*;
class doublyLL {
	
	private Node head;
	
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		 Node(int d) { val = d; }
		//adding first element in linked list 
		public void insertfirst(int val) {
			
			Node node1 = new Node(val);
			node1.next = head;
			node1.prev = null;
			if(head != null) {
				head.prev = node1;
			}
			head = node1;
		}
		
		// to display the values 
		public void display() {
			Node node = head;
			while(node!=null) {
				System.out.print(node.val + "--->");
				node = node.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLL list = new doublyLL();
		list.insertfirst(3);

	}

}

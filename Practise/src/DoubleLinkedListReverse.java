
public class DoubleLinkedListReverse {
	
	static Node head;
	
	
	static class Node {
		Node preNode;
		Node nextNode;
		int data;
		
		Node(int d){
			data = d;
			preNode = null;
			nextNode = null;
		}
		
	}
	
	void push(int newData) {
		
		Node newNode = new Node(newData);
		
		newNode.preNode = null;
		newNode.nextNode = head;
		
		if (head != null) {
			head.preNode = newNode;
		}
		
		head = newNode;
	}
	
	void printList(Node node) {
		while(node != null) {
			System.out.println(node.data + " ");
			node = node.nextNode;
		}
	}
	
	void reverseList() {
		Node temp = null;
		Node current = head;
		
		while(current != null) {
			temp = current.preNode;
			current.preNode = current.nextNode;
			current.nextNode = temp;
			current = current.preNode;
		}
		
		if (temp != null) {
			head = temp.preNode;
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedListReverse doubleLinkedList = new DoubleLinkedListReverse();
		
		doubleLinkedList.push(5);
		doubleLinkedList.push(10);
		doubleLinkedList.push(55);
		
		doubleLinkedList.printList(head);
		
		doubleLinkedList.reverseList();
		doubleLinkedList.printList(head);
		
	}

}

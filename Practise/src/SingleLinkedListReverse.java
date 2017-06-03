
public class SingleLinkedListReverse {
	
	static Node head;
	
	static class Node {
		Node nextNode;
		int data;
		
		public Node(int newData) {
			data = newData;
			nextNode = null;
		}
	}
	
	public void printList(Node node) {
		System.out.println("\nPrint list");
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		newNode.nextNode = head;
		head = newNode;
	}
	
	void reverseList() {
		Node currentNode = head;
		Node nextNode = null;
		Node preNode= null;
		
		while(currentNode != null) {
			nextNode = currentNode.nextNode;
			currentNode.nextNode = preNode;
			preNode = currentNode;
			currentNode = nextNode;
		}
		
		head = preNode;
	}
	
	public static void main(String[] args) {
		
		SingleLinkedListReverse singleLinkedList = new SingleLinkedListReverse();
		singleLinkedList.push(10);
		singleLinkedList.push(20);
		singleLinkedList.push(40);
		singleLinkedList.push(50);
		
		singleLinkedList.printList(head);
		
		singleLinkedList.reverseList();
		
		singleLinkedList.printList(head);
		
	}

}

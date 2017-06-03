package lruCache;

public class DoublyLinkedList {
	
	private final int size;
	
	private int currSize;
	
	private Node head;
	
	private Node tail;
	
	
	public DoublyLinkedList(int size) {
		this.size = size;
		currSize = 0;
	}
	
	public void printList() {
		if (head == null) {
			return;
		}
		
		Node tmp  = head;
		while (tmp != null) {
			System.out.println(tmp.getPageNumber());
			tmp = tmp.getNext();
		}
	}
	
	public Node addPageToList(int pageNumber) {
		Node newNode = new Node(pageNumber);
		if (head == null) {
			head = newNode;
			tail = newNode;
			currSize = 1;
			return newNode;
		} else if (currSize < size) {
			currSize++;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);
		}
		
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		return newNode;
	}
	
	public void movePageToHead(Node pageNode) {
		if (pageNode == null || pageNode == head) {
			return;
		}
		
		if (pageNode == tail) {
			tail = pageNode.getPrev();
			tail.setNext(null);
		}
		
		Node prev = pageNode.getPrev();
		Node next = pageNode.getNext();
		prev.setNext(next);
		
		if(next != null) {
			next.setPrev(prev);
		}
		
		pageNode.setPrev(null);
		pageNode.setNext(head);
		head.setPrev(pageNode);
		head = pageNode;
	}
	
	public int getCurrSize() {
		return currSize;
	}


	public void setCurrSize(int currSize) {
		this.currSize = currSize;
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}


	public int getSize() {
		return size;
	}


	public class Node {
		
		private int pageNumber;
		
		private Node prev;
		
		private Node next;
		
		public Node(int pageNumber) {
			this.pageNumber = pageNumber;
		}
		
		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}

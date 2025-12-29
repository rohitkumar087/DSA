package LinkedList;

class Node{
	int data;
	Node next;
			
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList{
	Node head;
	Node tail;
	
	LinkedList(){
		head = null;
		tail= null;
	}
	
	void insert_last(int n) {
		Node newNode = new Node(n);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		
	}
	
	void insert_first(int n) {
		Node newNode = new Node(n);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	void delete_first() {
		if(head==null) {
			System.out.println("List is empty...");
			return;
		}
		head =head.next;
	}
	
	void delete_last() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		if(head == tail) {
			head = null;
			tail = null;
		}
		Node temp = head;
		while(temp.next != tail) {
			temp= temp.next;
		}
		temp.next = null;
		tail = temp;
	}
	
	void insert_middle(int k , int n) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		if(k>count && k<2) {
			System.out.println("Invalid to insert ....");
			return;
		}
		
		Node newNode = new Node(n);
		int i =2;
		Node prev = head;
		while(i<k) {
			i++;
			prev = prev.next;
		}
		
		Node next = prev.next;
		prev.next = newNode;
		newNode.next = next;
	}
	
	void delete_middle(int k) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		if(k<2 && k>=count) {
			System.out.println("Invalid deletion..");
			return ;
		}
		
		int i = 2;
		Node prev = head;
		while(i<k) {
			prev = prev.next;
			i++;
		}
		
		Node demo = prev.next;
		Node next = demo.next;
		prev.next = next;
	}
	
	void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
//		li.insert_last(10);
//		li.printList();
//		li.insert_first(5);
//		li.printList();
//		li.delete_first();
//		li.printList();
//		li.delete_first();
//		li.delete_first();
//		li.printList();
		
		li.insert_last(15);
		li.insert_last(25);
		li.insert_last(35);
		li.insert_last(45);
		li.printList();
		li.insert_middle(3, 44);
		System.out.println();
		
		li.printList();
		
		System.out.println();
	li.delete_middle(3);
		li.printList();
		
	}

}

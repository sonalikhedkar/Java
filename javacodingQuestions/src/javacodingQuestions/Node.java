package javacodingQuestions;

public class Node {
	int data;
	Node next;
	//default constructor
	public Node(){
		
	}
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	//function for beginning of circular linkedlist
	public static Node ToAdd(Node current,int data) {//takes node refrence and data as parameter
		Node ptr1 = new Node();//creating new node of linked list
		ptr1.data=data;
		ptr1.next=current;
		
		return current;
	}

}

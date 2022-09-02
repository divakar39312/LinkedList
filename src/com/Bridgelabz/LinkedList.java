package com.Bridgelabz;

//import com.Bridgelabz.LinkedListMain.Node;

public class LinkedList {

	Node head;   //creating node
	Node tail;

	/**
	 * 
	 * @param data
	 */
	public void add(int data) {
		/**
		 * checking whether linked List is empty or not 
		 * if empty creating new node(adding)
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		/**
		 * displaying the data(s) from node(s)
		 */
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	class Node {
		// initialize a variables
		public int data;
		public Node next;

		//  creating Constructors
		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {  //creating tostring method
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	
}

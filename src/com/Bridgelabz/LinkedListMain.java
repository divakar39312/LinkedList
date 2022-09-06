package com.Bridgelabz;

public class LinkedListMain {
	
	public static void main(String[] args) {
		// creating Object of LinkedList Class
		LinkedList list = new LinkedList();
		list.add(56); 				// Adding 56
		list.add(70); 				// Adding 70 then 56 -> 70
		list.insertInBetween(30); 	// Inserting 30 in between 56 and 70  
		list.display(); 			// 56 -> 30 -> 70
	}
}
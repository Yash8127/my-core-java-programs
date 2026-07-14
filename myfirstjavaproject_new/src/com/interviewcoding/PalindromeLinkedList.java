package com.interviewcoding;

import java.util.Stack;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class PalindromeLinkedList {

	public static boolean isPalindrome(Node head) {

		Stack<Integer> stack = new Stack<>();

		Node temp = head;

		// Push all elements into stack
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}

		// Compare with original list
		temp = head;

		while (temp != null) {

			if (temp.data != stack.pop()) {
				return false;
			}

			temp = temp.next;
		}

		return true;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);

		System.out.println(isPalindrome(head));
	}
}
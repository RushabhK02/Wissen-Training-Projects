package com.my.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
	private Node head;
	private Node tail;
	
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void add(E data) {
		Node newNode = new Node(data);
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.setNext(newNode);
			tail=newNode;
		}
	}

	public void add(int idx, E data) {
		Node node = head;
		int index=0;
		while(index<idx) {
			if(node.next==null) {
				break;
			}
			node=node.next;
			index++;
		}

		Node newNode = new Node(data, node.next);
		if(node.next==null) {
			tail=newNode;
		}
		node.next=newNode;
	}

	public E get(int idx) {
		Node node = head;
		int index=0;
		while(index<idx) {
			if(node==null) {
				return null;
			}
			node=node.next;
			index++;
		}
		return node.next.data;
	}

	public boolean remove(int idx) {
		Node node = head;
		int index=0;
		while(index<idx) {
			if(node==null) {
				return false;
			}
			node=node.next;
			index++;
		}
		if(node.next==null) {
			return true;
		}
		else {
			node.next=node.next.next;		
			return true;
			}
	}

	public void reverse() {
		Node prev = null;
	    Node current = head;
	    Node next = null;
	    while(current != null){
	        next = current.getNext();
	        current.setNext(prev);
	        prev = current;
	        current = next;
	    }
	    head = prev;
	    
	    current=head;
	    while(current.next!=null) {
	    	current=current.next;
	    }
	    tail=current;
	   
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			
			private Node currentNode=head;
			
			@Override
			public boolean hasNext() {
				if(currentNode==null)
					return false;
				return true;
			}

			@Override
			public E next() {				
				E current = currentNode.data;
				currentNode= currentNode.next;
				return current;
			}
		};
	}

	private class Node {
		private E data;
		private Node next;

		public Node(E data) {
			super();
			this.data = data;
		}

		public Node(E data, LinkedList<E>.Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}

package com.linkedlist;



public class Linkedlist {
	Node head;
	public void add(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null) {
		head=node;
	}
		else {
			Node position=head;
		while(position.next != null) {
			position=position.next;
		}
		position.next=node;
		}
	    }
	public void addFirst(int data) {
	Node node=new Node();
	node.data=data; 
	node.next=null;
	node.next=head;
	head=node;
	}
	///inserting value 
	public void Insert(int indice,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(indice==0) {
			addFirst(data);
		}
		else {
			Node positionN=head;
			for(int i=0;i<indice-1;i++) {
				positionN=positionN.next;
			}
		node.next=positionN.next;
		positionN.next=node;
		}
	   }
	public void delete() {
		if(head==null) {
			return;
		}
		head=head.next;
		
		}
	
		
	
	public void print() {
		Node node=head;
		while(node.next != null) {
			System.out.println(node.data+"   ");
			node=node.next;
		}
		System.out.println(node.data);
		
		}
	}

	

	
 
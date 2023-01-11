package com.linkedlist;



public class Linkedlist {
	Node head;
	
	 private int size;
	public Linkedlist() {
		this.size=0;
	}
	//adding data 
	public void add(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null) {
		size++;
		if(head==null)
		{
		head=node;
	}
		else {
			
			Node position=head;
		while(position.next != null) {
	    while(position.next!=null)
			position=position.next;
		}
		position.next=node;
		}
	    
	}}
	public void addFirst(int data) {
	Node node=new Node();
	node.data=data; 
	node.next=null;
	node.next=head;
	size++;
	head=node;
	}
	///inserting value 
	public void Insert(int indice,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		size++;
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
		size--;
		
		}
	void deletelast(){
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node Last=head;
		Node LastNode=head.next;
		size--;
		while(LastNode.next!=null) {
			LastNode=head.next;
			Last=Last.next;
		}
		Last.next=null;
		}
	public int getsize() {
		return size;
	}
	//searchdeletion of list
	public void deleteSearch(int data) {
		Node current=head,previous=null;
		if(current!=null && current.data==data) {
			head=current.next;
			return;
		}
		while(current!=null && current.data!=data) {
			previous=current;
			current=current.next;
		}
		if(current==null) {
			return;
		}
		previous.next=current.next;
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


	

	
 
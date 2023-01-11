package com.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Linkedlist ll=new Linkedlist();
	ll.add(56);
	//ll.add(30);
	ll.add(70);
	ll.print();
	
	ll.Insert(1, 30);
	int position,value;
	System.out.println("add at position for node::?"+"value:?");
	Scanner sc=new Scanner(System.in);
	System.out.printf("Add at positon: %d "+"Value: %d",position=sc.nextInt(),value=sc.nextInt());
	System.out.println();
	System.out.println();
	
	ll.Insert(position, value);
	int delete;
	System.out.println("enter delete value:: ");
	delete=sc.nextInt();
	ll.deleteSearch(delete);
	//ll.addFirst(70);
	///ll.addFirst(30);
	////ll.addFirst(56);
	ll.print();
	ll.delete();
	//ll.deletelast();
	ll.print();
	System.out.println(ll.getsize());
	System.out.println("size of list is "+ ll.getsize());
	}}
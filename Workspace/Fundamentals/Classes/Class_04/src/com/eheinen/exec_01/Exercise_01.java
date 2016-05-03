package com.eheinen.exec_01;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise_01 {

	private ArrayList<String> arrayList;
	private LinkedList<String> linkedList;

	public Exercise_01() {
		arrayList = new ArrayList<String>();
		linkedList = new LinkedList<String>();
	}
	
	public ArrayList<String> getArrayList() {
		return arrayList;
	}
	
	public void setArrayList(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
	
	public LinkedList<String> getLinkedList() {
		return linkedList;
	}
	
	public void setLinkedList(LinkedList<String> linkedList) {
		this.linkedList = linkedList;
	}
}
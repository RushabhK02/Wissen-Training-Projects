package com;

import com.my.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("item-1");
		linkedList.add("item-2");
		linkedList.add("item-3");

		for (String item : linkedList) {
			System.out.println(item);
		}
		
		linkedList.reverse();
		for (String item : linkedList) {
			System.out.println(item);
		}

	}

}

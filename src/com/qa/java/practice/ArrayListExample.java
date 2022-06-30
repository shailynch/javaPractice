package com.qa.java.practice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayListExample = new ArrayList<String>();
		ArrayList<String> arrayListExample2 = arrayListExample;
		arrayListExample.add("first addition");
		arrayListExample.add("second addition");
		arrayListExample.add("third addition");
		System.out.println(arrayListExample);
		System.out.println(arrayListExample.get(0));
		arrayListExample.set(0, "First EDITION");
		System.out.println(arrayListExample.get(0));
		System.out.println(arrayListExample.size());
		System.out.println(arrayListExample2);
		arrayListExample2.remove(2);
		System.out.println(arrayListExample2);
		arrayListExample2.clear();
		System.out.println(arrayListExample);

	}

}

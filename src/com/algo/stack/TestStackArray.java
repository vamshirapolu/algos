package com.algo.stack;

public class TestStackArray {
	public static void main(String[] args) {
		StackArray<String> stringStack = new  StackArray<>();
		stringStack.push("Vamshi").push("Rishi").push("Swathi");
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
	}
}

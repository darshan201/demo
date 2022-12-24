package com.app.demo;

@FunctionalInterface
interface Demo {
	int show(String s);
}

/*
 * class Demo1 implements Demo { public void show() { // we can skip this part
 * with lambda expression System.out.println("this is inside show method"); } }
 */

public class Lambda {

	public static void main(String[] args) {
		Demo obj = (s) -> {
			System.out.println("this is inside show method");
			return 0;
		             };// lambda expression
		obj.show("d");
	}
}

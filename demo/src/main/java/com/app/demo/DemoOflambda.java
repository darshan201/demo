package com.app.demo;

@FunctionalInterface
interface animal {
	public void eat();
}

/*
 * class horse implements animal{
 * 
 * @Override public void eat() { System.out.println("horse is eating"); } }
 */
public class DemoOflambda {
	public static void main(String[] args) {
		animal an = () -> System.out.println("horse is eating");
		an.eat();
	}
}

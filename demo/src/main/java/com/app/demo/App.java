package com.app.demo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		m1();                                                      // static method call
		App app = new App();
		app.m2();                                                     // non-static call

	}

	public static void m1() {        // static method so we can call this method directly

		System.out.println("darsshan");
	}

	public void m2() {                          // non-static so need to create instance
		System.out.println("juli");
	}

}

class App2 {

	public void m3() {

		App.m1();          // static method we can call with calssname.methodname in other class
		App app = new App();                               // create class instance --app
		app.m2();   // non-static method we can call with class-instance.methodname in other class

	}
}
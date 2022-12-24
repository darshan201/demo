package com.app.demo;
interface Mom {
	 public void son();
 }
class Dad {
	public static void sonspeaking() {
		System.out.println("son is speaking");
	}
}

public class MethodReferences {

	public static void main(String[] args) {
		 Mom  mom = (Dad::sonspeaking);
		 mom.son();
		 Thread th =  new Thread(Dad::sonspeaking);
		 th.start();

	}

}

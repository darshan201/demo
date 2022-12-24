package com.app.demo;

import java.util.ArrayList;
import java.util.List;

public class ListToArraytoString {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		Object[] c = list.toArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}

package com.app.demo;

public class Recursion {
	int j = 1;
	int k;

	public static void main(String[] args) {
		Recursion r = new Recursion();
		System.out.println(r.factorial(5));
		System.out.println(r.fact(5));
	}

	public int factorial(int n) {
		for (int i = 1; i <= n; i++) {
			j = j * i;
		}
		return j;
	}

	public int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			k = n * fact(n - 1);
		}
		return k;
	}

}

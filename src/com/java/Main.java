package com.java;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome");
		Integer x = 5, y = 15, z = 3;
		Float p = 1.5f, q = 6.5f, r = 2.3f;
		String a = "Hello", b = "Hii", c = "Welcome";
		Maximum.<Integer>testMaximum(x, y, z);
		Maximum.<Float>testMaximum(p, q, r);
		Maximum.<String>testMaximum(a, b, c);

	}
}
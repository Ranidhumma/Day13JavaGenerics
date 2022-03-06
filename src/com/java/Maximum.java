package com.java;

public class Maximum<T extends Comparable<T>> {

	T x, y, z;

	/* created constructor */

	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("The Maximum Value is \n " + max);
		System.out.println();
	}

}

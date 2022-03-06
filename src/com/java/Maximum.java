package com.java;

public class Maximum {

	int x, y, z;

	/* created constructor */

	public Maximum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/* checking max value of three Integer */

	public static Float testMaximum(Float x, Float y, Float z) {

		Float max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.printf("The Maximum value is: " + max);
	}

}

package com.sharnit.problems;

public class FibonacciNumbers {

	// F(0) = 0, F(1) = 1
	// F(N) = F(N - 1) + F(N - 2), for N > 1.
	

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {

		int fib5 = fib(0);
		System.out.println("=>  " + fib5);
		
		int fib6 = fib(1);
		System.out.println("=>  " + fib6);

		int fib7 = fib(2);
		System.out.println("=>  " + fib7);

		int fib8 = fib(3);
		System.out.println("=>  " + fib8);

		int fib9 = fib(4);
		System.out.println("=>  " + fib9);

		int fib10 = fib(5);
		System.out.println("=>  " + fib10);


	}
	
}

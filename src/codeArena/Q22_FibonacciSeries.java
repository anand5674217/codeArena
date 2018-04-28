package codeArena;

import java.util.Scanner;

public class Q22_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacciSeries(n);
		sc.close();
	}

	private static void fibonacciSeries(int n) {
		int a = 0, b = 1, c = 0;
		n = n - 2;
		while (n-- > 0) {
			a = b;
			b = c;
		}
		System.out.println(c);
	}

}

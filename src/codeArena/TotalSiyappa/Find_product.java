package codeArena.TotalSiyappa;

import java.util.Scanner;

public class Find_product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = 1;
		double b = Math.pow(10, 9) + 7;
		for (int i = 0; i < n; i++) {
			a = (a * sc.nextInt() % b);
		}
		System.out.println(a);
	}

}

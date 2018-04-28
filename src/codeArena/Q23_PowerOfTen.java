package codeArena;

import java.util.Scanner;

public class Q23_PowerOfTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = powerOfTen(n);
		if (n == 1)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}

	private static int powerOfTen(int n) {
		if (n % 10 == 0) {
			n = n / 10;
			n = powerOfTen(n);
		}
		return n;

	}

}

package codeArena;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ifPrime(n);
		sc.close();
	}

	private static void ifPrime(int n) {
		int m = (int) Math.sqrt(n), count = 0;
		for (int i = 2; i <= m + 1 && n != 2; i++) {
			if (n % i == 0) {
				count++;
				System.out.println("Not a prime");
				break;
			}

		}
		if (count == 0)
			System.out.println("It is a prime no");
	}

}

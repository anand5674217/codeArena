package codeArena;

import java.util.Scanner;

public class MakeMyTrip1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int a[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] > 0)
					sum += a[i];
			}
			checkForOne(sum);
		}
	}

	private static void checkForOne(int sum) {
		while (sum != 1 && sum % 2 == 0 && sum != 0) {
			sum /= 2;
		}
		if (sum == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

package codeArena.TotalSiyappa;

import java.util.Scanner;

public class Ashish2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < 1000000; i++) {
			double a = Math.sqrt((i * m) + n);
			double b = Math.floor(a);
			if ((a - b) == 0) {
				System.out.println((int) a);
				break;
			}
		}
	}

}

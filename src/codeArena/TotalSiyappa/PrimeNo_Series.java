package codeArena.TotalSiyappa;

import java.util.Scanner;

public class PrimeNo_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			boolean val = checkIfPrime(i);
			if (val)
				System.out.print(i+" ");
		}
	}

	private static boolean checkIfPrime(int i) {
		int c = 0;
		/*
		 * if(i==2){ return true; } else{
		 */
		int val = i / 2;
		for (int j = 2; j <= val; j++) {
			if (i % j == 0)
				c++;
		}
		if (c > 0)
			return false;
		else
			return true;
	}

}

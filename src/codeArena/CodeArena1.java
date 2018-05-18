package codeArena;

import java.util.Scanner;

public class CodeArena1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			double m=sc.nextDouble();
			double sum=0;
			for (int i = 1; i <= n; i++) {
				sum+=(Math.pow(i, 3));
			}
			System.out.println((int)(k*sum-m));
		}
		System.out.println(Math.pow(5, (1/3)));
	}
}

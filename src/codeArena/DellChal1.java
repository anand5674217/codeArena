package codeArena;

import java.util.Scanner;

public class DellChal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double n = sc.nextDouble();
			double a[] = new double[(int) n];
			double sum = 0, sum1 = 0, min = 0, dif = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			min = sum;
			for (int i = 0; i < n; i++) {
				sum1 += a[i];
				double sum2 = sum - sum1;
				dif = sum2 - sum1;
				if (dif>0 && dif < min) {
					min = dif;
				}
			}
			if (min > 0)
				System.out.println((int) min);
			else
				System.out.println("-1");
		}
		sc.close();
	}

}

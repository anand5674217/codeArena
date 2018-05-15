package codeArena.TotalSiyappa;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double t = sc.nextDouble();
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.0);
		a.add(2.0);
		a.add(4.0);
		a.add(8.0);
		a.add(32.0);
		a.add(64.0);
		a.add(128.0);
		for (int i = 0; i < 8; i++) {
			if (a.contains( t - 2 * Math.pow(2, i))) {
				System.out.println("1");
				System.out.println(i+1);
				break;
			}
		}

	}
}

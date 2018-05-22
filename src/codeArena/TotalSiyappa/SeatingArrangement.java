package codeArena.TotalSiyappa;

import java.util.ArrayList;
import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList w1 = makeSeries(1);
		ArrayList w2 = makeSeries(6);
		ArrayList m1 = makeSeries(2);
		ArrayList m2 = makeSeries(5);
		ArrayList a1 = makeSeries(3);
		ArrayList a2 = makeSeries(4);

		while (t-- > 0) {

			int n = sc.nextInt();
			int i = 1;
			int val = n - (i - 1) * 6;
			while ((val) > 6) {
				val = n - (i - 1) * 6;
				i++;
			}
			checkForSeat(val, i-1, w1, w2, m1, m2, a1, a2);
		}
	}

	private static void checkForSeat(int val, int i, ArrayList w1, ArrayList w2, ArrayList m1, ArrayList m2,
			ArrayList a1, ArrayList a2) {
		// TODO Auto-generated method stub
		if (w1.contains(val)) {
			// w2.get(i);
			if(w2.size()>i)
			System.out.println(w2.get(i) + " WS");

		}
		if (w2.contains(val)) {
			// w2.get(i);
			if(w1.size()>i)
			System.out.println(w1.get(i) + " WS");

		}
		if (m1.contains(val)) {
			// w2.get(i);
			if(m2.size()>i)
			System.out.println(m2.get(i) + " MS");

		}
		if (m2.contains(val)) {
			// w2.get(i);
			if(m1.size()>i)
			System.out.println(m1.get(i) + " MS");

		}
		if (a1.contains(val)) {
			if(a2.size()>i)// w2.get(i);
			System.out.println(a2.get(i) + " AS");

		}
		if (a2.contains(val)) {
			// w2.get(i);
			if(a1.size()>i)
			System.out.println(a1.get(i) + " AS");

		}
	}

	private static ArrayList makeSeries(int i) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int j = i; j <= 108; j = j + 6) {
			a.add(j);
		}
		return a;
	}

}

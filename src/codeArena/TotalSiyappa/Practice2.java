package codeArena.TotalSiyappa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			a.add(sc.nextInt());
		}
		int b = sc.nextInt();

		HashMap<Integer, Integer> d = new HashMap<>();
		for (int i = 0; i < a.size(); i++) {
			int c = b - a.get(i);
			if (a.contains(c)) {
				d.put(a.get(i), c);
				a.remove(i);
				a.add(i, 0);
			}
		}
		System.out.println(d.toString());

	}

}

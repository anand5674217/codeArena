package codeArena;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CodeArena4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		HashMap<Double, String> hm = new HashMap<>();
		TreeSet<Double> h = new TreeSet<>();
		String[] name = new String[n];
		Double quo[] = new Double[n];
		for (int i = 0; i < n; i++) {
			name[i] = sc.next();
			quo[i] = sc.nextDouble();
			h.add(quo[i]);
			if (hm.get(quo[i]) != null) {
				int val = (name[i].compareTo(hm.get(quo[i])));
				if (val > 0)
					hm.put(quo[i], hm.get(quo[i]));
				else
					hm.put(quo[i], name[i]);
			} else
				hm.put(quo[i], name[i]);
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(hm.get(h.last()));
			h.remove(h.last());
		}
	}
}
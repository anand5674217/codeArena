package codeArena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrustingSocialChal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		ArrayList<Long> a = new ArrayList<>();
		while (n-- > 0) {
			int f = sc.nextInt();
			if (f == 1) {
				long m = sc.nextLong();
				a.add(m);
			}
			if (f == 2) {
				int len = (a.size() / 3),len1=a.size();
				
				if (len >= 1) {Collections.sort(a);
				//Collections.reverse(a);
					System.out.println(a.get(len1-len));
				} else {
					System.out.println("Not enough enemies");
				}
			}
		}
	}
}
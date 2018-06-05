package codeArena;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class VivritBackend1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();StringBuffer x =new StringBuffer();
		int len = s.length();
		int n = sc.nextInt();
		int[] val = new int[n];
		for (int i = 0; i < n; i++) {
			val[i] = sc.nextInt();
			if (val[i] > 0 && val[i] < len - 1) {
				x.append(s.substring(0, val[i] + 1));
			} else {
				x.append(s.substring(val[i] * -1, len));
			}
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int len1 = x.length();
			int k = sc.nextInt();

			if (k > len1)
				System.out.println("-1");
			else {
				int count = 0;
				for (int j = 0; j < len1; j++) {
					char value = x.charAt(j);
					if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u')
						count++;
					else{
						x.deleteCharAt(j);
						len1 = x.length();
						
					}
						
					if (count == k) {
						System.out.println(value);
						break;
					}
				}
			}
		}
		System.out.println(s + " " + n + " " + q);
		System.out.println("X is" + x);
	}
}

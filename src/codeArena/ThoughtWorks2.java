package codeArena;

import java.util.Scanner;

public class ThoughtWorks2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		while (q-- > 0) {
			int i = sc.nextInt();
			char[] b1 = b.toCharArray();
			if(i>0)
			b1[i-1] = '1';
			String b3 = new String(b1);b=b3;
			Double a2 = Double.parseDouble(a);
			Double b2 = Double.parseDouble(b3);
			if (b2 >= a2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}

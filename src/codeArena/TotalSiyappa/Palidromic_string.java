package codeArena.TotalSiyappa;

import java.util.Scanner;

public class Palidromic_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int l = s.length,c=0;
	//	if (l % 2 == 0) {
			for (int i = 0; i < l/2; i++) {
				c++;
				if(s[i]!=s[l-1-i]){
					System.out.println("NO");
					break;
				}
			}
			if(c==l/2)
			System.out.println("YES");
			/*} else {
			String s1 = s.substring(1, (int) l / 2);
			String s2 = s.substring((int) l / 2 + 2, l);
			s2=s2.re
			if ((s1.compareTo(s1)) == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}*/
	}

}

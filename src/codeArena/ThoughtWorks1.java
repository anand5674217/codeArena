package codeArena;

import java.util.Scanner;

public class ThoughtWorks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			/*if (n == 1) {
				System.out.println(n);
			} else {
				long v = n / 3 + 1;
				for (int i = 0; i < v; i++) {
					if (Math.pow(3, i) == n) {
						System.out.println(i);
						break;

					}
					if ((n > Math.pow(3, i)) && (n < Math.pow(3, i + 1))) {
						System.out.println(i + 1);
						break;
					}
				}
			}*/
			long v = n / 3 + 1,sum=0;
			for (int i = 1; i <= v; i++) {
				sum+=Math.pow(3, i);
				if(sum>=n){
					System.out.println(i);break;
				}
			}
			
		}
	}
}

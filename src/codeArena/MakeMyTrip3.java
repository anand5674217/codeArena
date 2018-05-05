package codeArena;

import java.util.Scanner;

public class MakeMyTrip3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int a[] = new int[n];
		while (q-- > 0) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b == 1) {
				if (c < n)
					a[c] = 2 * a[c] + 1;
			}
			if (b == 2) {
				if (c < n)
					a[c] = (int) Math.floor(a[c] / 2);
			}
			if (b == 3) {
				int count = 0;
				int d = sc.nextInt();
				for (int i = c; i <= d && i < n; i++) {
count+=CovertAndCount(a[i]);
					/*Integer a1 = new Integer(a[i]);
					String binary = Integer.toBinaryString(a1);
					char[] e = binary.toCharArray();
					int l = e.length;
					for (int j = 0; j < l; j++) {
						if (e[j] == '1')
							count++;
					}*/
				}
				System.out.println(count);
			}
		}
	}

	private static int CovertAndCount(int n) {
		// TODO Auto-generated method stub
		int a=0,count=0;
		String x=null;
		while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
		return count;
	}

}

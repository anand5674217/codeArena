package codeArena.TotalSiyappa;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String n = sc.next();
			String d = sc.next();
			int r = sc.nextInt();

			BigDecimal n1 = new BigDecimal(n);
			BigDecimal d1 = new BigDecimal(d);

			MathContext context = new MathContext(r, RoundingMode.DOWN);

			BigDecimal result = n1.divide(d1, context);
			System.out.println(result);
			String s[] = result.toString().split("\\.");
			if (r > s[1].length())
				System.out.println("0");
			else
				System.out.println(s[1].charAt(r-1));

		}
	}

}

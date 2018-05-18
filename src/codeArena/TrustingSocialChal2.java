package codeArena;

import java.util.Scanner;

public class TrustingSocialChal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		while (t-- > 0) {
			Double s[] = new Double[4];
			Double d[] = new Double[4];
			Double f[] = new Double[4];
			Double c[] = new Double[4];
			s = TakeInput(s, sc);
			d = TakeInput(d, sc);
			f = TakeInput(f, sc);
			c = TakeInput(c, sc);

			String fScore1 = calculateScore(s, d, f);
			Double fScore = Double.parseDouble(fScore1.split(" ")[0]), maxF = Double.parseDouble(fScore1.split(" ")[1]);
			String cScore1 = calculateScore(s, d, c);
			Double cScore = Double.parseDouble(cScore1.split(" ")[0]), maxC = Double.parseDouble(fScore1.split(" ")[1]);

			if (fScore > cScore) {
				System.out.println("Flash");
			} else if (cScore > fScore) {
				System.out.println("Cisco");
			} else if (fScore == cScore) {
				if (maxF > maxC) {
					System.out.println("Cisco");
				} else if (maxC > maxF) {
					System.out.println("Flash");
				} else
					System.out.println("Tie");

			}

		}
	}

	/*
	 * private static void compareTime(Double[] f, Double[] c) { double maxF =
	 * f[0], maxC = c[0]; for (int i = 1; i < 4; i++) { if (maxF < f[i]) maxF =
	 * f[i]; if (maxC < c[i]) maxC = c[i]; } if (maxF > maxC) {
	 * System.out.println("Cisco"); } else if (maxC > maxF) {
	 * System.out.println("Flash"); } else System.out.println("Tie");
	 * 
	 * }
	 */
	private static String calculateScore(Double[] s, Double[] d, Double[] f) {
		// TODO Auto-generated method stub
		double sum = 0;
		double maxF = f[0];
		for (int i = 0; i < 4; i++) {
			if (maxF < f[i]) {
				maxF = f[i];
			}
			double val = s[i] - (d[i] * f[i]);
			double val2 = s[i] / 2;
			if (val > val2)
				sum += val;
			else
				sum += val2;
		}
		return sum + " " + maxF;
	}

	private static Double[] TakeInput(Double[] s, Scanner sc) {
		for (int i = 0; i < 4; i++) {
			s[i] = sc.nextDouble();
		}
		return s;

	}
}
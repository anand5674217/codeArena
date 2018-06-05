package codeArena;

import java.util.Scanner;

public class CodeArena5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt(), m = sc.nextInt();
			int[][] a = new int[n][m];
			int x1 = sc.nextInt() - 1, y1 = sc.nextInt() - 1;
			int x2 = sc.nextInt() - 1, y2 = sc.nextInt() - 1;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			checkForMini(a, n, m, x1, y1, x2, y2);

		}
	}

	private static void checkForMini(int[][] a, int n, int m, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		int i = x1, j = y1;
		while ((i != x2 || j != y2) && (i<n && j<n) ){
			if (i < n-1) {
				if (a[i][j] < a[i + 1][j])
					i = i + 1;
			}
			if (j < n-1) {
				if (a[i][j] < a[i][j + 1])
					j = j + 1;
			}
		}
		if ((x2 == i) && (y2 == j)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
package codeArena;

import java.util.Arrays;
import java.util.Scanner;

public class CodeArena2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			calculateValueofProduct(n,m,sc);
			
					/*int m1=sc.nextInt();int m2=sc.nextInt();int m3=sc.nextInt();
					int val=findVal(m1,m2,m3);*/
				
			
		}
	}

	private static void calculateValueofProduct(int n, int m, Scanner sc) {
		// TODO Auto-generated method stub
		int pricePerShop[]=new int[m];
		int pricePerProd[]=new int[n];
		for (int i = 0; i < n; i++) {
			int val=0;
			for (int j = 0; j < m; j++) {
				int m1=sc.nextInt();int m2=sc.nextInt();int m3=sc.nextInt();
				val=findVal(m1,m2,m3);
				pricePerShop[j]=val;
			}
		 pricePerProd[i]=	findMin(pricePerShop);
		 System.out.print(pricePerProd[i]);
		}
		
	}

	private static int findMin(int[] pricePerShop) {
		int l=pricePerShop.length;int min=pricePerShop[0];
		for (int i = 0; i < l; i++) {
			if(min>pricePerShop[i])
				min=pricePerShop[i];
		}
		return min+1;
	}

	private static int findVal(int m1, int m2, int m3) {
		
		int val=100;
		val=val-(m1/val*100);
		val=val-(m2/val*100);
		val=val-(m3/val*100);
		
		return val;
	}
}

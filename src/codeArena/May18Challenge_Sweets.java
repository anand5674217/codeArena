package codeArena;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class May18Challenge_Sweets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();b[i]=sc.nextInt();
		}
		TreeMap<Integer, Integer> hm= new TreeMap<>();
				
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n && i!=j; j++) {

				if(a[i]>=a[j])
					count++;
				if(a[i]>a[j] && a[i]<b[j] )
					count++;
			}
			hm.put(count, i);
		}
		System.out.println(hm.get(n-1));
		sc.close();
	}


}

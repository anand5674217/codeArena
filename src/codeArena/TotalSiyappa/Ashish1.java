package codeArena.TotalSiyappa;

import java.util.Scanner;

public class Ashish1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int i=1;
		while((i*i)%m!=n){
			i++;
		}
		System.out.println();
	}

}

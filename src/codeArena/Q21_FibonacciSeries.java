package codeArena;

import java.util.Scanner;

public class Q21_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
fibonacciSeries(n);
sc.close();
	}

	private static void fibonacciSeries(int n) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,sum=a+b;
		while(c<n){
			c=a+b;System.out.println(c);
			a=b;b=c;sum+=c;
		}
		System.out.println(sum);
	}

}

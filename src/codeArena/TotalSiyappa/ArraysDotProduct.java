package codeArena.TotalSiyappa;

import java.util.Scanner;

public class ArraysDotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Please enter the elements of Array1");
System.out.println("Please enter size of array1");
int m1=sc.nextInt();
int n1=sc.nextInt();
int[][] a1=new int[m1][n1];
for (int i = 0; i < m1; i++) {
	for (int j = 0; j < n1; j++) {
		a1[i][j]=sc.nextInt();
	}
}

System.out.println("Please enter the elements of Array2");
System.out.println("Please enter size of array2");
int m2=sc.nextInt();
int n2=sc.nextInt();
int[][] a2=new int[m2][n2];
for (int i = 0; i < m2; i++) {
	for (int j = 0; j < n2; j++) {
		a2[i][j]=sc.nextInt();
	}
}
if(n1==m2){
	int[][] a3=new int[m2][n1];
	for (int i = 0; i < m1; i++) {
		for (int j = 0; j < n2; j++) {
			a3[i][j]= getSum(a1,a2,n1,j,i);
			System.out.print(a3[i][j]+ " ");
		}
		System.out.println();
	}
}else{
	System.out.println("Sry!!! Multiplication not possible");
}

	}

	private static int getSum(int[][] a1, int[][] a2, int m, int n,int k) {
		int sum=0;
		for (int i = 0; i < m; i++) {
				sum+=a1[k][i]*a2[i][n];
		}
		
		return sum;
		
		
		
		
	}

}

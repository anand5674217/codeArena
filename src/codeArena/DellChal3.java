package codeArena;

import java.util.Scanner;

public class DellChal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int a[][]= new int[n][m];
		for (int i = 0; i < n; i++) {
			String s=sc.next();
			char b[]=s.toCharArray();
			for (int j = 0; j < m; j++) {
				if(b[j]=='#')
					a[i][j]=1;
				else
					a[i][j]=0;
			}
			
			
		}
		//System.out.println(a[0][0]);
		int l=sc.nextInt(),r=sc.nextInt(),u=sc.nextInt(),d=sc.nextInt();
		int x=sc.nextInt(),y=sc.nextInt();
		int q=sc.nextInt();
		while(q-->0){
			int val=sc.nextInt();
			
		}
	}
}

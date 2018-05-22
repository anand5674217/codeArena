package codeArena.TotalSiyappa;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		char[] s1=sc.next().toCharArray();
		char[] s2=sc.next().toCharArray();
		Arrays.sort(s1);Arrays.sort(s2);int count=0;
		for (int i = 0; i < s2.length; i++) {
			if(s1[i]!=(s2[i]))
					count++;
		}
		if(count==0)
		System.out.println("YES");
		else
			System.out.println("NO");
	}
}
}

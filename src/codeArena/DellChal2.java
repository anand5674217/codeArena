package codeArena;

import java.util.Scanner;

public class DellChal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		String s=sc.next();
		checkForPalindrome(s);
		
		}
		sc.close();
	}

	private static void checkForPalindrome(String s) {
		// TODO Auto-generated method stub
		int n=s.length(),count=0;
		for (int i = 0; i < n; i++) {
		char ch=	s.charAt(i);
		int index=s.indexOf(ch, i);
		if(index!=-1){
			s.replace(s.charAt(index), ch);
		findIfPali(s,n);
		}else
			count++;
		
		if(count>1){
			System.out.println("No");
			break;
		}
	}
	}

	private static void findIfPali(String s, int n) {
		// TODO Auto-generated method stub
		int n1=n/2,cont=0;
		for (int i = 0; i < n1; i++) {
		if(s.charAt(i)!=s.charAt(n-i-1))
		{cont++;
			System.out.println("No");
			break;
		}
		}
		if(cont==0)
		System.out.println("Yes");
	}
}

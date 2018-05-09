package codeArena.TotalSiyappa;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()<5000){
		s=s.replace('a', '1');
		s=s.replace('b', '2');
		s=s.replace('c', '3');
		s=s.replace('d', '4');
		s=s.replace('e', '5');
		s=s.replace('f', '6');
		s=s.replace('g', '7');
		s=s.replace('h', '8');
		s=s.replace('i', '9');
		
		//System.out.println(s);
		Double d= new Double(s);
		//System.out.println(d/6);
		if(d%6==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
		else
			System.out.println("YES");
		
	}
}

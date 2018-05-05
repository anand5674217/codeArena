package codeArena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MakeMyTrip2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int t = sc.nextInt();
		char[] b = s.toCharArray();
		int n = b.length;
		while (t-- > 0) {boolean val=false;
			int k = sc.nextInt();
			for (int i = 0; i < n; i++) {
				ArrayList<Character> a = new ArrayList<>();
				for (int j = i; j < (i + k)&& j<n; j++) {
					a.add(b[j]);
				}
				 val=checkForPalidrome(a, k);
				 if(val)
					 break;
				
			}
			if(val)
				System.out.println(k);
			else
				System.out.println("-1");
		}
	}

	private static boolean checkForPalidrome(ArrayList<Character> a, int k) {
		 int count[] = new int[256];
		    Arrays.fill(count, 0);
		 
		    // For each character in input strings,
		    // increment count in the corresponding
		    // count array
		    for (int i = 0; i < k; i++)
		    count[(int)(a.get(i))]++;
		 
		    // Count odd occurring characters
		    int odd = 0;
		    for (int i = 0; i < 256; i++) 
		    {
		    if ((count[i] & 1) == 1)
		        odd++;
		 
		    if (odd > 1)
		        return false;
		    }
		 
		    // Return true if odd count is 0 or 1,
		    return true;
	}

}

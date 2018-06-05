package codeArena.TotalSiyappa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Samsung_challenge {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			ArrayList<String> a = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				a.add(br.readLine());
			}
			int q = Integer.parseInt(br.readLine());
			int len = 0;
			for (int i = 0; i < q;i++) {
				String readLine = br.readLine();
				if (readLine.contains(":"))
					i++;
				a = valAfterOperation(br, readLine, a, len);

			}
			for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static ArrayList<String> valAfterOperation(BufferedReader br, String readLine, ArrayList<String> a, int len)
			throws NumberFormatException, IOException {
		if (len == 0)
			len = a.size();
		if (readLine.contains("dd")) {
			a.remove(len - 1);
		}
		if (readLine.contains("i")) {
			int q = Integer.parseInt(readLine.split(" ")[1]);
			for (int i = 0; i < q; i++) {
				if (len > i) {
					String b = a.get(i) + br.readLine();
					a.remove(i);
					a.add(b);
				} else
					a.add(br.readLine());

			}

		}
		if (readLine.contains(":")) {
			int q = Character.getNumericValue(readLine.toCharArray()[1]);
			a = valAfterOperation(br, br.readLine(), a, q);
		}
	if(readLine.contains("y")){
			String copy=a.get(len);
		}
		return a;
	
	}

}

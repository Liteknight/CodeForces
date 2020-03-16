

import java.util.Scanner;

public class TelephoneNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {

			int n = in.nextInt(), j = 0, eightIndex = 0;
			String s = in.next();
			boolean eightStart = false;

			while (j < n) {

				if (s.charAt(j) == '8') {
					eightStart = true;
					eightIndex = j;
					j = n;

				} else {
					j++;
				}
			}
			if (eightStart && n - eightIndex >= 11) {
				System.out.println("YES");

			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}

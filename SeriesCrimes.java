import java.util.Scanner;

public class SeriesCrimes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, k, l;
		String s[] = new String[n];

		for (i = 0; i < n; i++)
			s[i] = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			boolean g1 = false, g2 = false;

			for (j = 0; j < m; j++) {
				if (s[i].charAt(j) == '.') {

					for (k = 0; k < m; k++) {
						if (s[i].charAt(k) == '*') {
							g1 = true;
						}
					}
					for (l = 0; l < n; l++) {
						if (s[l].charAt(j) == '*') {
							g2 = true;
						}
					}
				}
				if (g1 == true && g2 == true) {
					System.out.println((i + 1) + " " + (j + 1));
					break;
				}
			}
		}
	}
}

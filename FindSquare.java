import java.util.Scanner;

public class FindSquare {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), n1 = 115, n2 = 0, m1 = 115, m2 = 0, i, j;

		for (i = 0; i < n; i++) {
			String s = in.next();

			for (j = 0; j < m; j++) {
				if (s.charAt(j) == 'B') {
					n1 = Math.min(n1, j);
					m1 = Math.min(m1, i);
					n2 = Math.max(n2, j);
					m2 = Math.max(m2, i);
				}
			}
		}
		in.close();
		while (n1 != n2) {
			n1++;
			n2--;
		}
		while (m1 != m2) {
			m1++;
			m2--;
		}
		System.out.println((m1 + 1) + " " + (n1 + 1));
	}
}

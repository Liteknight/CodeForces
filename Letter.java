import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), n1 = 50, n2 = 0, m1 = 50, m2 = 0, i, j;
		String[] a = new String[n];

		for (i = 0; i < n; i++) {
			a[i] = in.next();
			for (j = 0; j < m; j++) {

				if (a[i].charAt(j) == '*') {
					n1 = Math.min(n1, i);
					n2 = Math.max(n2, i);
					m1 = Math.min(m1, j);
					m2 = Math.max(m2, j);
				}
			}
		}
		for (i = n1; i <= n2; i++) {
			for (j = m1; j <= m2; j++) {
				System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
		in.close();
	}
}

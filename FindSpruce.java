import java.util.Scanner;

public class FindSpruce {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), m = in.nextInt(), i, j, a[][] = new int[n + 2][m + 2], c = 0;
			for (i = 0; i < n; i++) {
				String s = in.next();

				for (j = 0; j < m; j++)
					if (s.charAt(j) == '*')
						a[i + 1][j + 1] = 1;
			}
			for (i = n; i > 0; i--)
				for (j = 1; j <= m; j++)
					if (a[i][j] > 0) {

						a[i][j] = Math.min(Math.min(a[i + 1][j - 1], a[i + 1][j]), a[i + 1][j + 1]) + 1;
						c += a[i][j];
					}
			System.out.println(c);
		}
		in.close();
	}
}

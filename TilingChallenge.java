import java.util.Scanner;

public class TilingChallenge {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		boolean a[][] = new boolean[n][n];

		for (i = 0; i < n; i++) {
			String s = in.next();
			for (j = 0; j < n; j++)
				a[i][j] = s.charAt(j) == '.' ? true : false;
		}
		in.close();

		for (i = 1; i < n - 1; i++)
			for (j = 1; j < n - 1; j++)

				if (a[i][j] && a[i - 1][j] && a[i + 1][j] && a[i][j - 1] && a[i][j + 1])
					a[i][j] = a[i - 1][j] = a[i + 1][j] = a[i][j - 1] = a[i][j + 1] = false;

		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				if (a[i][j]) {
					System.out.println("NO");
					return;
				}
		System.out.println("YES");
	}
}

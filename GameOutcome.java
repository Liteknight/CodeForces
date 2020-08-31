import java.util.Scanner;

public class GameOutcome {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[][] = new int[n][n], i, j, t = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				a[i][j] = in.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				int c = 0, r = 0, k;

				for (k = 0; k < n; k++)
					c += a[k][j];
				for (k = 0; k < n; k++)
					r += a[i][k];
				if (c > r)
					t++;
			}
		}
		in.close();
		System.out.println(t);
	}
}

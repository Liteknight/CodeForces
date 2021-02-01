import java.util.Scanner;

public class Labs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, s = 1, a[][] = new int[n][n];
		in.close();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (i % 2 == 0)
					a[j][i] = s;
				else
					a[n - j - 1][i] = s;
				s++;
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}

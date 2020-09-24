import java.util.Scanner;

public class MatrixGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt(), i, j, r = 0, c = 0;
			boolean[] row = new boolean[n], col = new boolean[m];

			for (i = 0; i < n; i++)
				for (j = 0; j < m; j++)

					if (in.nextInt() == 1)
						row[i] = col[j] = true;

			for (i = 0; i < n; i++)
				if (!row[i])
					r++;
			for (j = 0; j < m; j++)
				if (!col[j])
					c++;
			System.out.println(Math.min(r, c) % 2 == 0 ? "Vivek" : "Ashish");

		}
		in.close();
	}
}

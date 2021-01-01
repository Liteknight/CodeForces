import java.util.Scanner;

public class PlusFromPic {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), w = in.nextInt(), i, j, k, l;
		boolean[][] a = new boolean[h][w];

		for (i = 0; i < h; i++) {
			String s = in.next();
			for (j = 0; j < w; j++)
				a[i][j] = s.charAt(j) == '*';
		}
		in.close();

		for (i = 1; i < h - 1; i++)
			for (j = 1; j < w - 1; j++)

				if (a[i][j] && a[i - 1][j] && a[i + 1][j] && a[i][j - 1] && a[i][j + 1]) {
					a[i][j] = false;

					int m = i - 1;
					while (m >= 0 && a[m][j])
						a[m--][j] = false;

					m = i + 1;
					while (m < h && a[m][j])
						a[m++][j] = false;

					m = j - 1;
					while (m >= 0 && a[i][m])
						a[i][m--] = false;

					m = j + 1;
					while (m < w && a[i][m])
						a[i][m++] = false;

					for (k = 0; k < h; k++)
						for (l = 0; l < w; l++)

							if (a[k][l]) {
								System.out.println("NO");
								return;
							}
					System.out.println("YES");
					return;
				}
		System.out.println("NO");
		return;
	}
}

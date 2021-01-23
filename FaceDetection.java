import java.util.Scanner;

public class FaceDetection {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, o = 0;
		char a[][] = new char[n][m];

		for (i = 0; i < n; i++) {
			String s = in.next();
			for (j = 0; j < m; j++)
				a[i][j] = s.charAt(j);
		}
		in.close();
		for (i = 0; i < n - 1; i++)
			for (j = 0; j < m - 1; j++) {

				char c[] = new char[200];
				c[a[i][j]]++;
				c[a[i + 1][j]]++;
				c[a[i][j + 1]]++;
				c[a[i + 1][j + 1]]++;

				if (c['f' - 0] == 1 && c['a' - 0] == 1 && c['c' - 0] == 1 && c['e' - 0] == 1)
					o++;
			}
		System.out.println(o);
	}
}

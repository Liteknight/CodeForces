import java.util.Scanner;

public class FixConv {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), m = in.nextInt(), i, c = 0;
			char[][] a = new char[n][m];

			for (i = 0; i < n; i++)
				a[i] = in.next().toCharArray();

			for (i = 0; i < n; i++)
				if (a[i][m - 1] == 'R')
					c++;
			
			for (i = 0; i < m; i++)
				if (a[n - 1][i] == 'D')
					c++;
			
			System.out.println(c);
		}
		in.close();
	}
}

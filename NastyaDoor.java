import java.util.Scanner;

public class NastyaDoor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), k = in.nextInt(), i, j, a[] = new int[n], b[] = new int[n], p = -1, l = -1;
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();

			for (i = 1; i < n - 1; i++)
				if (a[i] > a[i - 1] && a[i] > a[i + 1])
					b[i] = 1;

			for (i = 1; i < n; i++)
				b[i] += b[i - 1];

			for (i = k - 1, j = 0; i < n; i++, j++)
				if (p < b[i - 1] - b[j]) {
					p = b[i - 1] - b[j];
					l = j;
				}
			System.out.println((p + 1) + " " + (l + 1));
		}
		in.close();
	}
}

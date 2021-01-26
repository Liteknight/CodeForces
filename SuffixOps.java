import java.util.Scanner;

public class SuffixOps {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i;
			long a[] = new long[n];

			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			long m = Math.abs(a[1] - a[0]), c = m;

			for (i = 2; i < n; i++) {
				long x = Math.abs(a[i] - a[i - 1]), y = Math.abs(a[i] - a[i - 2]), z = Math.abs(a[i - 1] - a[i - 2]);

				m = Math.max(m, x + z - y);
				c += x;
			}
			m = Math.max(m, Math.abs(a[n - 1] - a[n - 2]));
			System.out.println(c - m);
		}
		in.close();
	}
}

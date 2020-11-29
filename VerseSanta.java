import java.util.Scanner;

public class VerseSanta {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, mi = 0, m = 0;
			long s = in.nextLong(), a[] = new long[n];

			for (i = 0; i < n; i++)
				a[i] = in.nextLong();

			while (m < n) {
				if (a[m] > a[mi])
					mi = m;
				s -= a[m];
				if (s < 0)
					break;
				m++;
			}
			System.out.println(s >= 0 ? 0 : mi + 1);
		}
		in.close();
	}
}

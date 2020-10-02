import java.util.Scanner;

public class BadPrices {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, a[] = new int[n], m = Integer.MAX_VALUE, b = 0;
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();

			for (i = n - 1; i >= 0; i--) {
				if (a[i] > m)
					b++;
				m = Math.min(m, a[i]);
			}
			System.out.println(b);
		}
		in.close();
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrSwaps {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), k = in.nextInt(), i, s = 0;
			int[] a = new int[n], b = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for (i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);

			for (i = 0; i < k; i++) {
				if (a[i] < b[n - i - 1]) {
					a[i] = b[n - i - 1];
				}
			}
			for (int j : a) {
				s += j;
			}
			System.out.println(s);
		}
		in.close();
	}
}

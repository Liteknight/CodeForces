import java.util.Arrays;
import java.util.Scanner;

public class MaxSquare {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt();

		while (k-- > 0) {
			int n = in.nextInt(), i, c = 0;
			int[] a = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (i = n - 1; i >= 0; i--) {

				if (a[i] >= n - i) {
					c++;
				}
			}
			System.out.println(c);
		}
		in.close();
	}
}

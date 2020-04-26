import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, d = 1001;
		int[] a = new int[m];

		for (i = 0; i < m; i++) { a[i] = in.nextInt(); }
		
		in.close();
		Arrays.sort(a);

		for (i = 0; i <= m - n; i++) {
			int k = a[i + n - 1] - a[i];

			if (k < d) { d = k; }
		}
		System.out.println(d);
	}
}

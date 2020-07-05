import java.util.Scanner;

public class ShasOskols {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int m = in.nextInt();
		for (i = 0; i < m; i++) {

			int x = in.nextInt(), y = in.nextInt();
			if (x > 1) {
				a[x - 2] += y - 1;
			}
			if (x < n) {
				a[x] += a[x - 1] - y;
			}
			a[x - 1] = 0;
		}
		in.close();
		for (int j : a) {
			System.out.println(j);
		}
	}
}

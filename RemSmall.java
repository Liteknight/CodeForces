import java.util.Arrays;
import java.util.Scanner;

public class RemSmall {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), a[] = new int[n], i, x = 0;

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (i = 1; i < n; i++) {
				if (a[i] - a[i - 1] > 1) {
					x = 1;
				}
			}
			System.out.println(x == 0 ? "YES" : "NO");
		}
		in.close();
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class EhabSub {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i;
		long a[] = new long[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextLong();
		in.close();
		Arrays.sort(a);

		System.out.println(a[0]);
		for (i = 1; i < k; i++) {

			if (i >= n) {
				System.out.println(0);
			} else {
				while (i < n && a[i] - a[i - 1] == 0) {
					i++;
					k++;
				}
				System.out.println(i >= n ? 0 : a[i] - a[i - 1]);
			}
		}
	}
}

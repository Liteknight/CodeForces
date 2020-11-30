import java.util.Arrays;
import java.util.Scanner;

public class TimeLimit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a[] = new int[n], b[] = new int[m], i;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		for (i = 0; i < m; i++)
			b[i] = in.nextInt();
		in.close();

		Arrays.sort(a);
		Arrays.sort(b);

		if (a.length == 1) {
			System.out.println(a[0] * 2 < b[0] ? a[0] * 2 : -1);
		} else {
			System.out.println(a[n - 1] < b[0] && a[0] * 2 <= b[0] - 1 ? Math.max(a[0] * 2, a[n - 1]) : -1);
		}
	}
}

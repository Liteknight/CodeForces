import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquares {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long a[] = new long[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextLong();
		in.close();
		Arrays.sort(a);

		for (i = n - 1; i >= 0; i--)
			if ((int) Math.sqrt(a[i]) != Math.sqrt(a[i])) {
				System.out.println(a[i]);
				break;
			}
	}
}

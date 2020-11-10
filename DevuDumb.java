import java.util.Arrays;
import java.util.Scanner;

public class DevuDumb {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long x = in.nextLong(), c = 0;
		Long[] a = new Long[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextLong();
		in.close();
		Arrays.sort(a);

		for (i = 0; i < n; i++) {
			c += a[i] * x;
			x = Math.max(1, x - 1);
		}
		System.out.println(c);
	}
}

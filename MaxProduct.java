import java.util.Arrays;
import java.util.Scanner;

public class MaxProduct {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt(), i;
			long a[] = new long[n];
			
			for (i = 0; i < n; i++)
				a[i] = in.nextLong();
			Arrays.sort(a);
			
			long p1 = a[n - 1] * a[n - 2] * a[n - 3] * a[1] * a[0],
				p2 = a[n - 1] * a[n - 2] * a[n - 3] * a[n - 4] * a[n - 5],
				p3 = a[0] * a[1] * a[2] * a[3] * a[n - 1];

			System.out.println(Math.max(Math.max(p1, p2), p3));
		}
		in.close();
	}
}

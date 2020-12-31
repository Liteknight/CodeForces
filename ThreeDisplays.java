import java.util.Arrays;
import java.util.Scanner;

public class ThreeDisplays {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), s[] = new int[n], c[] = new int[n], a[] = new int[n], i, j, m = Integer.MAX_VALUE;

		for (i = 0; i < n; i++)
			s[i] = in.nextInt();
		for (i = 0; i < n; i++)
			c[i] = in.nextInt();
		in.close();
		Arrays.fill(a, Integer.MAX_VALUE);

		for (i = 0; i < n; i++)
			for (j = i - 1; j >= 0; j--)

				if (s[i] > s[j]) {
					a[i] = Math.min(a[i], c[i] + c[j]);
					if (a[j] != Integer.MAX_VALUE)
						m = Math.min(m, c[i] + a[j]);
				}
		System.out.println(m == Integer.MAX_VALUE ? -1 : m);
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class KuriMiStones {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long a[] = new long[n + 1], b[] = new long[n + 1], c = 0;

		for (i = 0; i < n; i++) {
			int v = in.nextInt();

			b[i] = v;
			c += v;
			a[i + 1] = c;
		}
		Arrays.sort(b);
		for (i = 0; i < n; i++)
			b[i + 1] += b[i];

		int m = in.nextInt();
		while (m-- > 0) {
			
			int t = in.nextInt(), l = in.nextInt(), r = in.nextInt();
			System.out.println(t == 1 ? a[r] - a[l - 1] : b[r] - b[l - 1]);
		}
		in.close();
	}
}

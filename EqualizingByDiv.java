import java.util.Arrays;
import java.util.Scanner;

public class EqualizingByDiv {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, a[] = new int[n], b[] = new int[200001], c[] = new int[b.length],
				o = Integer.MAX_VALUE;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		Arrays.sort(a);
		for (i = 0; i < n; i++) {
			int t = 0;
			while (a[i] != 0) {

				c[a[i]]++;
				b[a[i]] += t;
				if (c[a[i]] >= k)
					o = Math.min(o, b[a[i]]);
				t++;
				a[i] /= 2;
			}
		}
		System.out.println(o);
	}
}

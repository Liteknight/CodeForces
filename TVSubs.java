import java.util.HashSet;
import java.util.Scanner;

public class TVSubs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), k = in.nextInt(), d = in.nextInt(), a[] = new int[n], i, j, m = Integer.MAX_VALUE;

			for (i = 0; i < n; i++)
				a[i] = in.nextInt();

			for (i = 0; i <= n - d; i++) {
				HashSet<Integer> h = new HashSet<Integer>();

				for (j = i; j < i + d; j++)
					h.add(a[j]);
				m = Math.min(m, h.size());
			}
			System.out.println(m);
		}
		in.close();
	}
}

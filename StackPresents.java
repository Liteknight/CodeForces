import java.util.Scanner;

public class StackPresents {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[n + 1], top = -1;
			for (i = 1; i <= n; i++)
				a[in.nextInt()] = i;

			long o = 0;
			for (i = 0; i < m; i++) {
				int b = in.nextInt();
				
				if (a[b] < top)
					o++;
				else {
					top = a[b];
					o += (top - i - 1) * 2 + 1;
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}

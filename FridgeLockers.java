import java.util.Scanner;

public class FridgeLockers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[n], s = 0;
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				s += a[i] * 2;
			}
			if (m < n || n < 3) {
				System.out.println(-1);
			} else {
				System.out.println(s);
				for (i = 1; i <= n; i++) {
					System.out.println(i + " " + (i % n + 1));
				}
			}
		}
		in.close();
	}
}

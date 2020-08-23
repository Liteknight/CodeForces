import java.util.Scanner;

public class OmkarInfinityClock {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), a[] = new int[n], d = 0, i;
			long k = (in.nextLong() & 1) == 1 ? 1 : 2;

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			while (k-- > 0) {
				d = a[0];
				for (i = 0; i < n; i++) {
					d = Math.max(d, a[i]);
				}
				for (i = 0; i < n; i++) {
					a[i] = d - a[i];
				}
			}
			for (int j : a) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		in.close();
	}
}

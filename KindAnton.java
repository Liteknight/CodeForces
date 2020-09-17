import java.util.Scanner;

public class KindAnton {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), i, a[] = new int[n], o = 0;
			boolean b1 = false, b2 = false;

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			for (i = 0; i < n; i++) {
				int b = in.nextInt();

				if ((a[i] < b && !b1) || (a[i] > b && !b2)) {
					o = 1;
				}
				if (a[i] == 1) {
					b1 = true;
				} else if (a[i] == -1) {
					b2 = true;
				}
			}
			System.out.println(o == 0 ? "YES" : "NO");
		}
		in.close();
	}
}

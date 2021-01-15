import java.util.Scanner;

public class LalaLandAppleTrees {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], b[] = new int[n], c = 0, l = 0;
		long s = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			s += b[i];
		}
		in.close();

		while (c < s) {
			int x = Integer.MAX_VALUE, y = Integer.MIN_VALUE, xi = 0, yi = 0, xn = 0, yn = 0;
			for (i = 0; i < n; i++) {

				if (a[i] > 0) {
					if (a[i] < x) {
						x = a[i];
						xi = i;
					}
					xn++;
				} else if (a[i] < 0) {
					if (a[i] > y) {
						y = a[i];
						yi = i;
					}
					yn++;
				}
			}
			if (xn == 0 && yn == 0)
				break;
			if (l == 0 && xn >= yn || l < 0 && xn > 0) {
				c += b[xi];
				l = x;
				a[xi] = 0;

			} else if (l == 0 && xn < yn || l > 0 && yn > 0) {
				c += b[yi];
				l = y;
				a[yi] = 0;
			} else {
				break;
			}
		}
		System.out.println(c);
	}
}

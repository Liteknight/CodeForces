import java.util.Arrays;
import java.util.Scanner;

public class BersuBall {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), a[] = new int[n], i, x = 0, y = 0, o = 0;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int m = in.nextInt(), b[] = new int[m];
		for (i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);
		Arrays.sort(b);

		while (x < n && y < m) {
			if (a[x] - b[y] > 1) {
				y++;
			} else if (b[y] - a[x] > 1) {
				x++;
			} else {
				x++;y++;o++;
			}
		}
		System.out.println(o);
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class AmrMusic {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, a[][] = new int[n][2], c = 0, d = 0;
		String s = "";

		for (i = 0; i < n; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = i + 1;
		}
		in.close();
		Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

		for (i = 0; i < n; i++) {
			if (c + a[i][0] <= k) {
				c += a[i][0];
				d++;
				s += a[i][1] + " ";
			}
		}
		System.out.println(d + "\n" + s);
	}
}

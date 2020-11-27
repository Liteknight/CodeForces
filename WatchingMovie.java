import java.util.Scanner;

public class WatchingMovie {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt(), i, c = 0, t = 1, l[] = new int[n], r[] = new int[n];

		for (i = 0; i < n; i++) {
			l[i] = in.nextInt();
			r[i] = in.nextInt();
			c += r[i] - l[i] + 1;
		}
		in.close();
		i = 0;
		while (t < l[n - 1]) {

			if (t + x <= l[i]) {
				t += x;
			} else {
				c += l[i] - t;
				t = r[i] + 1;
				i++;
			}
		}
		System.out.println(c);
	}
}

import java.util.Scanner;

public class LunchRush {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt() - 1, k = in.nextInt(), f1 = in.nextInt(), t1 = in.nextInt(), m;

		if (t1 <= k) {
			m = f1;
		} else {
			m = f1 - (t1 - k);
		}
		while (n-- > 0) {

			int f = in.nextInt(), t = in.nextInt();
			if (t <= k) {
				m = Math.max(m, f);
			} else {
				m = Math.max(m, f - (t - k));
			}
		}
		in.close();
		System.out.println(m);
	}
}

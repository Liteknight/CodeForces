import java.util.Scanner;

public class FibonacciSeg {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), l1 = -1, l2 = -1, i, m = 0, c = 2;
		for (i = 0; i < n; i++) {

			int a = in.nextInt();
			if (i > 1) {
				if (a == l1 + l2) {
					c++;
				} else {
					c = 2;
				}
				m = Math.max(m, c);
			}
			l2 = l1;
			l1 = a;
		}
		in.close();
		System.out.println(Math.max(Math.min(n, 2), m));
	}
}

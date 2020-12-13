import java.util.Scanner;

public class BestSubSeg {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, m = 0, c = 0, l = 0, a[] = new int[n];

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			m = Math.max(m, x);
			a[i] = x;
		}
		for (i = 0; i < n; i++) {
			if (a[i] == m) {
				c++;
			} else {
				l = Math.max(l, c);
				c = 0;
			}
		}
		in.close();
		System.out.println(Math.max(l, c));
	}
}

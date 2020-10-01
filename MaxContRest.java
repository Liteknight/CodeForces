import java.util.Scanner;

public class MaxContRest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0, m = 0, a[] = new int[n * 2];

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			a[i] = a[i + n] = x;
		}
		for (i = 0; i < n * 2; i++) {
			m = Math.max(m, c);

			if (a[i] == 1) {
				c++;

			} else {
				c = 0;
			}
		}
		in.close();
		System.out.println(m);
	}
}

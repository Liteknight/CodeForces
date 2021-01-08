import java.util.Scanner;

public class BurglarMatches {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, c[] = new int[11], t = 0;

		for (i = 0; i < m; i++) {
			int a = in.nextInt(), b = in.nextInt();
			c[b] += a;
		}
		in.close();
		for (i = 10; i > 0; i--) {
			
			if (c[i] > 0) {
				int d = Math.min(n, c[i]);
				t += d * i;
				n -= d;
			}
		}
		System.out.println(t);
	}
}

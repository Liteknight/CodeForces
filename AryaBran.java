import java.util.Scanner;

public class AryaBran {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, c = 0, t = 0, o = -1;

		for (i = 1; i <= n; i++) {
			int a = in.nextInt();
			c += a;
			int x = Math.min(c, 8);
			c -= x;
			t += x;
			if (t >= k) {
				o = i;
				break;
			}
		}
		in.close();
		System.out.println(o);
	}
}

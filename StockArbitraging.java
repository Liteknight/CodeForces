import java.util.Scanner;

public class StockArbitraging {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), r = in.nextInt(), s = 1000, b = 0, i;

		for (i = 0; i < n; i++) {
			s = Math.min(s, in.nextInt());
		}
		for (i = 0; i < m; i++) {
			b = Math.max(b, in.nextInt());
		}
		in.close();

		int x = r / s, y = x * b + r % s;
		System.out.println(y > r ? y : r);
	}
}

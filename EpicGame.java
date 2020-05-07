import java.util.Scanner;

public class EpicGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), n = in.nextInt(), i, r = 0;
		in.close();

		for (i = 0; i < 100; i++) {
			if (i % 2 == 0) {

				int g = gcd(a, n);
				if (n > g) {
					n -= g;
				} else {
					r = 0;
					break;
				}

			} else {

				int g = gcd(b, n);
				if (n > g) {
					n -= g;
				} else {
					r = 1;
					break;
				}
			}
		}
		System.out.println(r);
	}

	private static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}
}

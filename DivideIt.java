import java.util.Scanner;

public class DivideIt {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {
			System.out.println(div(in.nextLong(), 0));
		}
		in.close();
	}

	private static long div(long n, int m) {
		if (n == 1) {
			return m;
		} else if (n % 2 == 0) {
			return div(n / 2, m + 1);
		} else if (n % 3 == 0) {
			return div(2 * n / 3, m + 1);
		} else if (n % 5 == 0) {
			return div(4 * n / 5, m + 1);
		} else {
			return -1;
		}
	}
}

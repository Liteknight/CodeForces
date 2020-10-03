import java.util.Scanner;

public class CookieForYou {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			long a = in.nextLong(), b = in.nextLong(), n = in.nextLong(), m = in.nextLong();
			System.out.println(a + b >= n + m && m <= Math.min(a, b) ? "Yes" : "No");
		}
		in.close();
	}
}

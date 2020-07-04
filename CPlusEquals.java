import java.util.Scanner;

public class CPlusEquals {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			long a = in.nextLong(), b = in.nextLong(), n = in.nextLong(), c = 0;

			while (a <= n && b <= n) {
				if (a > b) {
					b += a;
					c++;
					if (b < n) {
						a += b;
						c++;
					}
				} else {
					a += b;
					c++;
					if (a < n) {
						b += a;
						c++;
					}
				}
			}
			System.out.println(c);
		}
		in.close();
	}
}

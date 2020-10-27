import java.util.Scanner;

public class TempUnavail {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), d = in.nextLong(), x1 = Math.min(a, b),
					x2 = Math.max(a, b);

			long s = Math.abs(a - b), l = Math.max(c - d, x1), r = Math.min(c + d, x2);
			System.out.println(s - Math.max(r - l, 0));
		}
		in.close();
	}
}

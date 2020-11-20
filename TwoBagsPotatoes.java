import java.util.Scanner;

public class TwoBagsPotatoes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long y = in.nextLong(), k = in.nextLong(), n = in.nextLong();
		in.close();

		long x = k - y % k;
		boolean b = true;

		while (x + y <= n) {
			System.out.print(x + " ");
			x += k;
			b = false;
		}
		if (b)
			System.out.println(-1);
	}
}

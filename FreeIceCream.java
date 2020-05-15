import java.util.Scanner;

public class FreeIceCream {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = 0;
		long x = in.nextLong();

		while (n-- > 0) {
			String op = in.next();
			long d = in.nextLong();

			if (op.equals("+")) {
				x += d;
			} else if (d <= x) {
				x -= d;
			} else {
				k++;
			}
		}
		in.close();
		System.out.println(x + " " + k);
	}
}

import java.util.Scanner;

public class RoadZero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long x = in.nextLong(), y = in.nextLong(), a = in.nextLong(), b = in.nextLong(), d = 0;

			if (b < a * 2) {
				long z = Math.min(x, y);
				d += z * b;
				x -= z;
				y -= z;
			}
			System.out.println(d + a * (x + y));
		}
		in.close();
	}
}

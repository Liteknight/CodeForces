import java.util.Scanner;

public class Suits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(), f = in.nextInt(),
				x, y;
		in.close();

		if (e > f) {
			x = Math.min(a, d);
			d -= x;
			y = Math.min(Math.min(b, c), d);
		} else {
			y = Math.min(Math.min(b, c), d);
			d -= y;
			x = Math.min(a, d);
		}
		System.out.println(x * e + y * f);
	}
}

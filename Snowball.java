import java.util.Scanner;

public class Snowball {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int w = in.nextInt(), h = in.nextInt(), u1 = in.nextInt(), d1 = in.nextInt(), u2 = in.nextInt(),
				d2 = in.nextInt(), i;
		in.close();

		for (i = h; i > 0; i--) {
			w+=i;
			if (h == d1) {
				w = Math.max(w - u1, 0);
			} else if (h == d2) {
				w = Math.max(w - u2, 0);
			}
			h--;
		}
		System.out.println(w);
	}
}

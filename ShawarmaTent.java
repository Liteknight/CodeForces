import java.util.Scanner;

public class ShawarmaTent {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int c = in.nextInt(), sx = in.nextInt(), sy = in.nextInt(), i, n = 0, e = 0, s = 0, w = 0;
		for (i = 0; i < c; i++) {
			
			int x = in.nextInt(), y = in.nextInt();
			if (x > sx)
				e++;
			if (x < sx)
				w++;
			if (y > sy)
				n++;
			if (y < sy)
				s++;
		}
		int m = Math.max(Math.max(Math.max(n, e), s), w);
		if (m == w && sx > 0) {
			System.out.println(w + "\n" + (sx - 1) + " " + sy);
		} else if (m == s && sy > 0) {
			System.out.println(s + "\n" + sx + " " + (sy - 1));
		} else if (m == n && sy < Math.pow(10, 9)) {
			System.out.println(n + "\n" + sx + " " + (sy + 1));
		} else {
			System.out.println(e + "\n" + (sx + 1) + " " + sy);
		}
		in.close();
	}
}

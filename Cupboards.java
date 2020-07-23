import java.util.Scanner;

public class Cupboards {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), lo = 0, lc = 0, ro = 0, rc = 0;

		while (n-- > 0) {
			int l = in.nextInt(), r = in.nextInt();

			if (l == 0) {
				lo++;
			} else {
				lc++;
			}
			if (r == 0) {
				ro++;
			} else {
				rc++;
			}
		}
		in.close();
		System.out.println(Math.min(lo, lc) + Math.min(ro, rc));
	}
}

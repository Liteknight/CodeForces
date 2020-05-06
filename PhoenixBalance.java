import java.util.Scanner;

public class PhoenixBalance {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i, d = 0;

			for (i = 1; i < n; i++) {
				int c = (int) Math.pow(2, i);

				if (i < n / 2) {
					d += c;
				} else {
					d -= c;
				}
			}
			System.out.println(d + (int) Math.pow(2, n));
		}
		in.close();
	}
}

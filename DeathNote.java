import java.util.Scanner;

public class DeathNote {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long m = in.nextLong(), c = 0;

		for (i = 0; i < n; i++) {
			long a = in.nextLong(), p = 0;
			c += a;
			if (c >= m) {
				double x = c / m * m;
				c -= x;
				p += x / m;
			}
			System.out.print(p + " ");
		}
		in.close();
	}
}

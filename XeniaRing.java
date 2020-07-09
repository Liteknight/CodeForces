import java.util.Scanner;

public class XeniaRing {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), m = in.nextLong(), i, l = 1, t = 0;

		for (i = 0; i < m; i++) {
			long a = in.nextLong();
			t += (a - l + n) % n;
			l = a;
		}
		in.close();
		System.out.println(t);
	}
}

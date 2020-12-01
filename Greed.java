import java.util.Scanner;

public class Greed {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long s = 0, m1 = 0, m2 = 0;

		for (i = 0; i < n; i++)
			s += in.nextLong();

		for (i = 0; i < n; i++) {
			long b = in.nextLong();
			if (b > m1) {
				m2 = m1;
				m1 = b;
			} else if (b > m2) {
				m2 = b;
			}
		}
		in.close();
		System.out.println(s <= m1 + m2 ? "YES" : "NO");
	}
}

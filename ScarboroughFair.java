import java.util.Scanner;

public class ScarboroughFair {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		@SuppressWarnings("unused")
		int n = in.nextInt(), m = in.nextInt(), i;
		String s = in.next();

		for (i = 0; i < m; i++) {
			int l = in.nextInt() - 1, r = in.nextInt();
			String c1 = in.next(), c2 = in.next();

			s = s.substring(0, l) + s.substring(l, r).replace(c1, c2) + s.substring(r);
		}
		System.out.println(s);
		in.close();
	}
}

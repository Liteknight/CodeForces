import java.util.Scanner;

public class LaunchCollider {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String s = in.next();
		long l = in.nextLong(), m = Long.MAX_VALUE;

		for (i = 1; i < n; i++) {
			long x = in.nextLong();
			if (s.charAt(i - 1) == 'R' && s.charAt(i) == 'L')
				m = Math.min(m, x - l);
			l = x;
		}
		in.close();
		System.out.println(m == Long.MAX_VALUE ? -1 : m / 2);
	}
}

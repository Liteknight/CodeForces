import java.util.Scanner;

public class CombinationLock {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = 0;
		String s = in.next(), c = in.next();
		in.close();

		while (n-- > 0) {
			int d = Math.abs((int) s.charAt(n) - (int) c.charAt(n));
			m += Math.min(d, 10 - d);
		}
		System.out.println(m);
	}
}

import java.util.Scanner;

public class FlagStripe {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, o = 1;
		char l = 'x';

		outer: for (i = 0; i < n; i++) {
			String s = in.next();

			if (s.charAt(0) == l) {
				o = 0;
				break;
			}
			l = s.charAt(0);

			for (j = 1; j < m; j++) {
				if (s.charAt(j) != l) {
					o = 0;
					break outer;
				}
				l = s.charAt(j);
			}
		}
		in.close();
		System.out.println(o == 1 ? "YES" : "NO");
	}
}

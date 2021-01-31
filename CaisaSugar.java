import java.util.Scanner;

public class CaisaSugar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), s = in.nextInt(), i, m = -1;

		for (i = 0; i < n; i++) {
			int x = in.nextInt(), y = in.nextInt();

			if (x < s) {
				m = y != 0 ? Math.max(m, 100 - y) : Math.max(m, 0);
			} else if (x == s && y == 0) {
				m = Math.max(m, 0);
			}
		}
		in.close();
		System.out.println(m);
	}
}

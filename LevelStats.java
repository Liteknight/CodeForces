import java.util.Scanner;

public class LevelStats {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, lp = 0, lc = 0, x = 0;
			for (i = 0; i < n; i++) {
				int p = in.nextInt(), c = in.nextInt(), dp = p - lp, dc = c - lc;

				if (dp < 0 || dc < 0 || dc > dp)
					x = 1;
				lp = p;
				lc = c;
			}
			System.out.println(x == 0 ? "YES" : "NO");
		}
		in.close();
	}
}

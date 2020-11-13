import java.util.Scanner;

public class LilElephantRozdil {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j = 0, c = 0;
		long m = Long.MAX_VALUE;

		for (i = 1; i <= n; i++) {
			long a = in.nextLong();
			if (a < m) {
				j = i;
				m = a;
				c = 1;
			} else if (a == m) {
				c++;
			}
		}
		in.close();
		System.out.println(c == 1 ? j : "Still Rozdil");
	}
}

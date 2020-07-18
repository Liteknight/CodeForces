import java.util.Scanner;

public class ExtraPoint {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = 0, p = 0;
		while (n-- > 0) {
			int x = in.nextInt(), y = in.nextInt();

			if (x > 0) { p++; } else if (x < 0) { m++; }
		}
		in.close();
		System.out.println(m == 0 || m == 1 || p == 0 || p == 1 ? "YES" : "NO");
	}
}

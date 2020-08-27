import java.util.Scanner;

public class KingRace {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), x = in.nextLong(), y = in.nextLong(), wd = Math.min(x - 1, y - 1),
				bd = Math.min(n - x, n - y), wr = Math.max(x - 1, y - 1) - wd, br = Math.max(n - x, n - y) - bd;
		in.close();
		System.out.println(wd + wr <= bd + br ? "White" : "Black");
	}
}

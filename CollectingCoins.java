import java.util.Scanner;

public class CollectingCoins {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), n = in.nextInt(),
					max = Math.max(Math.max(a, b), c), s = a + b + c + n;

			System.out.println(s % 3 == 0 && s / 3 >= max ? "YES" : "NO");
		}
		in.close();

	}
}

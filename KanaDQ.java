import java.util.Scanner;

public class KanaDQ {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int x = in.nextInt(), n = in.nextInt(), m = in.nextInt();

			while (n > 0 && x / 2 + 10 < x) {
				x = x / 2 + 10;
				n--;
			}
			while (m > 0) {
				x -= 10;
				m--;
			}
			System.out.println(x < 1 ? "YES" : "NO");
		}
		in.close();
	}
}

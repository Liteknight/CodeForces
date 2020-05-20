import java.util.Scanner;

public class Grapes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		in.close();
		String o = "NO";

		if (a - x >= 0) {
			int g = a - x + b;

			if (g - y >= 0) {
				g += c - y;

				if (g - z >= 0) {
					o = "YES";
				}
			}
		}
		System.out.println(o);
	}
}

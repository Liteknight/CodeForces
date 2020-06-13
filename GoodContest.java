import java.util.Scanner;

public class GoodContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean g = false;

		while (n-- > 0 && !g) {
			String s = in.next();
			int b = in.nextInt(), a = in.nextInt();

			if (b >= 2400 && a > b) {
				g = true;
			}
		}
		in.close();
		System.out.println(g ? "YES" : "NO");
	}
}

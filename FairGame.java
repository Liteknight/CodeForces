import java.util.Scanner;

public class FairGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a1 = -1, a2 = -1, c1 = 0, c2 = 0, x = 0;
		for (i = 0; i < n; i++) {
			int a = in.nextInt();

			if (a1 == -1 || a == a1) {
				a1 = a;
				c1++;
			} else if (a2 == -1 || a == a2) {
				a2 = a;
				c2++;
			} else {
				x = 1;
				break;
			}
		}
		in.close();
		System.out.println(x == 0 && c1 == c2 ? "YES\n" + a1 + " " + a2 : "NO");
	}
}

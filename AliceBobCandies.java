import java.util.Scanner;

public class AliceBobCandies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, a[] = new int[n], alice = 0, bob = 0, ai = 0, bi = n - 1, at = 0, bt = 0, m = 0;
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();

			while (ai <= bi) {
				m++;
				if (m % 2 != 0) {

					alice = 0;
					while (ai <= bi && alice <= bob) {
						alice += a[ai];
						ai++;
					}
					at += alice;
				} else {

					bob = 0;
					while (ai <= bi && bob <= alice) {
						bob += a[bi];
						bi--;
					}
					bt += bob;
				}
			}
			System.out.println(m + " " + at + " " + bt);
		}
		in.close();
	}
}

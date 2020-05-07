import java.util.Scanner;

public class ArrayWithOddSum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			boolean o = false, e = false, l = n % 2 != 0;

			while (n-- > 0) {
				if (in.nextInt() % 2 == 0) {
					e = true;
				} else {
					o = true;
				}
			}
			System.out.println((o && e) || (o && l) ? "YES" : "NO");
		}
		in.close();
	}
}

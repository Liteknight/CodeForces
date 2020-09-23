import java.util.Scanner;

public class OddSelection {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), x = in.nextInt(), e = 0, o = 0, i;

			for (i = 0; i < n; i++) {
				if (in.nextInt() % 2 == 0)
					e++;
				else
					o++;
			}
			System.out.println(o < 1 || (x % 2 == 0 && e < 1) || (x == n && o % 2 == 0) ? "No" : "Yes");
		}
		in.close();
	}
}

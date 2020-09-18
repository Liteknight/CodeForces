import java.util.Scanner;

public class YATetrisP {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), i, o = 0;
			for (i = 0; i < n; i++) {

				if (in.nextInt() % 2 != 0)
					o++;
			}
			System.out.println(o == 0 || o == n ? "YES" : "NO");
		}
		in.close();
	}
}

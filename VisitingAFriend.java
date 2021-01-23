import java.util.Scanner;

public class VisitingAFriend {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, l = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt();

			if (a > l) {
				System.out.println("NO");
				return;
			}
			l = Math.max(l, b);
		}
		in.close();
		System.out.println(l >= m ? "YES" : "NO");
	}
}

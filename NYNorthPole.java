import java.util.Scanner;

public class NYNorthPole {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, d = 0;
		String o = "YES";

		for (i = 0; i < n; i++) {
			int t = in.nextInt();
			String s = in.next();

			if (d <= 0 && !s.equals("South") || (d >= 20000 && !s.equals("North")) || d > 20000 || d < 0) {
				o = "NO";
				break;
			}
			if (s.equals("South"))
				d += t;
			if (s.equals("North"))
				d -= t;
		}
		in.close();
		System.out.println(d == 0 ? o : "NO");
	}
}

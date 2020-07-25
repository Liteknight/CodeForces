import java.util.Scanner;

public class OstapGrasshopper {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), g = 0, t = 0, i;
		String s = in.next(), o = "NO";
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) == 'G') {
				g = i;
			} else if (s.charAt(i) == 'T') {
				t = i;
			}
		}
		if (g < t) {
			for (i = g; i <= t; i += k) {
				if (s.charAt(i) == '#') {
					break;
				} else if (i == t) {
					o = "YES";
				}
			}
		} else {
			for (i = g; i >= t; i -= k) {
				if (s.charAt(i) == '#') {
					break;
				} else if (i == t) {
					o = "YES";
				}
			}
		}
		System.out.println(o);
	}
}

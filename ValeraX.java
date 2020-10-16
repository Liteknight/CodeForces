import java.util.Scanner;

public class ValeraX {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, o = 1;
		char d = ' ', e = ' ';

		for (i = 0; i < n; i++) {
			String s = in.next();
			for (j = 0; j < n; j++) {

				if (i == j || i == n - j - 1) {
					if (d == ' ') {
						d = s.charAt(j);
					} else if (d != s.charAt(j)) {
						o = 0;
					}
				} else {
					if (e == ' ') {
						e = s.charAt(j);
					} else if (e != s.charAt(j)) {
						o = 0;
					}
				}
			}
		}
		in.close();
		System.out.println(o == 1 && d != e ? "YES" : "NO");
	}
}

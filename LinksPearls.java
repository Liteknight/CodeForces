import java.util.Scanner;

public class LinksPearls {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int p = 0, l = 0, i;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				p++;
			} else {
				l++;
			}
		}
		in.close();
		System.out.println(p == 0 || l % p == 0 ? "YES" : "NO");
	}
}

import java.util.Scanner;

public class ComparingStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s1 = in.next(), s2 = in.next();
		in.close();
		int c = 0, i, x1 = -1, x2 = -1;

		for (i = 0; i < Math.min(s1.length(), s2.length()); i++)
			if (s1.charAt(i) != s2.charAt(i)) {
				c++;
				if (x1 == -1) {
					x1 = s1.charAt(i);
					x2 = s2.charAt(i);
				} else if (x1 != s2.charAt(i) || x2 != s1.charAt(i)) {
					c++;
				}
			}
		System.out.println(s1.length() == s2.length() && (c == 0 || c == 2) ? "YES" : "NO");
	}
}

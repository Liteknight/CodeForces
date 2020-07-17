import java.util.Scanner;

public class RLCipher {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String t = in.next(), s = "";
		in.close();

		int h = t.length() % 2 == 0 ? t.length() / 2 - 1 : t.length() / 2, i = 1;
		s += t.charAt(h);

		while (s.length() < t.length()) {
			if (h + i < t.length())
				s += t.charAt(h + i);
			if (i <= h)
				s += t.charAt(h - i);
			i++;
		}
		System.out.println(s);
	}
}

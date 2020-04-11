import java.util.Scanner;

public class Translation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), t = in.next(), msg = "YES";

		for (int i = 0; i < s.length(); i++) {

			if (s.length() != t.length() || s.charAt(i) != t.charAt(s.length() - i - 1)) {
				msg = "NO";
			}
		}
		System.out.println(msg);
		in.close();
	}
}

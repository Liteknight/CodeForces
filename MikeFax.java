import java.util.Scanner;

public class MikeFax {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt(), i, l = s.length() / k;
		in.close();

		if (s.length() % k != 0) {
			System.out.println("NO");
			return;
		}
		for (i = 0; i < s.length(); i += l)
			if (!isP(s.substring(i, l + i))) {
				System.out.println("NO");
				return;
			}
		System.out.println("YES");
	}

	private static boolean isP(String s) {
		if (s.length() < 2)
			return true;
		return s.charAt(0) == s.charAt(s.length() - 1) && isP(s.substring(1, s.length() - 1));
	}
}

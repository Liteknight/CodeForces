import java.util.Scanner;

public class PhoneCode {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), l = 0, i;
		String s[] = new String[n];

		for (i = 0; i < n; i++) {
			s[i] = in.next();
		}
		in.close();
		boolean a = true;
		while (l < s[0].length() && a) {
			char c = s[0].charAt(l);

			for (i = 1; i < n; i++) {
				if (s[i].charAt(l) != c) {
					a = false;
					break;
				}
			}
			l++;
		}
		System.out.println(l - 1);
	}
}

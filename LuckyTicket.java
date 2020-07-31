import java.util.Scanner;

public class LuckyTicket {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s1 = 0, s2 = 0;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) != '4' && s.charAt(i) != '7') {
				s1 += 100;

			} else if (s.charAt(i) == '4') {
				if (i < n / 2) {
					s1 += 4;
				} else {
					s2 += 4;
				}
			} else {
				if (i < n / 2) {
					s1 += 7;
				} else {
					s2 += 7;
				}
			}
		}
		System.out.println(s1 == s2 ? "YES" : "NO");
	}
}

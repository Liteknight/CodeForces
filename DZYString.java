import java.util.Scanner;

public class DZYString {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt(), i, a[] = new int[26], v = 0, m = 0;

		for (i = 0; i < 26; i++) {
			a[i] = in.nextInt();
			m = Math.max(m, a[i]);
		}
		in.close();

		for (i = 1; i <= s.length() + k; i++)
			if (i <= s.length()) {
				v += a[s.charAt(i - 1) - 97] * i;
			} else {
				v += m * i;
			}
		System.out.println(v);
	}
}

import java.util.Scanner;

public class SubStrRemGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			String s = in.next();
			int a[] = new int[s.length() + 1], i, c = 0, m = 0, r = 0;

			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					c++;
				} else {
					a[c]++;
					c = 0;
				}
			}
			a[c]++;
			for (i = s.length(); i >= 0; i--) {
				while (a[i] > 0) {
					if (m == 0) {
						r += i;
					}
					a[i]--;
					m = 1 - m;
				}
			}
			System.out.println(r);
		}
		in.close();
	}
}

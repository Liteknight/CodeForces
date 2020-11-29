import java.util.Scanner;

public class Passwords {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, a[] = new int[110], y = 0, w = 0, b = 1, t = 0;
		String s[] = new String[n];

		for (i = 0; i < n; i++) {
			String x = in.next();
			a[x.length()]++;
			s[i] = x;
		}
		String p = in.next();
		in.close();

		for (i = 0; i < n; i++)
			if (s[i].equals(p)) {
				y = s[i].length();
				break;
			}

		for (i = 0; i < y; i++)
			while (a[i] > 0) {
				a[i]--;
				t++;
				if (t == k) {
					b += 6;
					t = 0;
				} else {
					b++;
				}
			}
		while (a[y] > 1) {
			a[i]--;
			t++;
			if (t == k) {
				w += 6;
				t = 0;
			} else {
				w++;
			}
		}
		System.out.println(b + " " + (b + w));
	}
}

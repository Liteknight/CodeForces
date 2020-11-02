import java.util.Scanner;

public class AppleStorage {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[100001], c[] = new int[100001];
		for (i = 0; i < n; i++) {

			int x = in.nextInt();
			a[x]++;
			c[a[x]]++;
		}
		int q = in.nextInt();
		while (q-- > 0) {

			String s = in.next();
			int x = in.nextInt();

			if (s.equals("+")) {
				a[x]++;
				c[a[x]]++;
			} else {
				c[a[x]]--;
				a[x]--;
			}
			System.out.println(c[8] > 0 || (c[6] > 0 && c[2] > 1) || c[4] > 1 || (c[4] > 0 && c[2] > 2) ? "YES" : "NO");
		}
		in.close();
	}
}

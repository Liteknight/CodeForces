import java.util.Scanner;

public class YACrossesP {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {

			int n = in.nextInt(), m = in.nextInt(), i, j, a[] = new int[n], b[] = new int[m], o = Integer.MAX_VALUE;
			String s[] = new String[n];

			for (i = 0; i < n; i++) {
				s[i] = in.next();
				for (j = 0; j < m; j++) {

					if (s[i].charAt(j) == '*') {
						a[i]++;
						b[j]++;
					}
				}
			}
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {

					int x = n - a[i] + m - b[j];
					if (s[i].charAt(j) == '.')
						x--;
					o = Math.min(o, x);
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}

import java.util.Scanner;

public class CrossCounting {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, c = 0;
		String[] a = new String[n];

		for (i = 0; i < n; i++) {
			a[i] = in.next();
		}
		in.close();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				char y = a[i].charAt(j);
				try {
					if (y == 'X' && a[i - 1].charAt(j - 1) == y && a[i - 1].charAt(j + 1) == y
							&& a[i + 1].charAt(j - 1) == y && a[i + 1].charAt(j + 1) == y) {
						c++;
					}
				} catch (Exception e) {
				}
			}
		}
		System.out.println(c);
	}
}

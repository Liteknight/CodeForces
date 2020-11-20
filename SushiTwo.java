import java.util.Scanner;

public class SushiTwo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], i, m = 0;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 1; i < n; i++) {
			if (a[i - 1] != a[i]) {
				int j = 1, l = 1, r = 1;

				while (i - j > 0 && a[i - 1 - j] == a[i - 1]) {
					j++;
					l++;
				}
				j = 1;
				while (i + j < n && a[i + j] == a[i]) {
					j++;
					r++;
				}
				m = Math.max(m, Math.min(l, r) * 2);
			}
		}
		System.out.println(m);
	}
}

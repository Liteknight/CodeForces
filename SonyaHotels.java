import java.util.Scanner;

public class SonyaHotels {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), d = in.nextInt(), i, a[] = new int[n], c = 0, l = -1;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 0; i < n; i++) {
			if (i == 0 || (i > 0 && a[i] - d >= a[i - 1] + d && a[i] - d != l)) {
				c++;
				l = a[i] - d;
			}
			if (i == n - 1 || (i < n - 1 && a[i] + d <= a[i + 1] - d && a[i] + d != l)) {
				c++;
				l = a[i] + d;
			}
		}
		System.out.println(c);
	}
}

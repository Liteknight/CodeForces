import java.util.Scanner;

public class LocalExtrema {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], i, c = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 1; i < n - 1; i++) {
			if ((a[i] > a[i - 1] && a[i] > a[i + 1]) || (a[i] < a[i - 1] && a[i] < a[i + 1])) {
				c++;
			}
		}
		in.close();
		System.out.println(c);
	}
}

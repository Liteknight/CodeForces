import java.util.Arrays;
import java.util.Scanner;

public class ABCompError {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], b[] = new int[n - 1], c[] = new int[n - 2], i;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			b[i] = in.nextInt();
		}
		for (i = 0; i < n - 2; i++) {
			c[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		for (i = 0; i < n; i++) {
			if (i == n - 1 || a[i] != b[i]) {
				System.out.println(a[i]);
				break;
			}
		}
		for (i = 0; i < n - 1; i++) {
			if (i == n - 2 || b[i] != c[i]) {
				System.out.println(b[i]);
				break;
			}
		}
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, val = 0, c = 0, t = 0;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			int x = in.nextInt();

			a[i] = x;
			t += x;
		}
		Arrays.sort(a);
		for (i = n - 1; i >= 0; i--) {

			val += a[i];
			c++;

			if (val > t / 2) {
				break;
			}
		}
		in.close();
		System.out.println(c);
	}
}

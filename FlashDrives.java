import java.util.Arrays;
import java.util.Scanner;

public class FlashDrives {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long m = in.nextLong(), s = 0, d = 0;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);

		for (i = n - 1; i >= 0; i--) {
			s += a[i];
			d++;
			if (s >= m) {
				break;
			}
		}
		System.out.println(d);
	}
}

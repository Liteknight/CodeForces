import java.util.Arrays;
import java.util.Scanner;

public class KuroniGifts {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i;
			int[] a = new int[n], b = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for (i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);

			for (i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			for (i = 0; i < n; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}

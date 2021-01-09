import java.util.Arrays;
import java.util.Scanner;

public class Airport {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[m], b[] = new int[m], max = 0, min = 0;

		for (i = 0; i < m; i++)
			a[i] = b[i] = in.nextInt();
		in.close();

		Arrays.sort(a);
		Arrays.sort(b);

		while (n > 0) {
			max += a[m - 1];
			a[m - 1]--;
			for (i = 0; i < m; i++) {

				if (b[i] > 0) {
					min += b[i];
					b[i]--;
					break;
				}
			}
			Arrays.sort(a);
			Arrays.sort(b);
			n--;
		}
		System.out.println(max + " " + min);
	}
}

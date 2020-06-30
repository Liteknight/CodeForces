import java.util.Arrays;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, c = 1;
			int[] a = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.parallelSort(a);
			for (i = 1; i < n; i++) {
				
				if (a[i] - a[i - 1] > 0) {
					c++;
				}
			}
			System.out.println(c);
		}
		in.close();
	}
}

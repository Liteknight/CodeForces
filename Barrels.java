import java.util.Arrays;
import java.util.Scanner;

public class Barrels {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), k = in.nextInt(), i;
			Integer a[] = new Integer[n];
			
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();

			Arrays.sort(a);
			long m = a[n - 1];

			for (i = 2; i < k + 2; i++)
				m += a[n - i];
			System.out.println(m);
		}
		in.close();
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class ArrRearr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), x = in.nextInt(), a[] = new int[n], b[] = new int[n], i;
			String o = "Yes";

			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			for (i = 0; i < n; i++)
				b[i] = in.nextInt();

			Arrays.sort(a);
			Arrays.sort(b);

			for (i = 0; i < n; i++)
				if (a[i] + b[n - i - 1] > x) {
					o = "No";
					break;
				}
			System.out.println(o);
		}
		in.close();
	}
}

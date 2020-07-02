import java.util.Arrays;
import java.util.Scanner;

public class YetDivTeams {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i, o = 1;
			int[] a = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (i = 1; i < n; i++) {
				
				if (a[i] - a[i - 1] < 2) {
					o++;
					break;
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}

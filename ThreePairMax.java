import java.util.Arrays;
import java.util.Scanner;

public class ThreePairMax {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int a[] = new int[3], i;
			for (i = 0; i < 3; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[1] == a[2] ? "YES\n" + a[0] + " " + a[0] + " " + a[1] : "NO");
		}
		in.close();
	}
}

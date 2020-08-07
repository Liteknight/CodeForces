import java.util.Arrays;
import java.util.Scanner;

public class SecOrdStat {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], i;
		String o = "NO";

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);

		for (i = 1; i < n; i++) {
			if (a[i] > a[i - 1]) {
				o = String.valueOf(a[i]);
				break;
			}
		}
		System.out.println(o);
	}
}

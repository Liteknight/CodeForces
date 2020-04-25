import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s = in.nextInt(), n = in.nextInt(), i;
		int[][] a = new int[n][2];
		String out = "YES";

		for (i = 0; i < n; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
		}
		in.close();
		Arrays.sort(a, Comparator.comparingDouble(o -> o[0]));

		for (i = 0; i < n; i++) {
			if (s > a[i][0]) {
				s += a[i][1];
				
			} else {
				out = "NO";
				break;
			}
		}
		System.out.println(out);
	}
}

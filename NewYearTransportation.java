import java.util.Scanner;

public class NewYearTransportation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), j, i = 1;
		int[] a = new int[n];
		String o = "NO";

		for (j = 1; j < n; j++) { a[j] = in.nextInt(); }
		
		in.close();
		while (i < t) {

			i += a[i];
			if (i == t) { o = "YES"; }
		}
		System.out.println(o);
	}
}

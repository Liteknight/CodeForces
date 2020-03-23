import java.util.Scanner;

public class NastyaReadingBook {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, chap = 0;
		int[][] a = new int[n][2];

		for (i = 0; i < n; i++) {
			int l = in.nextInt(), r = in.nextInt();

			a[i][0] = l;
			a[i][1] = r;
		}
		int k = in.nextInt();

		for (i = 0; i < n; i++) {
			if (k >= a[i][0] && k <= a[i][1]) {
				chap = i;
			}
		}
		System.out.println(n - chap);
		in.close();
	}
}

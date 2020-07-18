import java.util.Scanner;

public class Beecola {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x[] = new int[100001], i;

		for (i = 0; i < n; i++) {
			x[in.nextInt()]++;
		}
		for (i = 1; i < 100001; i++) {
			x[i] += x[i - 1];
		}
		int q = in.nextInt();
		while (q-- > 0) {

			int m = in.nextInt();
			System.out.println(m > 100000 ? n : x[m]);
		}
		in.close();
	}
}

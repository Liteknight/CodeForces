import java.util.Scanner;

public class DetermineLine {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[101], i, j;

		for (i = 0; i < n; i++) {
			int r = in.nextInt();

			for (j = 0; j < r; j++)
				a[in.nextInt()]++;
		}
		for (i = 0; i < 101; i++) {
			System.out.print(a[i] == n ? i + " " : "");
		}
		in.close();
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Shooting {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[][] = new int[n][2], s = 0;

		for (i = 0; i < n; i++) {
			a[i][0] = i + 1;
			a[i][1] = in.nextInt();
		}
		in.close();
		Arrays.sort(a, (int x[], int y[]) -> {
			return y[1] - x[1];
		});
		for (i = 0; i < n; i++)
			s += i * a[i][1] + 1;

		System.out.println(s);
		for (i = 0; i < n; i++)
			System.out.print(a[i][0] + " ");
	}
}

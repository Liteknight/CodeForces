import java.util.Scanner;

public class VityaCountry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		if (a[n - 1] == 15) {
			System.out.println("DOWN");
		} else if (a[n - 1] == 0) {
			System.out.println("UP");
		} else if (n == 1) {
			System.out.println(-1);
		} else {
			System.out.println(a[n - 1] - a[n - 2] > 0 ? "UP" : "DOWN");
		}
	}
}

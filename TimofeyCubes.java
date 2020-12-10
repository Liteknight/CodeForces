import java.util.Scanner;

public class TimofeyCubes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();

		in.close();
		for (i = 0; i < n / 2; i += 2) {
			int t = a[n - i - 1];
			a[n - i - 1] = a[i];
			a[i] = t;
		}
		for (int j : a)
			System.out.print(j + " ");
	}
}

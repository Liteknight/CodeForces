import java.util.Scanner;

public class BearRaspberry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), c = in.nextInt(), a[] = new int[n], i, t = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (i > 0)
				t = Math.max(t, a[i - 1] - a[i]);
		}
		in.close();
		System.out.println(Math.max(0, t - c));
	}
}

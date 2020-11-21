import java.util.Scanner;

public class Pillars {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], o = 0;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 1; i < n - 1; i++)
			if (a[i] < a[i - 1] && a[i] < a[i + 1])
				o = 1;
		System.out.println(o == 0 ? "YES" : "NO");
	}
}

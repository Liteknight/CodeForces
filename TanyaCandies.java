import java.util.Scanner;

public class TanyaCandies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n + 2], l[] = new int[n + 2], r[] = new int[n + 2], o = 0;

		for (i = 1; i <= n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 1; i <= n; i++)
			l[i] = l[i - 1] + (i % 2 == 0 ? a[i] : -a[i]);
		for (i = n; i > 0; i--)
			r[i] = r[i + 1] + (i % 2 == 0 ? a[i] : -a[i]);

		for (i = 1; i <= n; i++)
			if (l[i - 1] - r[i + 1] == 0)
				o++;
		System.out.println(o);
	}
}

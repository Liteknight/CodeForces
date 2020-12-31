import java.util.Scanner;

public class RomanBrowser {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j, a[] = new int[n], o = 0;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 0; i < k; i++) {
			int s = 0;
			for (j = 0; j < n; j++) {
				if (j % k != i)
					s += a[j];
			}
			o = Math.max(o, Math.abs(s));
		}
		System.out.println(o);
	}
}

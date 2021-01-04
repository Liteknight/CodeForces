import java.util.Scanner;

public class ChatOnline {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int p = in.nextInt(), q = in.nextInt(), l = in.nextInt(), r = in.nextInt(), i, j, a[] = new int[1001],
				b[] = new int[1001], o = 0;

		for (i = 0; i < p; i++) {
			int x = in.nextInt(), y = in.nextInt();
			for (j = x; j <= y; j++)
				a[j]++;
		}
		for (i = 0; i < q; i++) {
			int x = in.nextInt(), y = in.nextInt();
			for (j = x; j <= y; j++)
				b[j]++;
		}
		for (i = l; i <= r; i++)
			for (j = 0; j < 1001 - i; j++)

				if (a[i + j] > 0 && b[j] > 0) {
					o++;
					break;
				}
		in.close();
		System.out.println(o);
	}
}

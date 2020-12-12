import java.util.Scanner;

public class BigSegment {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = Integer.MAX_VALUE, y = 0, a[] = new int[n], b[] = new int[n], o = -1;

		for (i = 0; i < n; i++) {
			int l = in.nextInt(), r = in.nextInt();
			x = Math.min(x, l);
			y = Math.max(y, r);
			a[i] = l;
			b[i] = r;
		}
		in.close();
		for (i = 0; i < n; i++)
			if (a[i] == x && b[i] == y) {
				o = i + 1;
				break;
			}
		System.out.println(o);
	}
}

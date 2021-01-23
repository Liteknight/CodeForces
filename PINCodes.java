import java.util.Scanner;

public class PINCodes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), b[] = new int[10000], i, j, o = 0;
			String a[] = new String[n], y = "";

			for (i = 0; i < n; i++) {
				a[i] = in.next();
				b[Integer.valueOf(a[i])]++;
			}

			for (i = 0; i < n; i++) {
				if (b[Integer.valueOf(a[i])] > 1) {

					b[Integer.valueOf(a[i])]--;
					o++;

					for (j = 0; j < 10; j++) {
						String x = j + a[i].substring(1);
						if (b[Integer.valueOf(x)] == 0) {

							y += "\n" + x;
							b[Integer.valueOf(x)]++;
							break;
						}
					}
				} else {
					y += "\n" + a[i];
				}
			}
			System.out.println(o + y);
		}
		in.close();
	}
}

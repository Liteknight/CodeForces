import java.util.Scanner;

public class DigitGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, w;
			char[] a = in.next().toCharArray();

			if (n % 2 == 0) {
				w = 1;
				for (i = 1; i < n; i += 2)
					if ((a[i] - '0') % 2 == 0) {
						w = 2;
						break;
					}

			} else {
				w = 2;
				for (i = 0; i < n; i += 2)
					if ((a[i] - '0') % 2 != 0) {
						w = 1;
						break;
					}
			}
			System.out.println(w);
		}
		in.close();
	}
}

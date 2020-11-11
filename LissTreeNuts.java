import java.util.Scanner;

public class LissTreeNuts {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = in.nextInt();
		long t = l + 1;

		for (i = 1; i < n; i++) {
			int h = in.nextInt(), x = h - l;
			if (x >= 0) {
				t += x + 2;
			} else {
				t += -x + 2;
			}
			l = h;
		}
		in.close();
		System.out.println(t);
	}
}

import java.util.Scanner;

public class BearTVGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 0;

		for (i = 0; i < n; i++) {
			int t = in.nextInt();
			if (t - l > 15) {
				break;
			} else {
				l = t;
			}
		}
		in.close();
		System.out.println(Math.min(l + 15, 90));
	}
}

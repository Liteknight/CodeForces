import java.util.Scanner;

public class QueueBusStop {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, o = 1, c = m;
		for (i = 0; i < n; i++) {

			int a = in.nextInt();
			if (a <= c) {
				c -= a;
			} else {
				o++;
				c = m - a;
			}
		}
		in.close();
		System.out.println(o);
	}
}

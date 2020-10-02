import java.util.Scanner;

public class JzzhuChildren {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), l = 0, i;
		double m = in.nextDouble(), t = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (Math.ceil(a / m) >= t) {
				t = Math.ceil(a / m);
				l = i;
			}
		}
		in.close();
		System.out.println(l + 1);
	}
}

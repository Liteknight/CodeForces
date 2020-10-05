import java.util.Scanner;

public class Juicer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), b = in.nextInt(), d = in.nextInt(), s = 0, o = 0;

		while (n-- > 0) {
			int a = in.nextInt();
			if (a <= b)
				s += a;
			if (s > d) {
				s = 0;
				o++;
			}
		}
		in.close();
		System.out.println(o);
	}
}

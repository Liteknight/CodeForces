import java.util.Scanner;

public class Cookies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, e = 0, o = 0, s = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			s += a;
			if (a % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		in.close();
		System.out.println(s % 2 == 0 ? e : o);
	}
}

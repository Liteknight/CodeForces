import java.util.Scanner;

public class UnimodalArr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = in.nextInt();
		boolean y = false, z = false, o = true;

		for (i = 1; i < n; i++) {
			int a = in.nextInt();

			if (a > l) {
				if (y || z)
					o = false;
			} else if (a == l) {
				if (z)
					o = false;
				y = true;
			} else {
				y = true;
				z = true;
			}
			l = a;
		}
		in.close();
		System.out.println(o ? "YES" : "NO");
	}
}

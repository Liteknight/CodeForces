import java.util.Scanner;

public class Draw {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 0, y = 0, o = 1;

		for (i = 0; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt();
			
			o += Math.max(0, Math.min(a, b) - Math.max(x, y) + (x != y ? 1 : 0));
			x = a;
			y = b;
		}
		in.close();
		System.out.println(o);
	}
}

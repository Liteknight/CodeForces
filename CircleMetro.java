import java.util.Scanner;

public class CircleMetro {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), x = in.nextInt(), b = in.nextInt(), y = in.nextInt();
		in.close();

		boolean b1 = true, b2 = true, o = false;

		while (b1 && b2) {
			a++;
			if (a > n)
				a = 1;
			if (a == x)
				b1 = false;
			b--;
			if (b < 1)
				b = n;
			if (b == y)
				b2 = false;
			if (a == b)
				o = true;
		}
		System.out.println(o ? "YES" : "NO");
	}
}

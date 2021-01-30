import java.util.Scanner;

public class GourmetCat {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), i, o = 0,
				mw = Math.min(Math.min(a / 3, b / 2), c / 2), x[] = { 2, 1, 1, 2, 3, 1, 3, 2, 1, 1, 2, 3, 1, 3 };
		in.close();

		a -= mw * 3;
		b -= mw * 2;
		c -= mw * 2;

		for (i = 0; i < 7; i++) {
			int y = 0, j = i, ai = a, bi = b, ci = c;
			while (true) {

				if (x[j] == 1)
					ai--;
				else if (x[j] == 2)
					bi--;
				else
					ci--;
				if (ai < 0 || bi < 0 || ci < 0)
					break;

				j++;
				y++;
			}
			o = Math.max(o, y);
		}
		System.out.println(mw * 7 + o);
	}
}

import java.util.Scanner;

public class BitPP {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), i, x = 0;

		for (i = 0; i < n; i++) {
			String s = in.next();

			if (s.indexOf('+') > -1) {
				x++;
			} else { x--; }
		}
		System.out.println(x);
		in.close();
	}
}

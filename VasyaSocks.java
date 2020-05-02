import java.util.Scanner;

public class VasyaSocks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), c = 0, d = 0;
		in.close();

		while (n-- > 0) {
			c++;
			if (c % m == 0) {
				n++;
				c = 0;
			}
			d++;
		}
		System.out.println(d);
	}
}

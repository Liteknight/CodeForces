import java.util.Scanner;

public class JohnAncientComp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long a = in.nextLong(), b = in.nextLong(), o = 0, x = Math.min(a, b), y = Math.max(a, b);

			while (x < y) {
				x *= 8;
				o++;
			}
			System.out.println(x == y || x / 2 == y || x / 4 == y ? o : -1);
		}
		in.close();
	}
}

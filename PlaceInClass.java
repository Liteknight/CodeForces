import java.util.Scanner;

public class PlaceInClass {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt(), x, y, z;

		outer: for (x = 1; x <= n; x++) {
			for (y = 1; y <= m; y++) {
				for (z = 0; z < 2; z++) {

					k--;
					if (k <= 0) {
						System.out.println(z == 0 ? x + " " + y + " L" : x + " " + y + " R");
						break outer;
					}
				}
			}
		}
		in.close();
	}
}

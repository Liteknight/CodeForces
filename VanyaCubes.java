import java.util.Scanner;

public class VanyaCubes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 0, c = 0;

		for (i = 1; i <= n; i++) {
			l += i;

			if (c + l == n) {
				System.out.println(i);
				break;
				
			} else if (c + l > n) {
				System.out.println(i - 1);
				break;
			}
			c += l;
		}
		in.close();
	}
}

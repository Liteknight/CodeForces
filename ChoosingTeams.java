import java.util.Scanner;

public class ChoosingTeams {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), k = in.nextInt(), i, c = 0, t = 0;

		for (i = 0; i < n; i++) {
			if (in.nextInt() + k < 6) {
				c++;
				if (c > 2) {
					t++;
					c = 0;
				}
			}
		}
		in.close();
		System.out.println(t);
	}
}

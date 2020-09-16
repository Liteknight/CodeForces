import java.util.Scanner;

public class CinemaLine {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 0, y = 0, o = 0;
		for (i = 0; i < n; i++) {

			int a = in.nextInt();
			if (a == 25) {
				x++;
			} else if (a == 50) {
				y++;
				x--;
			} else if (y > 0) {
				y--;
				x--;
			} else {
				x -= 3;
			}
			if (x < 0 || y < 0)
				o = 1;
		}

		in.close();
		System.out.println(o == 0 ? "YES" : "NO");
	}
}

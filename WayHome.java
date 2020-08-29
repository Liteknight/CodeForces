import java.util.Scanner;

public class WayHome {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), d = in.nextInt(), x = 0, j = 0;
		String s = in.next();
		in.close();

		while (x < n - 1 && j < 105) {
			x += d;
			while (s.charAt(Math.min(x, n - 1)) != '1') {
				x--;
			}
			j++;
		}
		System.out.println(j < 105 ? j : -1);
	}
}

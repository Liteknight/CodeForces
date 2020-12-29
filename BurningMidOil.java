import java.util.Scanner;

public class BurningMidOil {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), x = (int) ((1 - 1.0 / k) * n + 1);
		in.close();

		while (true) {
			int o = 0, v = x;
			while (x > 0) {
				o += x;
				x /= k;
			}
			if (o >= n) {
				System.out.println(v);
				return;
			}
			x = v + 1;
		}
	}
}

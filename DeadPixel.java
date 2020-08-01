import java.util.Scanner;

public class DeadPixel {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), x = in.nextInt(), y = in.nextInt();
			System.out.println(Math.max(Math.max(Math.max((a - x - 1) * b, x * b), (b - y - 1) * a), y * a));
		}
		in.close();
	}
}

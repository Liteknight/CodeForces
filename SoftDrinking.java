import java.util.Scanner;

public class SoftDrinking {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), l = in.nextInt(), c = in.nextInt(), d = in.nextInt(), p = in.nextInt(),
				nl = in.nextInt(), np = in.nextInt();

		in.close();
		System.out.println(Math.min(Math.min(k * l / nl, c * d), p / np) / n);
	}
}

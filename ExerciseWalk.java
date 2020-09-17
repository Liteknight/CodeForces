import java.util.Scanner;

public class ExerciseWalk {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), x = in.nextInt(),
					y = in.nextInt(), x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();

			x = x - a + b;
			y = y - c + d;
			System.out.println(
					x >= x1 && x <= x2 && y >= y1 && y <= y2 && (x1 < x2 || a + b == 0) && (y1 < y2 || c + d == 0)
							? "Yes"
							: "No");
		}
		in.close();
	}
}

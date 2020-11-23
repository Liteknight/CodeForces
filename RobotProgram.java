import java.util.Scanner;

public class RobotProgram {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int x = in.nextInt(), y = in.nextInt();
			System.out.println(x == y ? x + y : 2 * Math.max(x, y) - 1);
		}
		in.close();
	}
}

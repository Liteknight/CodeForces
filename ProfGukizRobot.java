import java.util.Scanner;

public class ProfGukizRobot {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();

		in.close();
		System.out.println(Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
	}
}

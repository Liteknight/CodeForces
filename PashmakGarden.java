import java.util.Scanner;

public class PashmakGarden {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
		in.close();

		if (x1 == x2) {
			System.out.printf("%d %d %d %d", x1 + y1 - y2, y1, x1 + y1 - y2, y2);
		} else if (y1 == y2) {
			System.out.printf("%d %d %d %d", x1, x1 - x2 + y1, x2, x1 - x2 + y1);
			
		} else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
			System.out.printf("%d %d %d %d", x1, y2, x2, y1);
		} else {
			System.out.println(-1);
		}
	}
}

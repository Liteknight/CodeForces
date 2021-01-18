import java.util.Scanner;

public class KingEscape {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), ax = in.nextInt(), ay = in.nextInt(), bx = in.nextInt(), by = in.nextInt(),
				cx = in.nextInt(), cy = in.nextInt();

		in.close();
		System.out.println(
				(ax < Math.min(bx, cx) || ax > Math.max(bx, cx)) && (ay < Math.min(by, cy) || ay > Math.max(by, cy))
						? "YES"
						: "NO");
	}
}

import java.util.Scanner;

public class TwoRegularPolygons {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			System.out.println(in.nextInt() % in.nextInt() == 0 ? "YES" : "NO");
		}
		in.close();
	}
}

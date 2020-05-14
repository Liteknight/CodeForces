import java.util.Scanner;

public class PuzzlePieces {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt();
			System.out.println(n == 1 || m == 1 || n * m == 4 ? "YES" : "NO");
		}
		in.close();
	}
}

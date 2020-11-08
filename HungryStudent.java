import java.util.Scanner;

public class HungryStudent {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {

			int x = in.nextInt();
			System.out.println(x == 1 || x == 2 || x == 4 || x == 5 || x == 8 || x == 11 ? "NO" : "YES");
		}
		in.close();
	}
}

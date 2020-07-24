import java.util.Scanner;

public class LevkoTable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		in.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(i == j ? k + " " : "0 ");
			}
			System.out.println();
		}
	}
}

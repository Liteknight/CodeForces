import java.util.Scanner;

public class Soroban {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String n = in.next();
		for (int j = n.length() - 1; j >= 0; j--) {

			int x = Character.getNumericValue(n.charAt(j)), i;
			if (x >= 5) {
				System.out.print("-O|");
				x -= 5;
			} else {
				System.out.print("O-|");
			}
			for (i = 0; i < x; i++) {
				System.out.print("O");
			}
			System.out.print("-");
			for (i = 0; i < 4 - x; i++) {
				System.out.print("O");
			}
			System.out.println();
		}
		in.close();
	}
}

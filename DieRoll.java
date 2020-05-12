import java.util.Scanner;

public class DieRoll {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y = in.nextInt(), w = in.nextInt(), p = 6 - (Math.max(y, w) - 1);
		in.close();

		if (p == 0) {
			System.out.println("0/1");
		} else if (p == 1) {
			System.out.println("1/6");
		} else if (p == 2) {
			System.out.println("1/3");
		} else if (p == 3) {
			System.out.println("1/2");
		} else if (p == 4) {
			System.out.println("2/3");
		} else if (p == 5) {
			System.out.println("5/6");
		} else {
			System.out.println("1/1");
		}
	}
}

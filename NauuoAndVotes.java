import java.util.Scanner;

public class NauuoAndVotes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();

		if (x > y + z) {
			System.out.println('+');
			
		} else if (y > x + z) {
			System.out.println('-');
			
		} else if (x == y && z == 0) {
			System.out.println('0');
			
		} else {
			System.out.println('?');
		}
		in.close();
	}
}

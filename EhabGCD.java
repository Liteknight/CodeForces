import java.util.Scanner;

public class EhabGCD {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long x = in.nextLong();
			
			if (x % 2 != 0 || x == 2) {
				System.out.println("1 " + (x - 1));
			} else {
				System.out.println("2 " + (x - 2));
			}
		}
		in.close();
	}
}

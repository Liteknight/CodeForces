import java.util.Scanner;

public class FreeChocolate {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			long s = in.nextLong(), a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), x = s / c;
			System.out.println(x + x / a * b);
		}
		in.close();
	}
}

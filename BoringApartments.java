import java.util.Scanner;

public class BoringApartments {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			String x = in.next();
			System.out.println((Integer.valueOf(x.substring(0, 1)) - 1) * 10 + (x.length() * (x.length() + 1)) / 2);
		}
		in.close();
	}
}

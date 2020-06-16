import java.util.Scanner;

public class Rounding {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), r = n % 10;
		
		in.close();
		System.out.println(r < 5 ? n - r : n + (10 - r));
	}
}

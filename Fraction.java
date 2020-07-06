import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = n % 2 != 0 ? n / 2 : n / 2 % 2 != 0 ? n / 2 - 2 : n / 2 - 1;

		in.close();
		System.out.println(x + " " + (n - x));
	}
}

import java.util.Scanner;

public class CoinSum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), s = in.nextDouble();

		in.close();
		System.out.println((int) Math.ceil(s / n));
	}
}

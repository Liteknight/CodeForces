import java.util.Scanner;

public class CheapTravel {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a = in.nextInt(), b = in.nextInt();

		in.close();
		System.out.println(Math.min(n * a, n / m * b + Math.min(n % m * a, b)));
	}
}

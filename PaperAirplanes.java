import java.util.Scanner;

public class PaperAirplanes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double k = in.nextDouble(), n = in.nextDouble(), s = in.nextDouble(), p = in.nextDouble();

		in.close();
		System.out.println((int) Math.ceil(Math.ceil(n / s) * k / p));
	}
}

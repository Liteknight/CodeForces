import java.util.Scanner;

public class WizardsDemo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), x = in.nextDouble(), y = in.nextDouble();

		in.close();
		System.out.println((int) Math.max(0, Math.ceil(n * y / 100) - x));
	}
}

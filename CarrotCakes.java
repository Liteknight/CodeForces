import java.util.Scanner;

public class CarrotCakes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), t = in.nextDouble(), k = in.nextDouble(), d = in.nextDouble();

		in.close();
		System.out.println(d + t < Math.ceil(n / k) * t ? "YES" : "NO");
	}
}

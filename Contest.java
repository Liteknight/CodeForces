import java.util.Scanner;

public class Contest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(),
				m = Math.max(3 * a / 10, a - a / 250 * c), v = Math.max(3 * b / 10, b - b / 250 * d);

		in.close();
		System.out.println(m == v ? "Tie" : m > v ? "Misha" : "Vasya");
	}
}

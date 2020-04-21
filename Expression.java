import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		in.close();

		System.out.println(Math.max(Math.max(Math.max(
				a + b + c, (a + b) * c), a * (b + c)), a * b * c));
	}
}

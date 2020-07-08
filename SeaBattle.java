import java.util.Scanner;

public class SeaBattle {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long w1 = in.nextLong(), h1 = in.nextLong(), w2 = in.nextLong(), h2 = in.nextLong();

		in.close();
		System.out.println((w1 + h1 + h2 + 2) * 2);
	}
}

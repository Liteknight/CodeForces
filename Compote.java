import java.util.Scanner;

public class Compote {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt() / 2, c = in.nextInt() / 4;

		in.close();
		System.out.println(Math.min(Math.min(a, b), c) * 7);
	}
}

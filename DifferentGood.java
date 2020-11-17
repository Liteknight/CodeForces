import java.util.Scanner;

public class DifferentGood {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();

		in.close();
		System.out.println(n > 26 ? -1 : n - s.chars().distinct().count());
	}
}

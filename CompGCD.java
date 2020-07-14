import java.util.Scanner;

public class CompGCD {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String a = in.next(), b = in.next();

		in.close();
		System.out.println(a.equals(b) ? a : 1);
	}
}

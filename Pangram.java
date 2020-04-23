import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		@SuppressWarnings("unused")
		int n = in.nextInt();
		String s = in.next();

		System.out.println(s.toLowerCase().chars().distinct().count() == 26 ? "YES" : "NO");
		in.close();
	}
}

import java.util.Scanner;

public class VladikFlights {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt() - 1, b = in.nextInt() - 1;
		String s = in.next();

		in.close();
		System.out.println(s.charAt(a) == s.charAt(b) ? 0 : 1);
	}
}

import java.util.Scanner;

public class KingMoves {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int x = 0;

		if (s.charAt(0) == 'a' || s.charAt(0) == 'h') { x++; }
		if (s.charAt(1) == '1' || s.charAt(1) == '8') { x++; }
		
		if (x == 0) {
			System.out.println(8);
		} else {
			System.out.println(x == 1 ? 5 : 3);
		}
	}
}

import java.util.Scanner;

public class PetyaAndStrings {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String a = in.next().toLowerCase(), b = in.next().toLowerCase();
		int x = 0, i;

		for (i = 0; i < a.length(); i++) {
			if (a.charAt(i) < b.charAt(i) && x == 0) {
				x = -1;
			} else if (a.charAt(i) > b.charAt(i) && x == 0) {
				x = 1;
			}
		}
		System.out.println(x);
		in.close();
	}
}

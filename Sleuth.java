import java.util.Scanner;

public class Sleuth {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine().toLowerCase(), v = "aeiouy";
		in.close();

		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				System.out.println(v.contains(s.substring(i, i + 1)) ? "YES" : "NO");
				break;
			}
		}
	}
}

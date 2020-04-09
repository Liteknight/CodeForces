import java.util.Scanner;

public class HQ9Plus {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String p = in.next(), outputs = "NO";

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == 'H' || p.charAt(i) == 'Q' || p.charAt(i) == '9') {
				outputs = "YES";
			}
		}
		System.out.println(outputs);
		in.close();
	}
}

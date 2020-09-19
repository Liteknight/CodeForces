import java.util.Scanner;

public class ChewNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), n = "";
		in.close();

		for (int i = 0; i < s.length(); i++)
			n += i == 0 && (s.charAt(0) == '9' || s.charAt(0) == '0') ? 9
					: Math.min('9' - s.charAt(i), s.charAt(i) - '0');
		System.out.println(n);
	}
}

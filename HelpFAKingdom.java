import java.util.Scanner;

public class HelpFAKingdom {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		int i = s.indexOf('.');
		if (s.charAt(i - 1) == '9')
			System.out.println("GOTO Vasilisa.");
		else
			System.out.println(s.charAt(i + 1) - '0' < 5 ? s.substring(0, i)
					: s.substring(0, i - 1) + (s.charAt(i - 1) - '0' + 1));

	}
}

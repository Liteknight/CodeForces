import java.util.Scanner;

public class AlexBrokenContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int c = 0, i;
		in.close();

		for (i = 0; i < s.length(); i++) {
			if (i < s.length() - 2 && s.substring(i, i + 3).equals("Ann"))
				c++;
			if (i < s.length() - 3 && s.substring(i, i + 4).equals("Olya"))
				c++;
			if (i < s.length() - 4 && s.substring(i, i + 5).equals("Danil"))
				c++;
			if (i < s.length() - 4 && s.substring(i, i + 5).equals("Slava"))
				c++;
			if (i < s.length() - 5 && s.substring(i, i + 6).equals("Nikita"))
				c++;
		}
		System.out.println(c == 1 ? "YES" : "NO");
	}
}

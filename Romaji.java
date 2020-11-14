import java.util.Scanner;

public class Romaji {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), o = "YES";
		in.close();

		if ("aeioun".contains(s.substring(s.length() - 1))) {
			for (int i = 0; i < s.length(); i++)

				if (!"aeioun".contains(s.substring(i, i + 1)) && !"aeiou".contains(s.substring(i + 1, i + 2)))
					o = "NO";
		} else {
			o = "NO";
		}
		System.out.println(o);
	}
}
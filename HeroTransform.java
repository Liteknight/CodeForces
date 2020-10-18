import java.util.Scanner;

public class HeroTransform {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), t = in.next(), v = "aeiou", o = "Yes";
		in.close();

		if (s.length() != t.length()) {
			System.out.println("No");
		} else {
			for (int i = 0; i < s.length(); i++)
				if (v.contains(s.substring(i, i + 1)) != v.contains(t.substring(i, i + 1)))
					o = "No";
			System.out.println(o);
		}
	}
}

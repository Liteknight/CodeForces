import java.util.Scanner;

public class LuckySubstring {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a4 = 0, a7 = 0, i;
		in.close();

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '4')
				a4++;
			if (s.charAt(i) == '7')
				a7++;
		}
		System.out.println(a4 + a7 > 0 ? a4 >= a7 ? 4 : 7 : -1);
	}
}

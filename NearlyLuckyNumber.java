import java.util.Scanner;

public class NearlyLuckyNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String n = in.next();
		int lucks = 0, i = n.length();

		while (i-- > 0) {
			if (n.charAt(i) == '4' || n.charAt(i) == '7') { lucks++; }
		}

		System.out.println(lucks == 4 || lucks == 7 ? "YES" : "NO");
		in.close();
	}
}

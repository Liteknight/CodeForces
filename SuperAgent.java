import java.util.Scanner;

public class SuperAgent {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s1 = in.next(), s2 = in.next(), s3 = in.next();

		in.close();
		System.out.println(s1.charAt(0) == s3.charAt(2) && s1.charAt(1) == s3.charAt(1) && s1.charAt(2) == s3.charAt(0)
				&& s2.charAt(0) == s2.charAt(2) ? "YES" : "NO");
	}
}

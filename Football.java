import java.util.Scanner;

public class Football {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), str = "NO";

		for (int i = 0; i < s.length() - 6; i++) {
			
			if (s.length() > 6 && (s.substring(i, i + 7).equals("0000000") || s.substring(i, i + 7).equals("1111111"))) {
				str = "YES";
			}
		}
		System.out.println(str);
		in.close();
	}
}

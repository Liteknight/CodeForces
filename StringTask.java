import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), str = "";

		for (int i = 0; i < s.length(); i++) {
			String c = s.substring(i, i + 1).toLowerCase();

			if (!(c.equals("a") || c.equals("o") || c.equals("y") || c.equals("e") || c.equals("u") || c.equals("i"))) {
				str += '.' + c;
			}
		}
		System.out.println(str.toLowerCase());
		in.close();
	}
}

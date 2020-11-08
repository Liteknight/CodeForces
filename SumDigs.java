import java.util.Scanner;

public class SumDigs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String n = in.next();
		in.close();
		int c = 0, i;

		while (n.length() > 1) {
			int s = 0;
			for (i = 0; i < n.length(); i++)
				s += Integer.valueOf(n.substring(i, i + 1));
			c++;
			n = String.valueOf(s);
		}
		System.out.println(c);
	}
}

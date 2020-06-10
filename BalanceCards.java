import java.util.Scanner;

public class BalanceCards {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt();
		float s = 0;

		while (n-- > 0) {
			String d = in.next();
			
			if (d.charAt(0) == '-') {
				s -= Integer.parseInt(d.substring(1));
			} else {
				s += Integer.parseInt(d);
			}
		}
		in.close();
		System.out.println((int) Math.ceil(Math.abs(s / x)));
	}
}

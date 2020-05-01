import java.util.Scanner;

public class IlyaBankAccount {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		if (n >= 0) {
			System.out.println(n);
			
		} else {
			String s = String.valueOf(n);
			
			int a = Integer.valueOf(s.substring(0, s.length() - 1)),
				b = Integer.valueOf(s.substring(0, s.length() - 2) + s.charAt(s.length()-1));
			
			System.out.println(Math.max(a, b));
		}
	}
}

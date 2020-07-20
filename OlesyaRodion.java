import java.util.Scanner;

public class OlesyaRodion {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String t = in.next();
		in.close();

		while (t.length() < n) {
			t += "0";
		}
		System.out.println(t.length() == n ? t : -1);
	}
}

import java.util.Scanner;

public class MidContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s1 = in.next(), s2 = in.next();
		in.close();
		
		int h1 = Integer.valueOf(s1.substring(0, 2)), m1 = Integer.valueOf(s1.substring(3)),
				h2 = Integer.valueOf(s2.substring(0, 2)), m2 = Integer.valueOf(s2.substring(3)), m3 = 0;

		m3 = ((m2 + h2 * 60) - (m1 + h1 * 60)) / 2 + m1 + h1 * 60;
		System.out.printf("%02d:%02d", m3 / 60, m3 % 60);
	}
}
import java.util.Scanner;

public class NYDays {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String s = in.nextLine();

		in.close();
		System.out.println(s.charAt(s.length() - 1) == 'k' ? x == 5 || x == 6 ? 53 : 52 : x < 30 ? 12 : x < 31 ? 11 : 7);
	}
}

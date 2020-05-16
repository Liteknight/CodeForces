import java.util.Scanner;

public class NearestInterestingN {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), s = 1, i;
		in.close();

		while (s % 4 != 0) {
			s = 0;
			String as = String.valueOf(a);
			
			for (i = 0; i < as.length(); i++) {
				s += Integer.parseInt(as.substring(i, i + 1));
			}
			if (s % 4 != 0) {
				a++;
			}
		}
		System.out.println(a);
	}
}

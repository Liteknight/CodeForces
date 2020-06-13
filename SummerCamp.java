import java.util.Scanner;

public class SummerCamp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		in.close();
		
		String s = "";
		for (i = 1; i <= n; i++) {
			s += i;
		}
		System.out.println(s.charAt(n - 1));
	}
}

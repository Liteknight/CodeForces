import java.util.Scanner;

public class incARG {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();

		in.close();
		System.out.println(s.indexOf('0') >= 0 ? s.indexOf('0') + 1 : n);
	}
}

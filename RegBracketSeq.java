import java.util.Scanner;

public class RegBracketSeq {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

		in.close();
		System.out.println(a == d ? c > 0 ? a > 0 ? 1 : 0 : 1 : 0);
	}
}

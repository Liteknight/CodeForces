import java.util.Scanner;

public class DefiniteGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		in.close();
		System.out.println(v == 2 ? 2 : 1);
	}
}

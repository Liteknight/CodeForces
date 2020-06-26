import java.util.Scanner;

public class DTLearnMath {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		in.close();
		System.out.println(n % 2 == 0 ? (n - 8) + " " + 8 : (n - 9) + " " + 9);
	}
}

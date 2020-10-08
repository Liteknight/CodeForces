import java.util.Scanner;

public class ModExp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();

		in.close();
		System.out.println((long) (m % Math.pow(2, n)));
	}
}

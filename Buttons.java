import java.util.Scanner;

public class Buttons {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		in.close();
		System.out.println(n * (n * n + 5) / 6);
	}
}

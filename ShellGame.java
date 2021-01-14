import java.util.Scanner;

public class ShellGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt();
		in.close();

		String[] a = { "012", "102", "120", "210", "201", "021" };
		System.out.println(a[n % 6].charAt(x));
	}
}

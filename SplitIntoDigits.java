import java.util.Scanner;

public class SplitIntoDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		System.out.println(n);
		while (n-- > 0) {
			System.out.print("1 ");
		}
	}
}

import java.util.Scanner;

public class APlusB {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			System.out.println(in.nextInt() + in.nextInt());
		}
		in.close();
	}
}

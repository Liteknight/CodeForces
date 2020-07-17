import java.util.Scanner;

public class FancyFence {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int a = in.nextInt();
			System.out.println(360 % (180 - a) == 0 ? "YES" : "NO");
		}
		in.close();
	}
}

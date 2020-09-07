import java.util.Scanner;

public class LCMP {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			long l = in.nextLong(), r = in.nextLong();
			System.out.println(l * 2 > r ? "-1 -1" : l + " " + (l * 2));
		}
		in.close();
	}
}

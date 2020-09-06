import java.util.Scanner;

public class YAInt {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			long a = in.nextLong(), b = in.nextLong();
			System.out.println((long) Math.ceil(Math.abs(a - b) / 10.0));
		}
		in.close();
	}
}

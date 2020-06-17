import java.util.Scanner;

public class BuyShovel {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), r = in.nextInt(), x = k, o = 1;
		in.close();
		
		while (x % 10 != 0 && x % 10 != r) {
			o++;
			x = k * o;
		}
		System.out.println(o);
	}
}
import java.util.Scanner;

public class EvenOdds {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), k = in.nextLong();
		
		long h = (long) Math.ceil((double) n / 2);
		System.out.println(k <= h ? k * 2 - 1 : (k - h) * 2);
		in.close();
	}
}
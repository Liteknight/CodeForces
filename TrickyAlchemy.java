import java.util.Scanner;

public class TrickyAlchemy {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong(), x = in.nextLong(), y = in.nextLong(), z = in.nextLong(),
				na = x * 2 + y, nb = z * 3 + y;

		in.close();
		System.out.println(Math.max(na - a, 0) + Math.max(nb - b, 0));
	}
}

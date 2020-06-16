import java.util.Scanner;

public class Partition {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), o = 0;
		
		while (n-- > 0) {
			o += Math.abs(in.nextInt());
		}
		in.close();
		System.out.println(o);
	}
}

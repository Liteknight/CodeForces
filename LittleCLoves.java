import java.util.Scanner;

public class LittleCLoves {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), o = n - 2;

		in.close();
		System.out.println(o % 3 == 0 ? (o - 1) + " 2 1" : o + " 1 1");
	}
}

import java.util.Scanner;

public class SaveLuke {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double d = in.nextDouble(), l = in.nextDouble(), v1 = in.nextDouble(), v2 = in.nextDouble();

		in.close();
		System.out.println((l - d) / (v1 + v2));
	}
}

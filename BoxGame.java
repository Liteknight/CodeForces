import java.util.Scanner;

public class BoxGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n1 = in.nextDouble(), n2 = in.nextDouble();
		
		in.nextLine();
		in.close();
		System.out.println(n1 > n2 ? "First" : "Second");
	}
}

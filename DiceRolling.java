import java.util.Scanner;

public class DiceRolling {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;
		
		for (i=0; i<t; i++) {
			int x = in.nextInt();
			System.out.println(x / 2);
		}
		in.close();
	}
}

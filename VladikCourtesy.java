import java.util.Scanner;

public class VladikCourtesy {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = 1;
		while (a >= 0 && b >= 0) {

			if (a - c >= 0) {
				a -= c;
				c++;
			} else {
				System.out.println("Vladik");
				break;
			}
			if (b - c >= 0) {
				b -= c;
				c++;
			} else {
				System.out.println("Valera");
				break;
			}
			
		}
		in.close();
	}
}

import java.util.Scanner;

public class SpecTastesAndre {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {		
			int n = in.nextInt();
			
			while (n-- > 0)
				System.out.print("1 ");
			System.out.println();
		}
		in.close();
	}
}

import java.util.Scanner;

public class AddOddSubtractEven {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;
		
		for (i=0; i<t; i++) {
			
			int a = in.nextInt(), b = in.nextInt(), num = 0;
			
			while (a != b) {

				if (((b - a) % 2 != 0 && b > a) || ((b - a) % 2 == 0 && a > b)) {
					a = b;
					num++;
					
				} else { a++; num++; }
			}
			System.out.println(num);
		}
		in.close();
	}
}

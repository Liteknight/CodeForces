import java.util.Scanner;

public class RestoringThreeNumbers {
	public static void main(String[] args) {
		
		int x1, x2, x3, x4, a, b, c;
		Scanner sc = new Scanner(System.in);
		
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		x4 = sc.nextInt();
		
		if (x1 > x2 && x1 > x3 && x1 > x4) {
			a = x1 - x2;
			b = x1 - x3;
			c = x1 - x4;
		} else if (x2 > x1 && x2 > x3 && x2 > x4) {
			a = x2 - x1;
			b = x2 - x3;
			c = x2 - x4;
		} else if (x3 > x1 && x3 > x2 && x3 > x4) {
			a = x3 - x1;
			b = x3 - x2;
			c = x3 - x4;
		} else {
			a = x4 - x1;
			b = x4 - x2;
			c = x4 - x3;		
		}
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}
}
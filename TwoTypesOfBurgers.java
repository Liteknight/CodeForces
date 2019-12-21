
import java.util.Scanner;

public class TwoTypesOfBurgers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(), j;
		
		for (j=0; j<t; j++) {
			
			int b = sc.nextInt(), p = sc.nextInt(), f = sc.nextInt(), h = sc.nextInt(), c = sc.nextInt(), profit=0;
			
			while (b > 1) {
				
				if ((h > c || (h < c && f == 0) || h == c) && p > 0) {

					profit += h;
					p--;

				} else if ((c > h || (c < h && p == 0) || h == c) && f > 0) {

					profit += c;
					f--;

				}
				b -= 2;
			}
			System.out.println(profit);
		}
		sc.close();
	}
}
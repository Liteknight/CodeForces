import java.util.Scanner;

public class PoliceRecruits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), r = 0, c = 0;

		while (n-- > 0) {
			int x = in.nextInt();			
			if (x > 0) {
				r += x;				
			} else {
				if (r > 0) {
					r--;					
				} else { c++; }
			}
		}
		in.close();
		System.out.println(c);
	}
}

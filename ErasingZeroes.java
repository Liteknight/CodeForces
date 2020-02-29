
import java.util.Scanner;

public class ErasingZeroes {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt(), i;
		for (i=0; i<t; i++) {
			
			String s = in.next();
			int j, count = 0, sum = 0;
			boolean afterOne = false, afterZero = false;
			
			for (j=0; j<s.length(); j++) {
				
				if (afterOne) {
					
					if (s.charAt(j) == '0') {
						count++;
						afterZero = true;
						
					} else if (s.charAt(j) == '1' && afterZero) {
						sum += count;
						count = 0;
						afterOne = true;
						afterZero = false;
					}					
				} else if (s.charAt(j) == '1') { afterOne = true; }
			}
			System.out.println(sum);
		}
		in.close();
	}
}

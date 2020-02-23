
import java.util.Scanner;

public class JapaneseCrossword {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, counter=0, nums=0;
		String string = in.next(), decoded = "";
		
		for (i=0; i<n; i++) {
			
			if (string.charAt(i) == 'B') { counter++; }
			
			if (string.charAt(i) == 'W' || i == n-1) {
				
				if (counter > 0) {
					decoded += counter + " ";
					nums++;
				}
				counter = 0;
			}
		}
		if (decoded.equals("")) { System.out.println(0); }
		
		else {
			System.out.println(nums);
			System.out.println(decoded);
		}
		in.close();
	}
}

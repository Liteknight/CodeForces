
import java.util.Scanner;

public class TanyaStairway {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, stairways=0, last=1;
		String steps = "";
		
		for (i=0; i<n; i++) {
			int a = in.nextInt();
			
			if (a == 1 && i > 0) {
				stairways++;
				steps += last + " ";
				
			} else if (a == 1) { stairways++; }
			
			last = a;			
			if (i == n-1) { steps += last; }
		}
		System.out.println(stairways + "\n" + steps);
		
		in.close();
	}
}

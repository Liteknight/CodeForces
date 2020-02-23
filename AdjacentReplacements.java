import java.util.Scanner;

public class AdjacentReplacements {

	public static void main(String[] args) {

		Scanner in =  new Scanner(System.in);
		
		int n = in.nextInt(), i;
		
		for (i = 0; i < n; i++) {
			
			int a = in.nextInt();
			
			if (a % 2 == 0) { a-= 1; }
			
			System.out.print(a + " ");
		}
		in.close();
	}

}

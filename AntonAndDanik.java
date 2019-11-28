import java.util.Scanner;

public class AntonAndDanik {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), a=0, d=0, j;
		String s = sc.next();
		
		for (j=0; j<n; j++) {
			
			if (s.charAt(j) == 'A') {
				a++;
				
			} else if (s.charAt(j) == 'D') {
				d++;
			}
		}
		if (a > d) {
			System.out.println("Anton");
			
		} else if (d > a) {
			System.out.println("Danik");
			
		} else {
			System.out.println("Friendship");
		}
		sc.close();
	}
}
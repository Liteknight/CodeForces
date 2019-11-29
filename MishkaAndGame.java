import java.util.Scanner;

public class MishkaAndGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), j, m, c, m_wins=0, c_wins=0;
		
		for (j=0; j<n; j++) {
			
			m = sc.nextInt();
			c = sc.nextInt();
			
			if (m > c) {
				m_wins++;
				
			} else if (c > m) {
				c_wins++;
			}
		}		
		if (m_wins > c_wins) {
			System.out.println("Mishka");
			
		} else if (m_wins < c_wins) {
			System.out.println("Chris");
			
		} else {
			System.out.println("Friendship is magic!^^");
		}		
		sc.close();
	}
}
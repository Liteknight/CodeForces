import java.util.Scanner;

public class BlackSquare {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), a4 = sc.nextInt(), calories=0, j;
		String s = sc.next();
		
		for (j=0; j<s.length(); j++) {
			
			if (s.charAt(j) == '1') {
				calories += a1;
				 
			} else if (s.charAt(j) == '2') {
				calories += a2;
				
			} else if (s.charAt(j) == '3') {
				calories += a3;
				
			} else if (s.charAt(j) == '4') {
				calories += a4;
			}
		}
		
		System.out.println(calories);
		sc.close();
	}
}
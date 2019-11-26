import java.util.Scanner;

public class Cards {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt(), i, zeros=0, ones=0;
		String str = sc.next(), restored="";
		
		for (i=0; i<len; i++) {
			
			if (str.charAt(i) == 'z') {
				zeros++;
				
			} else if (str.charAt(i) == 'n') {
				ones++;
			}
		}
		
		for (i=0; i<ones; i++) {
			restored += "1 ";
		}
		for (i=0; i<zeros; i++) {
			restored += "0 ";
		}
		
		System.out.println(restored);
		sc.close();
	}
}
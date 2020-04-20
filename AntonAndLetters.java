import java.util.Scanner;

public class AntonAndLetters {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		String s = in.nextLine().replaceAll("[{}, ]","");	
		
		System.out.println(s.chars().distinct().count());		
		in.close();
	}
}

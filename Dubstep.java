import java.util.Scanner;

public class Dubstep {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();

		String[] arr1 = s.split("WUB");

		for (String word : arr1) {
			
			if (!word.equals("")) { System.out.print(word + " "); }			
		}
		in.close();
	}
}

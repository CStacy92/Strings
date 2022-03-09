package stringCoding;
import java.util.Scanner;

public class RotateString {
	public static void rotate(Scanner s) {
		
		System.out.println("***********RotateString************");
		
		System.out.print("Enter a word: ");
		String word = s.nextLine();
		System.out.print("How many rotations? ");
		
		char[] letterArray = word.toCharArray();
		int numRotations = s.nextInt();
		char [] newArray = new char[letterArray.length];
		
		while (numRotations > 0) {
			int i = letterArray.length-1;
			char last = letterArray[i];
			while(i > 0) {
				newArray[i] = letterArray[i-1];
				i--;
			}
			newArray[0] = last;
			letterArray = newArray;
			numRotations--;
		}
		

		System.out.println("Rotated String: ");
		for (char c : letterArray) {			
			System.out.print(c);
		}
	}

}

package stringCoding;

import java.util.Scanner;

public class Words {

	public static void letterCount(Scanner s) {
		
		System.out.println("**************Words***************");
		int count = 0;
		String userSentence;
		String [] words;
		
		//Prompt user for input
		System.out.print("Enter a sentence: ");
		userSentence = s.nextLine();
		words = userSentence.split(" ");
		
		count = words.length;
		System.out.println(count);
		
	}
}

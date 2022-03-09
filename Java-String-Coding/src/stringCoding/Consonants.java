package stringCoding;

import java.util.Scanner;

public class Consonants {

	public static void consonantManipulation(Scanner s){

		System.out.println("************Consonants*************");
		
		//Prompt user for input
		System.out.println("Enter a sentence: ");
		String userSentence = s.nextLine();
		
	
	char [] sentenceChars = userSentence.toLowerCase().toCharArray();
	int i = 0;
	
	for (char c : sentenceChars) {
		switch (c) {
		case 'a': break;
		case 'e': break;
		case 'i': break;
		case 'o': break;
		case 'u': break;
		case ' ': break;
		case '.': break;
		default: i++;
			userSentence = userSentence.replace(c, '*');
			break;
		}		
	}
	
	//Display consonant count
	System.out.println("Number of consonants: " + i);
	
	//Display sentence with consonants replaced
	System.out.println("Your sentence with consonants replaced by '*' is : \n" + userSentence);
	

	}
}

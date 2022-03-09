package stringCoding;
import java.util.Scanner;
public class Vowels {
	public static int vowelCount(Scanner s){
		
		System.out.println("************Vowels*************");
		
		System.out.println("Enter a sentence: ");
		String userSentence = s.nextLine();
	
	char[] sentenceChars = userSentence.toCharArray();
	int i = 0;
	
	for (char c : sentenceChars) {
		switch (c) {
		case 'a': i++;
			break;
		case 'e': i++;
			break;
		case 'i': i++;
			break;
		case 'o': i++;
			break;
		case 'u': i++;
			break;
		}
	}
	return i;
	}
	
}

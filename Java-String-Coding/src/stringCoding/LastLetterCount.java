package stringCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class LastLetterCount {
	public static void wordManipulation(Scanner s) {
		
		//TO DO: ADD ERROR HANDLING FOR MISSING 'S' OR 'Y' WORD
		
		System.out.println("****************LastLetterCount******************");
		//Prompt user for input
		System.out.print("Enter a sentence: ");
		String userSentence = s.nextLine();
		String [] words = userSentence.split(" ");
		int numEndingInS = 0;
		int numEndingInY = 0;
		
		ArrayList <String> sWords = new ArrayList<String>();
		ArrayList <String> yWords = new ArrayList<String>();
		
		for (String word : words) {
			int i = word.length()-1;
			
			if ('s' == word.charAt(i)) {
				numEndingInS ++;
				sWords.add(word);
			}
			
			else if ('y' == word.charAt(i)) {
				numEndingInY ++;
				yWords.add(word);
			}
		}
		
		System.out.println("Number of words ending in 's': " + numEndingInS);
		System.out.println("Number of words ending in 'y': " + numEndingInY);
		

		

		//IMPROVEMENTS NEEDED
		String firstSWord = sWords.get(0);
		String firstYWord = yWords.get(0);
		
		userSentence = userSentence.replace(firstSWord, "-");
		userSentence = userSentence.replace(firstYWord, "#");
		userSentence = userSentence.replace("-", firstYWord);
		userSentence = userSentence.replace("#", firstSWord);
		
		System.out.println("Switched first occurrence of words ending in 's' and 'y': ");
		System.out.println(userSentence);
		
		
		
	}

}

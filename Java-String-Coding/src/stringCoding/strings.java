package stringCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numVowels = Vowels.vowelCount(s);
		System.out.println(numVowels);
		
		boolean checkForPalindrome = Palindrome.isPalindrome(s);
		System.out.println(checkForPalindrome);
		
		Words.letterCount(s);
		Consonants.consonantManipulation(s);
		LastLetterCount.wordManipulation(s);
		RotateString.rotate(s);
		TraverseString.uniqueChars(s);
		Occurrences.count();
		
		s.close();
	}

}

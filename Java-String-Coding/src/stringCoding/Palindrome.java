package stringCoding;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(Scanner s) {
		
		System.out.println("************Palindrome*************");
		
		boolean palindrome = false;
		String word;
		StringBuilder sb = new StringBuilder();
		String reversedWord;
		
		//Prompt user for input
		System.out.print("Enter a word: ");
		word = s.nextLine();
		
		reversedWord = sb.append(word).reverse().toString();
		
		if (word.equals(reversedWord)) {
			palindrome = true;
		} else {
			return palindrome;
		}
		
		return palindrome;
	}

}

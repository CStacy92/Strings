package stringCoding;


import java.util.Scanner;

public class TraverseString {

	public static void uniqueChars(Scanner s) {
		System.out.println("***********TraverseString***********");
		
		System.out.println("Enter a sentence: ");
		char[] userSentence = s.nextLine().toLowerCase().toCharArray();
		String unique = "";
		
		for(int i = 0; i < userSentence.length; i ++) {
			String c = Character.toString(userSentence[i]);
			if (!unique.contains(c)){
				unique += c;
			}
			
		}
		System.out.println(unique);
	}
}
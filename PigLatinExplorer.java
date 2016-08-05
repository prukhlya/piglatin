package day4PigLatin;

import java.util.Scanner;

public class PigLatinExplorer {

	public static void main(String[] args) {

		System.out.println("On the next line, enter a word to translate to Pig Latin:");

		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();
		StringBuilder modUserInput = new StringBuilder(userInput);

		
	//	char[] input = userInput.toCharArray()
	//	char[] vowel = {'a', 'e', 'i', 'o', 'u'}
		
	//	for (int x = 0; x < input.length; x++) {
		
		char firstLetter = modUserInput.charAt(0);

		modUserInput.deleteCharAt(0);
		System.out.println(modUserInput.append(firstLetter) + "-ay");

	}

}


/* char[] vowel = {'a', 'e', 'i', 'o', 'u'}

for (int i = 1; i <= vowel; i++);

public static boolean startWithVowel(char vowelLoop) {
	boolean isItVowel = false;
	if (vowelLoop == vowelLoop) {
		isItVowel = true;
		
	}
	return isItVowel;
	
	} */
















package day4PigLatin;

import java.util.Scanner;

public class PigLatinAdventure {

	public static void main(String[] args) {
		System.out.println("Type in your sentence:");	
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String[] inputArray = userInput.split(" ");  //  "\\W+" all the stuff thats not a letter/number?

		for (int i = 0; i < inputArray.length; i++) {
				System.out.print(translate(inputArray[i]));
	}
}
	public static String translate(String word) {
		
		char firstLetter = word.charAt(0);
		String firstToString = Character.toString(firstLetter);
		
		//System.out.println("Here is your translation:");
		
		switch (firstToString.toLowerCase()) {
		case "a":
			return word = (word.toLowerCase() + "-yay ");
			
		case "e":
			return word = (word.toLowerCase() + "-yay ");
			
		case "i":
			return word = (word.toLowerCase() + "-yay ");
			
		case "o":
			return word = (word.toLowerCase() + "-yay ");
			
		case "u":
			return word = (word.toLowerCase() + "-yay ");
			
		default:
			StringBuilder modUserInput = new StringBuilder(word.toLowerCase());
			modUserInput.deleteCharAt(0);
			return word = (modUserInput.append(firstLetter) + "-ay ");

	}
}
}








//System.out.println("Type in the next word in your sentence:"); //prompt after first word entry
//System.out.println(firstInput);	
//
//while (sc.hasNext()) {
//	String newInput = sc.nextLine();
//	if(newInput.equals(".")) {
//		break;
//	}
//	System.out.println("Type in the next word in your sentence:");
//	System.out.println(newInput);
//	//System.out.println(newInput);



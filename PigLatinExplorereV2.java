package day4PigLatin;

import java.util.Scanner;

public class PigLatinExplorereV2 {
		
	public static void main(String[] args) {
		
		System.out.println("On the next line, enter a word to translate to Pig Latin:");
		Scanner sc = new Scanner(System.in);
		
		String userInput = sc.nextLine();
		char firstLetter = userInput.charAt(0);
		char secondLetter = userInput.charAt(1);
		String firstToString = Character.toString(firstLetter);
		
		System.out.println("Here is your translation:");
		
		switch (firstToString.toLowerCase()) {
		case "a":
			System.out.println(userInput.toLowerCase() + "-yay");
			break;
		case "e":
			System.out.println(userInput.toLowerCase() + "-yay");
			break;
		case "i":
			System.out.println(userInput.toLowerCase() + "-yay");
			break;
		case "o":
			System.out.println(userInput.toLowerCase() + "-yay");
			break;
		case "u":
			System.out.println(userInput.toLowerCase() + "-yay");
			break;
		default:
			if(userInput.charAt(1)!='a'|| userInput.charAt(1)!='e'|| userInput.charAt(1)!='i'|| userInput.charAt(1)!='o'|| userInput.charAt(1)!='u');
			
				StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
				modUserInput.deleteCharAt(0);
				modUserInput.deleteCharAt(0);
				System.out.println(modUserInput.append(firstLetter).append(secondLetter) + "-ay");
			 
				
				
			//StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
			//modUserInput.deleteCharAt(0);
				//System.out.println(modUserInput.append(firstLetter) + "-ay");

		}
	}
}	
	
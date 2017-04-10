package br.com.tres.main;

import br.com.tres.stream.IStream;
import br.com.tres.stream.StreamImpl;

public class StartMain {
 
	private static final char NULL = 0;

	private static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
	 
	public static void main(String[] args) {

		if(args.length==0){
			System.out.println("Error: No parameter");
			return;
		}
		char result = firstChar(new StreamImpl(args[0]));
		
		if(NULL != result){

			System.out.println(result);
			return;
		}
		
		 
		System.out.println("No result");
		
	}

	 
	public static char firstChar(IStream input) {

		int totalRead = 0;

		String first = String.valueOf(input.getNext());

		totalRead++;

		boolean isAntecessorVowel = isVowel(first.charAt(0));

		boolean isPreAntecessorVowel = isAntecessorVowel;

		char current;

		while (input.hasNext()) {

			current = input.getNext();

			totalRead++;
		 
			if (isVowel(current)) {

				if (!isAntecessorVowel && isPreAntecessorVowel) {			 

						if(isUnique(current, input.getInputStream(), totalRead)){
						 
						return current ;
						} 
					 
				}
			}
			isPreAntecessorVowel = isAntecessorVowel;
			isAntecessorVowel = isVowel(current);
		}

		return 0;
	}

	private static boolean isUnique(char caracter, String input,int startPosition) {

		for (int i = startPosition; i < input.length(); i++) {

			if (caracter == input.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check if the character is a vowel	 
	 * @param character   	
	 * @return true if the character is a vowel or false if its a consonant 
	 */
	private static boolean isVowel(char character) {

		for (int i = 0; i < vowels.length; i++) {
			if (Character.toLowerCase(character) == Character.toLowerCase(vowels[i])) {
				return true;
			}
		}
		return false;
	}
}

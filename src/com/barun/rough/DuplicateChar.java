/**
 * 
 */
package com.barun.rough;

/**
 * @author bibhu
 * This program is written with the hlep of char array and loops.
 * if we want to write it in C/C++ we can simply change the syntax.
 *
 */
public class DuplicateChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		removeDuplicateChar("aaabbbac");
		removeDuplicateChar("a");
		removeDuplicateChar("thelexash");

	}

	private static void removeDuplicateChar(String word) {
		//Validate the string before proceeding further  
		if(checkAlphabets(word)){
			//if string is a valid string continue the operation
			
			//convert String into char array
			char [] wordToCharArray = word.toCharArray();
			//create another array to store the unique element
			char[] uniqueChar = new char[wordToCharArray.length];
			int uniqueCharSize = 0;
			for(int i = 0; i < wordToCharArray.length; i++){
				//check if the element is unique in the array if no then add into the unique char array
				if(!checkElementExistsInArray(wordToCharArray, uniqueChar, i)){
					//find the last element of the unique char aaray
					int j = 0;
					while('\u0000' != uniqueChar[j]){
						j++;
					}
					//put the unique char value in the array
					uniqueChar[j] = wordToCharArray[i];
				}
			}
			//print the output in the (unique char, no of non unique element)
			System.out.print("(");
			for(int k = 0; k < uniqueChar.length;k++){
				if('\u0000' != uniqueChar[k]){
					uniqueCharSize++;
					System.out.print(uniqueChar[k]);
				}
			}
			System.out.print(",");
			System.out.print(wordToCharArray.length-uniqueCharSize);
			System.out.print(")");
		} else {
			//if string is not valid display an error message
			System.out.println("String should contain only alphabates");
		}
	}

	/**
	 * @param wordToCharArray
	 * @param uniqueChar
	 * @param i
	 */
	private static boolean checkElementExistsInArray(char[] wordToCharArray, char[] uniqueChar, int i) {
		for(int j = 0; j < uniqueChar.length; j++){
			if(wordToCharArray[i] == uniqueChar[j]){
				//Already exists so dont add 
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @param word
	 * @return
	 */
	private static boolean checkAlphabets(String word) {
		//check if the string contains only alphabets 
		return word.matches ("[a-zA-Z]+\\.?");	
	}

}

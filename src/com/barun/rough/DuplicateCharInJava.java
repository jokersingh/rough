/**
 * 
 */
package com.barun.rough;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bibhu
 *
 */
public class DuplicateCharInJava {

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
			//convert string to char array
			char[] wordToCharArray = word.toCharArray(); 
			//create a set to store unique element. 
			//Set is a data structure which holds only unique element
			Set uniqueChars = new HashSet();
			// Add element into the set
			for(int i=0;i < wordToCharArray.length;i++){
				uniqueChars.add(wordToCharArray[i]);
			}
			//print the output in the (unique char, no of non unique element)
			System.out.print("(");
			Iterator it = uniqueChars.iterator();
			while(it.hasNext()){
				System.out.print(it.next());
			}
			System.out.println(","+(word.length()-uniqueChars.size())+")");
		}else {
			//if string is not valid display an error message
			System.out.println("String should contain only alphabates");
		}
		
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

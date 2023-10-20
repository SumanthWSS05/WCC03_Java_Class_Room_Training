package inbuiltClasses;

import java.util.Arrays;
import java.util.Scanner;

public class S13 {

	public static void main(String[] args) {
		
		Scanner sc ;
		String s1 = "Library";
		
		String s2 = "Listen";
	
		char[] word1 = s1.toLowerCase().toCharArray();
		char[] word2 = s2.toLowerCase().toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.mismatch(word1, word2) == -1)
			System.out.println("It is Anagram");
		else
			System.out.println("It is not an Anagram");
		
	}
}

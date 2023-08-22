package com.java.logical.coding.String;
/*

	public class CountVowel {

		public static void main(String[] args) {
			
			String s = "amarjeet";
			int vowel=0;
			
			for (int i = 0; i < s.length(); i++) { 
	                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='o') 
	                       vowel++; 
			}
	  
		System.out.println("Vowels: " + vowel);

	}
	}

*/

class CountVowel{
	public static void main(String[] args) {
		String str="amArjeEt";
		int vowel=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'
		|| str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='e')
				vowel++;
		}
		System.out.println("vowel= "+vowel);
	}
}
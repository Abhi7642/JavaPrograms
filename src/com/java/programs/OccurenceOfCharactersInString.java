package com.java.programs;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		
		String str= "java";
		int len=str.length();
		System.out.println(len);
		String str_without_a=str.replace("a","");
		System.out.println(str_without_a);
		int new_len=str_without_a.length();
		int occurence_of_a=(len-new_len);
		System.out.println(occurence_of_a);

	}

}

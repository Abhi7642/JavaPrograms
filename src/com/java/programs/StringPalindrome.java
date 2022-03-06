package com.java.programs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,rev="";
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		/*char ch[]=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);*/
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
